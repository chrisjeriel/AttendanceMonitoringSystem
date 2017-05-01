package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0815 {

	private int id;
	private String loaNmbr;
	private String acctNmbr;
	private String valDate;
	private String bankName;
	private BigDecimal tranAmnt;
	private String refNmbr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoaNmbr() {
		return loaNmbr;
	}
	public void setLoaNmbr(String loaNmbr) {
		this.loaNmbr = loaNmbr;
	}
	public String getAcctNmbr() {
		return acctNmbr;
	}
	public void setAcctNmbr(String acctNmbr) {
		this.acctNmbr = acctNmbr;
	}
	public String getValDate() {
		return valDate;
	}
	public void setValDate(String valDate) {
		this.valDate = valDate;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public BigDecimal getTranAmnt() {
		return tranAmnt;
	}
	public void setTranAmnt(BigDecimal tranAmnt) {
		this.tranAmnt = tranAmnt;
	}
	public String getRefNmbr() {
		return refNmbr;
	}
	public void setRefNmbr(String refNmbr) {
		this.refNmbr = refNmbr;
	}
	@Override
	public String toString() {
		return "T0815 [id=" + id + ", loaNmbr=" + loaNmbr + ", acctNmbr=" + acctNmbr + ", valDate=" + valDate
				+ ", bankName=" + bankName + ", tranAmnt=" + tranAmnt + ", refNmbr=" + refNmbr + "]";
	}
	
	public void parse(HashMap<String, String> map){
		
		for(String key : map.keySet()){
			switch(key){
				case "LOA_NMBR":
					this.setLoaNmbr(map.get(key));
					break;
				case "ACCT_NMBR":
					this.setAcctNmbr(map.get(key));
					break;
				case "VAL_DATE":
					this.setValDate(map.get(key));
					break;
				case "BANK_NAME":
					this.setBankName(map.get(key));
					break;
				case "TRAN_AMNT":
					this.setTranAmnt(new BigDecimal(map.get(key)));
					break;
				case "REF_NMBR":
					this.setRefNmbr(map.get(key));
					break;
			}
		}
	}

}