package com.bpi;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import javafx.util.Pair;


/**
 * Created by Bear on 19/09/2016.
 */
public class EHLLAPIImpl {
    private EHLLAPInterface instance = EHLLAPInterface.INSTANCE;
    private final String PS_ID = "A";
    private final int PRESENTATION_SPACE_LENGTH = 3564;
    private final int OIA_SIZE = 104;
    private final int MAX_WAITING_MINS = 10; // max waiting time
    private final int PS_SIZE = 1920;
    private final char INPUT_INHIBITED = 'X';
    private final char OIA_ONLINE = 207;
    private final String CLEAR_PS_KS = "@C";
    private final String ENTER_KS = "@E";
    private final String NEWLINE_KS = "@N";
    private final String NOT_APPLIC = "91";
    private final String HOST_TIMED = "92";
    private final String NOT_HOST = "90";

    Logger logger = LogManager.getLogger(EHLLAPIImpl.class);

    public ReturnCode connect_host(String ps_id){
        int function_number = 1;
        byte[] dataBufferArray;
//        ps_id = "A"; // Always connect to Session A

        dataBufferArray = ps_id.getBytes();

        IntBuffer functionNumber = IntBuffer.wrap(new int[] {function_number});
        ByteBuffer dataBuffer = ByteBuffer.wrap(dataBufferArray);
        IntBuffer bufferLength = IntBuffer.wrap(new int[] {dataBufferArray.length});
        IntBuffer returnCode = IntBuffer.wrap(new int[] {0});

        NativeLong resulta = instance.hllapi(functionNumber, dataBuffer, bufferLength, returnCode);

        ReturnCode result = ReturnCode.fromNumber(resulta.intValue());
        logger.info("connect_host status: " + result.getStatusNo());
        switch(result){
            case SUCCESS:
                return ReturnCode.SUCCESS;
            case TARGET_PRESENTATION_BUSY:
                return ReturnCode.TARGET_PRESENTATION_BUSY;
            case FUNCTION_EXECUTION_INHIBITED_OTHER:
                return ReturnCode.FUNCTION_EXECUTION_INHIBITED_OTHER;
            default:
                return ReturnCode.FAILURE;
        }

    }

    public ReturnCode reset_system(){
        int function_number = 21;
        byte[] dataBufferArray;
        String data = "A"; // kahit ano nalang dito

        try{
            dataBufferArray = data.getBytes("UTF-8");
        }catch(UnsupportedEncodingException e){
            dataBufferArray = null;
        }

        IntBuffer functionNumber = IntBuffer.wrap(new int[] {function_number});
        ByteBuffer dataBuffer = ByteBuffer.wrap(dataBufferArray);
        IntBuffer bufferLength = IntBuffer.wrap(new int[] {dataBufferArray.length});
        IntBuffer returnCode = IntBuffer.wrap(new int[] {0});

        instance.hllapi(functionNumber, dataBuffer, bufferLength, returnCode);

        ReturnCode result = ReturnCode.fromNumber(returnCode.get());
        logger.info("reset_system status: " + result.getStatusNo());

        return (result == ReturnCode.SUCCESS) ? ReturnCode.SUCCESS : ReturnCode.FAILURE;
    }

