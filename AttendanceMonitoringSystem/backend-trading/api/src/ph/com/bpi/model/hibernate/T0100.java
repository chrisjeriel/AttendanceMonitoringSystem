package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

public class T0100 {

	private int id;
	private BigDecimal cutTime1;
	private BigDecimal cutTime2;
	private BigDecimal rateVprd;
	private String povrdIndc;
	private String ptrckIndc;
	private BigDecimal ptrckDays;
	private BigDecimal ptrckAmnt;
	private String sovrdIndc;
	private String strckIndc;
	private BigDecimal strckDays;
	private BigDecimal strckAmnt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal getCutTime1() {
		return cutTime1;
	}
	public void setCutTime1(BigDecimal cutTime1) {
		this.cutTime1 = cutTime1;
	}
	public BigDecimal getCutTime2() {
		return cutTime2;
	}
	public void setCutTime2(BigDecimal cutTime2) {
		this.cutTime2 = cutTime2;
	}
	public BigDecimal getRateVprd() {
		return rateVprd;
	}
	public void setRateVprd(BigDecimal rateVprd) {
		this.rateVprd = rateVprd;
	}
	public String getPovrdIndc() {
		return povrdIndc;
	}
	public void setPovrdIndc(String povrdIndc) {
		this.povrdIndc = povrdIndc;
	}
	public String getPtrckIndc() {
		return ptrckIndc;
	}
	public void setPtrckIndc(String ptrckIndc) {
		this.ptrckIndc = ptrckIndc;
	}
	public BigDecimal getPtrckDays() {
		return ptrckDays;
	}
	public void setPtrckDays(BigDecimal ptrckDays) {
		this.ptrckDays = ptrckDays;
	}
	public BigDecimal getPtrckAmnt() {
		return ptrckAmnt;
	}
	public void setPtrckAmnt(BigDecimal ptrckAmnt) {
		this.ptrckAmnt = ptrckAmnt;
	}
	public String getSovrdIndc() {
		return sovrdIndc;
	}
	public void setSovrdIndc(String sovrdIndc) {
		this.sovrdIndc = sovrdIndc;
	}
	public String getStrckIndc() {
		return strckIndc;
	}
	public void setStrckIndc(String strckIndc) {
		this.strckIndc = strckIndc;
	}
	public BigDecimal getStrckDays() {
		return strckDays;
	}
	public void setStrckDays(BigDecimal strckDays) {
		this.strckDays = strckDays;
	}
	public BigDecimal getStrckAmnt() {
		return strckAmnt;
	}
	public void setStrckAmnt(BigDecimal strckAmnt) {
		this.strckAmnt = strckAmnt;
	}
	
	public void parse(HashMap<String, String> map){
		for(String key : map.keySet()){
			switch(key){
				case "CUT_TIME1":
					this.setCutTime1(new BigDecimal(StringUtils.stripEnd(map.get(key), StringUtils.SPACE)));
					break;
				case "CUT_TIME2":
					this.setCutTime2(new BigDecimal(StringUtils.stripEnd(map.get(key), StringUtils.SPACE)));
					break;
				case "RATE_VPRD":
					this.setRateVprd(new BigDecimal(StringUtils.stripEnd(map.get(key), StringUtils.SPACE)));
					break;
				case "POVRD_INDC":
					this.setPovrdIndc(map.get(key));
					break;
				case "PTRCK_INDC":
					this.setPtrckIndc(map.get(key));
					break;
				case "PTRCK_DAYS":
					this.setPtrckDays(new BigDecimal(StringUtils.stripEnd(map.get(key), StringUtils.SPACE)));
					break;
				case "PTRCK_AMNT":
					this.setPtrckAmnt(new BigDecimal(StringUtils.stripEnd(map.get(key), StringUtils.SPACE)));
					break;
				case "SOVRD_INDC":
					this.setSovrdIndc(map.get(key));
					break;
				case "STRCK_INDC":
					this.setStrckIndc(map.get(key));
					break;
				case "STRCK_DAYS":
					this.setStrckDays(new BigDecimal(StringUtils.stripEnd(map.get(key), StringUtils.SPACE)));
					break;
				case "STRCK_AMNT":
					this.setStrckAmnt(new BigDecimal(StringUtils.stripEnd(map.get(key), StringUtils.SPACE)));
					break;
			}
		}
	}

}