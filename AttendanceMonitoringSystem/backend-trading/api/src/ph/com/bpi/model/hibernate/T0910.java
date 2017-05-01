package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0910 {

	private int id;
	private String refNmbr;
	private BigDecimal totlAmt;
	private String brchCode;
	private String currCode;
	private String tcSerNo;
	private BigDecimal tcAmt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRefNmbr() {
		return refNmbr;
	}
	public void setRefNmbr(String refNmbr) {
		this.refNmbr = refNmbr;
	}
	public BigDecimal getTotlAmt() {
		return totlAmt;
	}
	public void setTotlAmt(BigDecimal totlAmt) {
		this.totlAmt = totlAmt;
	}
	public String getBrchCode() {
		return brchCode;
	}
	public void setBrchCode(String brchCode) {
		this.brchCode = brchCode;
	}
	public String getCurrCode() {
		return currCode;
	}
	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}
	public String getTcSerNo() {
		return tcSerNo;
	}
	public void setTcSerNo(String tcSerNo) {
		this.tcSerNo = tcSerNo;
	}
	public BigDecimal getTcAmt() {
		return tcAmt;
	}
	public void setTcAmt(BigDecimal tcAmt) {
		this.tcAmt = tcAmt;
	}
	public void parse(HashMap<String, String> map){
		for(String key : map.keySet()){
			switch(key){
				case "REF_NMBR":
					this.setRefNmbr(map.get(key));
					break;
				case "TOTL_AMT":
					this.setTotlAmt(new BigDecimal(map.get(key)));
					break;
				case "BRCH_CODE":
					this.setBrchCode(map.get(key));
					break;
				case "CURR_CODE":
					this.setCurrCode(map.get(key));
					break;
				case "TC_SERNO":
					this.setTcSerNo(map.get(key));
					break;
				case "TC_AMT":
					this.setTcAmt(new BigDecimal(map.get(key)));
					break;
					
			}
		}
	}

}