    public Pair<ReturnCode, String> copy_ps_str(int length, int position) throws IllegalArgumentException{
        logger.info("Starting copy_ps_str");
//        connect_host("A");
        int function_number = 8;
//        byte[] dataBufferArray;
//
//        dataBufferArray = new byte[1920];

        IntBuffer functionNumber = IntBuffer.wrap(new int[] {function_number});
        ByteBuffer dataBuffer = ByteBuffer.wrap(new byte[length]);
        IntBuffer bufferLength = IntBuffer.wrap(new int[] {length});
        IntBuffer ps_position = IntBuffer.wrap(new int[] {position});

        NativeLong nlResult = instance.hllapi(functionNumber, dataBuffer, bufferLength, ps_position);
        int intresult = nlResult.intValue();

        logger.info("copy_ps_str result from hllapi(): " + intresult);
        logger.info("copy_ps_str result length: " + bufferLength.get());

        ReturnCode result = ReturnCode.fromNumber(intresult);
        byte[] outArr = dataBuffer.array();
        logger.info("Hallo: " + outArr.length);

        char[] adjustedArr = getCharsFromBytes(outArr);
        String dataString = new String(adjustedArr);

        logger.info("copy_ps_str result databuffer array: " + dataString);

        logger.info("copy_ps_str result: " + result.getStatusNo());
        switch(result){
            case SUCCESS:
                result = ReturnCode.SUCCESS;
                break;
            case TARGET_PRESENTATION_BUSY:
                result = ReturnCode.TARGET_PRESENTATION_BUSY;
                break;
            case FUNCTION_EXECUTION_INHIBITED_OTHER:
                result = ReturnCode.FUNCTION_EXECUTION_INHIBITED_OTHER;
                break;
            default:
                result = ReturnCode.FAILURE;
                break;
        }

        javafx.util.Pair <ReturnCode, String> output = new Pair(result, dataString);

        return output;
    }

    public Pair<ReturnCode, Integer> set_sess_param(String... sessionParams){
        int function_number = 9;
//        ReturnCode connectResult = connect_host();
//        if(connectResult != ReturnCode.SUCCESS ) throw new RuntimeException("Connection to session failed.");

        String allParams = String.join(",", sessionParams);

        byte[] dataBufferArray;

        dataBufferArray = allParams.getBytes(StandardCharsets.US_ASCII);

        IntBuffer functionNumber = IntBuffer.wrap(new int[] {function_number});
        ByteBuffer dataBuffer = ByteBuffer.wrap(dataBufferArray);
        IntBuffer bufferLength = IntBuffer.wrap(new int[] {dataBufferArray.length});
        IntBuffer ps_position = IntBuffer.wrap(new int[] {0});

        NativeLong nlResult = instance.hllapi(functionNumber, dataBuffer, bufferLength, ps_position);
        int intresult = nlResult.intValue();
        logger.info("set_sess_param result from hllapi(): " + intresult);

        ReturnCode result = ReturnCode.fromNumber(intresult);
        String dataString = new String(dataBuffer.array(), StandardCharsets.US_ASCII);
        logger.info("set_sess_param result databuffer array: " + dataString);

        logger.info("copy_ps_str result: " + intresult);

        // anything not success is failed
        result = (result == ReturnCode.SUCCESS) ? result : ReturnCode.FAILURE;

        int setParamsCount = bufferLength.get();

        logger.info("set_sess_param Valid session parameters set: " + setParamsCount);

        javafx.util.Pair <ReturnCode, Integer> output = new Pair(result, setParamsCount);

        return output;

    }

    public ReturnCode cpause(){
        char[] oia = new char[OIA_SIZE];
        int runtime;
        oia[9] = INPUT_INHIBITED;

        for(runtime = 0; /* (oia[9] == INPUT_INHIBITED) && */ (runtime < MAX_WAITING_MINS); runtime++){
            _wait();
            String oia_result = copy_oia().getValue();
            oia = oia_result.toCharArray();
        }
        if(runtime == MAX_WAITING_MINS) return ReturnCode.FAILURE;
        else return ReturnCode.SUCCESS;
    }

    public ReturnCode pause(int seconds){
        int function_number = 18;
        int half_seconds = seconds * 2;

        byte[] dataBufferArray;
        String data = "A"; // kahit ano nalang dito

        dataBufferArray = data.getBytes(StandardCharsets.US_ASCII);

        IntBuffer functionNumber = IntBuffer.wrap(new int[] {function_number});
        ByteBuffer dataBuffer = ByteBuffer.wrap(dataBufferArray);
        IntBuffer bufferLength = IntBuffer.wrap(new int[] {half_seconds});
        IntBuffer returnCode = IntBuffer.wrap(new int[] {0});

        instance.hllapi(functionNumber, dataBuffer, bufferLength, returnCode);

        ReturnCode result = ReturnCode.fromNumber(returnCode.get());
        logger.info("copy_ps_str result: " + result.getStatusNo());

        // anything not success is failed
        return (result == ReturnCode.SUCCESS) ? result : ReturnCode.FAILURE;
    }

