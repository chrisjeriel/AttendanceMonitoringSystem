package com.bpi;

import java.nio.charset.StandardCharsets;

/**
 * Created by Bear on 20/09/2016.
 */
public class SessionOptions {

    public static final String STRLEN = "STRLEN";
    public static final String STREOT = "STREOT";

    public static final String EOT(char c){
        return "EOT=" + Character.toString(c);
    }

    public static final String SRCHALL = "SRCHALL";
    public static final String SRCHFROM = "SRCHFROM";

    public static final String SRCHFRWRD = "SRCHFRWRD";
    public static final String SRCHBKWRD = "SRCHBKWRD";

    public static final String NOATTRB = "NOATTRB";
    public static final String ATTRB = "ATTRB";
    public static final String NULLATTRB = "NULLATTRB";

    public static final String FPAUSE = "FPAUSE";
    public static final String IPAUSE = "IPAUSE";

    public static final String NOQUIET = "NOQUIET";
    public static final String QUIET = "QUIET";

    private static final String acceptableTimeoutParams = "0123456789JKLMN";
    public static final String TIMEOUT(char c){
        String str = Character.toString(c);
        if (acceptableTimeoutParams.contains(str)) return "TIMEOUT=" + str;
        else throw new IllegalArgumentException("Invalid Character. Should be 0-9 and J-N");
    }

    public static final String ESC(char c){
        String str = Character.toString(c);
        str = str.trim();
        if(str.isEmpty()) throw new IllegalArgumentException("A blank is not a valid escape character.");
        else return "ESC=" + str;
    }

    public static final String AUTORESET = "AUTORESET";
    public static final String NORESET = "NORESET";

    public static final String CONLOG = "CONLOG";
    public static final String CONPHYS = "CONPHYS";

    public static final String TWAIT = "TWAIT";
    public static final String LWAIT = "LWAIT";
    public static final String NWAIT = "NWAIT";

    public static final String NOEAB = "NOEAB";
    public static final String EAB = "EAB";

    public static final String NOXLATE = "NOXLATE";
    public static final String XLATE = "XLATE";

    public static final String BLANK = "BLANK";
    public static final String NOBLANK = "NOBLANK";

    public static final String CFGSIZE = "CFGSIZE";
    public static final String NOCFGSIZE = "NOCFGSIZE";

    public static final String DISPLAY = "DISPLAY";
    public static final String NODISPLAY = "NODISPLAY";

    public static final String NOPUTEAB = "NOPUTEAB";
    public static final String PUTEAB = "PUTEAB";

    public static final String RETRY = "RETRY";
    public static final String NORETRY = "NORETRY";

    public static final String NOEAD = "NOEAD";
    public static final String EAD = "EAD";

    public static final String NOSO ="NOSO";
    public static final String SO = "SO";
    public static final String SPACESO = "SPACESO";

    public static final String EXTEND_PS = "EXTEND_PS";
    public static final String NOEXTEND_PS = "NOEXTEND_PS";

    public static final String SUPER_WRITE = "SUPER_WRITE";
    public static final String WRITE_SUPER = "WRITE_SUPER";
    public static final String WRITE_WRITE = "WRITE_WRITE";
    public static final String WRITE_READ = "WRITE_READ";
    public static final String WRITE_NONE = "WRITE_NONE";
    public static final String READ_WRITE = "READ_WRITE";

    public static final String NOKEY = "NOKEY";
    public static final String KEY(String keyword){
        if(keyword.length() != 8) throw new IllegalArgumentException("The keyword must be exactly 8 characters in length");
        byte[] keywordBytes = keyword.getBytes(StandardCharsets.US_ASCII);
        return "KEY$" + new String(keywordBytes, StandardCharsets.US_ASCII);
    }

}
