
public class GeneralFunc {

    public static String f_encrypt (String jsmsg, boolean ncr) {
        String hsmsg = jsmsg;

        if (hsmsg.trim().length() == 0) {
            return space(18);
        }

        hsmsg = "";

        String tx2benc, correnc;
        if (ncr) {
            tx2benc = ">@C*B.9-JUSTINE:#L=A7G(D8\\O;64F%/K}H&3P{V_Z1M)Q52+WY,R?X$0!<";
            correnc = "){HMT};S!E#K@.NX%G<O*V/B_6+4D&P$Z:2Y>R-F=Q\\C?W,JULIA0718359(";
        }
        else {
            tx2benc = "){HMT};S!E#K@.NX%G<O*V/B_6+4D&P$Z:2Y>R-F=Q\\C?W,JULIA0718359(";
            correnc = ">@C*B.9-JUSTINE:#L=A7G(D8\\O;64F%/K}H&3P{V_Z1M)Q52+WY,R?X$0!<";
        }

        int ilen = jsmsg.trim().length();

        for (int iencr = 0; iencr < ilen; iencr++) {
            String temp = "";
            String ttarget = jsmsg.substring(iencr, iencr + 1);
            int ptarget = tx2benc.indexOf(ttarget.toUpperCase());

            if (ptarget > -1) {
                if (iencr > 0 && iencr < 9) {
                    ptarget = correnc.length() + 1 - ptarget;
                }

                if (iencr < hsmsg.length()) {
                    temp = hsmsg.substring(iencr + 1);
                }

                hsmsg = hsmsg.substring(0, iencr) + correnc.substring(ptarget, ptarget + 1) + temp;
            }
        }

        String s = hsmsg.trim();

        if (s.length() < 8) {
            hsmsg += space(8 - s.length());
        }

        return "|\\=&*$%@#;" + hsmsg;
    }


    public static boolean p_cutoff (String gTran_fi) {
        char bank;
        switch (gTran_fi) {
            case "BP":
                bank = '1';
                break;
            case "FB":
                bank = '2';
                break;
        }

        String MFmsg = Util.sendDetail("0308"); //Placeholder function only

        if (MFmsg.substring(pRcde, pRcde + 4) == "0000" && MFmsg.length() != 0) {
            return true;
        }
        else {
            return false;
        }
    }



    public static String space(int size) {
        String s = "";

        while (size-- > 0) {
            s += " ";
        }

        return s.toString();
    }

}