    public Pair<ReturnCode, String> start_host_notify(String ps_id) throws IllegalArgumentException{
        logger.info("start_host_notify -- START");
        // I am not cleaning the string.
//        if (dataParams.length() != 16) throw new IllegalArgumentException("Data String should be 16 characters in length.");

        int function_number = 23;

        byte[] dataBufferArray = new byte[7];
        dataBufferArray[0] = ps_id.getBytes()[0];
        dataBufferArray[1] = 'P';
        dataBufferArray[2] = ' ';
        dataBufferArray[3] = ' ';
        dataBufferArray[4] = ' ';
        dataBufferArray[5] = ' ';
        dataBufferArray[6] = ' ';

        IntBuffer functionNumber = IntBuffer.wrap(new int[] {function_number});
        ByteBuffer dataBuffer = ByteBuffer.wrap(dataBufferArray);
        IntBuffer bufferLength = IntBuffer.wrap(new int[] {dataBufferArray.length});
        IntBuffer ps_position = IntBuffer.wrap(new int[] {0});

        NativeLong nlResult = instance.hllapi(functionNumber, dataBuffer, bufferLength, ps_position);
        int intresult = nlResult.intValue();
        logger.info("start_host_notify result from hllapi(): " + intresult);

        ReturnCode result = ReturnCode.fromNumber(intresult);

        byte[] dbResult = dataBuffer.array();
        char[] adjustedArr = getCharsFromBytes(dbResult);
        String dataString = new String(adjustedArr);
        logger.info("start_host_notify result databuffer array: " + dataString);

        result = (result == ReturnCode.SUCCESS) ? ReturnCode.SUCCESS : ReturnCode.FAILURE;
        javafx.util.Pair <ReturnCode, String> output = new Pair(result, dataString);

        logger.info("start_host_notify -- END");
        return output;
    }

    public Pair <ReturnCode, String> copy_oia(){
        int function_number = 13;
//        ReturnCode connectResult = connect_host(PS_ID);
//        if(connectResult != ReturnCode.SUCCESS) throw new RuntimeException("Connection to session failed.");

        byte[] dataBufferArray = new byte[OIA_SIZE]; // length for 32-bit

        IntBuffer functionNumber = IntBuffer.wrap(new int[] {function_number});
        ByteBuffer dataBuffer = ByteBuffer.wrap(dataBufferArray);
        IntBuffer bufferLength = IntBuffer.wrap(new int[] {dataBufferArray.length});
        IntBuffer ps_position = IntBuffer.wrap(new int[] {0});

        NativeLong nlResult = instance.hllapi(functionNumber, dataBuffer, bufferLength, ps_position);
        int intresult = nlResult.intValue();
        logger.info("copy_oia result from hllapi(): " + intresult);

        ReturnCode result = ReturnCode.fromNumber(intresult);
        switch(result){
            case SUCCESS:
            case TARGET_PRESENTATION_BUSY:
            case FUNCTION_EXECUTION_INHIBITED_OTHER:
                result = ReturnCode.SUCCESS;
                break;
            default:
                result= ReturnCode.FAILURE;

        }

        byte[] outArr = dataBuffer.array();
        char[] adjustedArr = getCharsFromBytes(outArr);
        String dataString = new String(adjustedArr);
//        String dataString = new String(charArr);
        logger.info("copy_oia result databuffer array: " + dataString);

        javafx.util.Pair <ReturnCode, String> output = new Pair(result, dataString);

        return output;

    }
    public ReturnCode send_keys(String keys){
        int function_number = 3;

//        ReturnCode connectResult = connect_host(PS_ID);
//        logger.info("connectresult: " + connectResult.getStatusNo());
//        if(connectResult != ReturnCode.SUCCESS) throw new RuntimeException("Connection to session failed.");

        byte[] dataBufferArray;

        dataBufferArray = keys.getBytes(StandardCharsets.US_ASCII);

        IntBuffer functionNumber = IntBuffer.wrap(new int[] {function_number});
        ByteBuffer dataBuffer = ByteBuffer.wrap(dataBufferArray);
        IntBuffer bufferLength = IntBuffer.wrap(new int[] {dataBufferArray.length});
        IntBuffer returnCode = IntBuffer.wrap(new int[] {0});

        instance.hllapi(functionNumber, dataBuffer, bufferLength, returnCode);

        ReturnCode result = ReturnCode.fromNumber(returnCode.get());
        return result;
    }

