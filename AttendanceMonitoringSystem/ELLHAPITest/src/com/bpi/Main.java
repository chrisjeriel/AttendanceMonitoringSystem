package com.bpi;

import javafx.util.Pair;

public class Main {

    public static void main(String[] args) {
        EHLLAPIImpl ellhapi = new EHLLAPIImpl();
        
        ReturnCode result = ellhapi.connect_host("A");
        System.out.println("Connecting to Session A: " + result.getStatusNo());

        ReturnCode resetResult = ellhapi.reset_system();
        System.out.println("Reset System: " + resetResult.getStatusNo());

        ReturnCode sendKeysResult = ellhapi.send_keys("testing 123");
        System.out.println("send_keys result: " + resetResult.getStatusNo());

        ReturnCode pauseResult = ellhapi.pause(1);
        System.out.println("pause result: " + resetResult.getStatusNo());

        Pair<ReturnCode, Integer> sessParamResult = ellhapi.set_sess_param(SessionOptions.ATTRB);

        Pair<ReturnCode, String> r = ellhapi.copy_ps_str(20,680);
        System.out.println("copy_ps_str main: " + r.getValue());

        ReturnCode clearCode = ellhapi.clear_ps();

    }
}
