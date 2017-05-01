package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0314 {

	private int id;
	private String tranTrdr;
	private String tranIndc;
	private String refNmbr;
	private String cLName;
	private String cFName;
	private String cMName;
	private String addr1;
	private String addr2;
	private BigDecimal acptMode;
	private String acptCurr;
	private BigDecimal tranAmnt;
	private BigDecimal setlMode;
	private String setlCurr;
	private BigDecimal equiAmnt;
	private BigDecimal grntRate;
	private String grntStat;
	private String brchCode;
	private BigDecimal rqstRate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTranTrdr() {
		return tranTrdr;
	}

	public void setTranTrdr(String tranTrdr) {
		this.tranTrdr = tranTrdr;
	}

	public String getTranIndc() {
		return tranIndc;
	}

	public void setTranIndc(String tranIndc) {
		this.tranIndc = tranIndc;
	}

	public String getRefNmbr() {
		return refNmbr;
	}

	public void setRefNmbr(String refNmbr) {
		this.refNmbr = refNmbr;
	}

	public String getcLName() {
		return cLName;
	}

	public void setcLName(String cLName) {
		this.cLName = cLName;
	}

	public String getcFName() {
		return cFName;
	}

	public void setcFName(String cFName) {
		this.cFName = cFName;
	}

	public String getcMName() {
		return cMName;
	}

	public void setcMName(String cMName) {
		this.cMName = cMName;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public BigDecimal getAcptMode() {
		return acptMode;
	}

	public void setAcptMode(BigDecimal acptMode) {
		this.acptMode = acptMode;
	}

	public String getAcptCurr() {
		return acptCurr;
	}

	public void setAcptCurr(String acptCurr) {
		this.acptCurr = acptCurr;
	}

	public BigDecimal getTranAmnt() {
		return tranAmnt;
	}

	public void setTranAmnt(BigDecimal tranAmnt) {
		this.tranAmnt = tranAmnt;
	}

	public BigDecimal getSetlMode() {
		return setlMode;
	}

	public void setSetlMode(BigDecimal setlMode) {
		this.setlMode = setlMode;
	}

	public String getSetlCurr() {
		return setlCurr;
	}

	public void setSetlCurr(String setlCurr) {
		this.setlCurr = setlCurr;
	}

	public BigDecimal getEquiAmnt() {
		return equiAmnt;
	}

	public void setEquiAmnt(BigDecimal equiAmnt) {
		this.equiAmnt = equiAmnt;
	}

	public BigDecimal getGrntRate() {
		return grntRate;
	}

	public void setGrntRate(BigDecimal grntRate) {
		this.grntRate = grntRate;
	}

	public String getGrntStat() {
		return grntStat;
	}

	public void setGrntStat(String grntStat) {
		this.grntStat = grntStat;
	}

	public String getBrchCode() {
		return brchCode;
	}

	public void setBrchCode(String brchCode) {
		this.brchCode = brchCode;
	}

	public BigDecimal getRqstRate() {
		return rqstRate;
	}

	public void setRqstRate(BigDecimal rqstRate) {
		this.rqstRate = rqstRate;
	}
	public void parse(HashMap<String, String> map){
		for(String key : map.keySet()){
			switch(key){
				case "TRAN_TRDR":
					this.setTranTrdr(map.get(key));
					break;
				case "TRAN_INDC":
					this.setTranIndc(map.get(key));
					break;
				case "REF_NMBR":
					this.setRefNmbr(map.get(key));
					break;
				case "C_LNAME":
					this.setcLName(map.get(key));
					break;
				case "C_FNAME":
					this.setcFName(map.get(key));
					break;
				case "C_MNAME":
					this.setcMName(map.get(key));
					break;
				case "ADDR1":
					this.setAddr1(map.get(key));
					break;
				case "ADDR2":
					this.setAddr2(map.get(key));
					break;
				case "ACPT_MODE":
					this.setAcptMode(new BigDecimal(map.get(key)));
					break;
				case "ACPT_CURR":
					this.setAcptCurr(map.get(key));
					break;
				case "TRAN_AMNT":
					this.setTranAmnt(new BigDecimal(map.get(key)));
					break;
				case "SETL_MODE":
					this.setSetlMode(new BigDecimal(map.get(key)));
					break;
				case "SETL_CURR":
					this.setSetlCurr(map.get(key));
					break;
				case "EQUI_AMNT":
					this.setEquiAmnt(new BigDecimal(map.get(key)));
					break;
				case "GRNT_RATE":
					this.setGrntRate(new BigDecimal(map.get(key)));
					break;
				case "GRNT_STAT":
					this.setGrntStat(map.get(key));
					break;
				case "BRCH_CODE":
					this.setBrchCode(map.get(key));
					break;
				case "RQST_RATE":
					this.setRqstRate(new BigDecimal(map.get(key)));
					break;
			}
		}
	}

}