    public ReturnCode clear_ps(){
        ReturnCode sendKeyResult = send_keys(CLEAR_PS_KS);
//        if(sendKeyResult == ReturnCode.SUCCESS) return sendKeyResult;
//        else return ReturnCode.FAILURE;
        return sendKeyResult;
    }

    public ReturnCode _wait(){
//        ReturnCode connectResult = connect_host(PS_ID);
//        if(connectResult != ReturnCode.SUCCESS) throw new RuntimeException("Connection to session failed.");

        int function_number = 4;

        byte[] dataBufferArray;
        String data = "";

        dataBufferArray = data.getBytes(StandardCharsets.US_ASCII);

        IntBuffer functionNumber = IntBuffer.wrap(new int[] {function_number});

        // N/A vars
        ByteBuffer dataBuffer = ByteBuffer.wrap(dataBufferArray);
        IntBuffer bufferLength = IntBuffer.wrap(new int[] {dataBufferArray.length});
        IntBuffer returnCode = IntBuffer.wrap(new int[] {0});

        NativeLong resCode = instance.hllapi(functionNumber, dataBuffer, bufferLength, returnCode);

        ReturnCode result = ReturnCode.fromNumber(resCode.intValue());
        logger.info("wait status: " + result.getStatusNo());

        return result;
    }

    public Pair<ReturnCode, Integer> search_ps(String data, int ps_position){
        int function_number = 6;
//        ReturnCode connectResult = connect_host(PS_ID);
//        if(connectResult != ReturnCode.SUCCESS) throw new RuntimeException("Connection to session failed.");

        byte[] dataBufferArray;
        dataBufferArray = data.getBytes(StandardCharsets.US_ASCII);

        IntBuffer functionNumber = IntBuffer.wrap(new int[] {function_number});
        ByteBuffer dataBuffer = ByteBuffer.wrap(dataBufferArray);
        IntBuffer bufferLength = IntBuffer.wrap(new int[] {dataBufferArray.length});
        IntBuffer psPositionBuffer = IntBuffer.wrap(new int[] {ps_position});

        NativeLong resCode = instance.hllapi(functionNumber, dataBuffer, bufferLength, psPositionBuffer);
        ReturnCode result = ReturnCode.fromNumber(resCode.intValue());
        int length = bufferLength.get();

        if(!(length > 0 && result == ReturnCode.SUCCESS)) result = ReturnCode.FAILURE;

        Pair<ReturnCode, Integer> output = new Pair (result, length);

        return output;
    }

    public String logon(String CICSAppl, String username, String password, String ps_id){
        int cics_length = CICSAppl.length();

        String sess_opt = SessionOptions.FPAUSE;
        String response = "0000";
        String CCSN = "ccsn@E";
        String data;

        reset_system();

        ReturnCode connResult = connect_host(ps_id);

        if(connResult == ReturnCode.SUCCESS){
            Pair<ReturnCode, String> copy_oia = copy_oia();
            String oia_result = copy_oia.getValue();
            if(oia_result.charAt(9) != INPUT_INHIBITED){
                clear_ps();
                cpause();

                /* Log on to CICS application */
                int data_length = cics_length + 13 + 3;
                data = "logon applid(" + CICSAppl + ")" + ENTER_KS;

                send_keys(data);        //logon applid
                set_sess_param(sess_opt);
                start_host_notify(ps_id);
                cpause();

                sess_opt = SessionOptions.FPAUSE;
                set_sess_param(sess_opt);
                pause(20);

                sess_opt = SessionOptions.IPAUSE;

                oia_result = copy_oia().getValue();
                if(oia_result.charAt(9) != INPUT_INHIBITED){
                    if(oia_result.charAt(3) != 'X') {
                        response = NOT_APPLIC;
                    }
                    // Not really "I". I na may dalawang tuldok sa itaas yan. See INTFACE.C line 355
                } else{
                    response = HOST_TIMED;
                }
            } else {
                response = HOST_TIMED;
            }
        } else {
            response = NOT_HOST;
        }

        // c version ans is also equal to response
        return response;
    }

    public String logoff(String ps_id){
        String cssf = "cssf logoff@E";
        String response = "";

        reset_system();
        if(connect_host(ps_id) == ReturnCode.SUCCESS){
            String oia_result = copy_oia().getValue();
            if(oia_result.charAt(3) == 'X' && oia_result.charAt(9) != INPUT_INHIBITED){
                send_keys(cssf);
            }else response = NOT_APPLIC;
        } else response = NOT_HOST;

        return response;
    }

    // Commented INPUT_INHIBITED checks for now
    public String sendhost(String message, String ps_id){
        logger.info("EHLLAPI SENDHOST -- START");
        logger.info("Sending message: " + message);
        String response = "000";
        String sess_opt = SessionOptions.IPAUSE;

        // Memory allocation check - skipped

        reset_system();

        ReturnCode connect_result = connect_host(ps_id);
        logger.info("SENDHOST connect_host result: " + connect_result.getStatusNo());
        if(connect_result == ReturnCode.SUCCESS){
            String oia_result = copy_oia().getValue();
            logger.info("SENDHOST oia_result: " + oia_result);
            logger.info("CharAt: " + (int) oia_result.charAt(3));
            if(oia_result.charAt(3) == OIA_ONLINE /* && oia_result.charAt(9) == INPUT_INHIBITED */){
                if(message.length() > 0){
                    logger.info("PASOK NA PASOK");
                    clear_ps();
                    cpause();

                    /* Send message to host */
                    message = message + ENTER_KS;
                    send_keys(message);

                    set_sess_param(sess_opt);
                    start_host_notify(ps_id);
                    cpause();
                }

                /* Get response from host */
                response = copy_ps_str(PS_SIZE, 1).getValue();
                logger.info("Response from copy_ps_str: " + response);
                oia_result = copy_oia().getValue();

                if(oia_result.charAt(3) != OIA_ONLINE) response = NOT_APPLIC;
//                if(oia_result.charAt(9) == INPUT_INHIBITED) response = HOST_TIMED;

                if(message.length() > 0) clear_ps();

            }else{
//                if(oia_result.charAt(9) == INPUT_INHIBITED) response = HOST_TIMED;
                if(oia_result.charAt(3) != OIA_ONLINE) response = NOT_APPLIC;
            }
        } else response = NOT_HOST;


        logger.info("EHLLAPI SENDHOST -- END");

        return response;
    }

    /*
     * HANDLES NEGATIVE BYTE VALUE
     * REFERENCE: https://gsmaras.wordpress.com/code/negative-ascii-codes
     * BASED ON CHARACTER TABLE https://en.wikipedia.org/Windows-1252
     */
    private char[] getCharsFromBytes(byte[] arr){
        char[] newArr = new char[arr.length];
        logger.info("Transforming...");
        for(int i = 0; i < newArr.length; i++){
            if(arr[i] < 0) {
                newArr[i] = (char) (256 + (int) arr[i]);
            }
            else {
                newArr[i] = (char) arr[i];
            }
            System.out.print((int) newArr[i] + " # ");
        }

        System.out.println();

        logger.info(Arrays.toString(newArr));

        return newArr;
    }
}
