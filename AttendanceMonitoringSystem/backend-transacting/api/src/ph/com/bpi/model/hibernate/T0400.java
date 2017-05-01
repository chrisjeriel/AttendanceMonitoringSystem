package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0400 extends TModelBase {

	private int id;
	private String trdrFi;
	private BigDecimal book;
	private String tranIndc;
	private String refNmbr;
	private String currFrom;
	private String currTo;
	private BigDecimal acptMode;
	private BigDecimal setlMode;
	private BigDecimal tranAmnt;
	private BigDecimal eqvlAmnt;
	private BigDecimal rqstRate;
	private BigDecimal grntRate;
	private String btsuRmrk;
	private String trsyRmrk;
	private String inviCode;
	private String grntStat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrdrFi() {
		return trdrFi;
	}

	public void setTrdrFi(String trdrFi) {
		this.trdrFi = trdrFi;
	}

	public BigDecimal getBook() {
		return book;
	}

	public void setBook(BigDecimal book) {
		this.book = book;
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

	public String getCurrFrom() {
		return currFrom;
	}

	public void setCurrFrom(String currFrom) {
		this.currFrom = currFrom;
	}

	public String getCurrTo() {
		return currTo;
	}

	public void setCurrTo(String currTo) {
		this.currTo = currTo;
	}

	public BigDecimal getAcptMode() {
		return acptMode;
	}

	public void setAcptMode(BigDecimal acptMode) {
		this.acptMode = acptMode;
	}

	public BigDecimal getSetlMode() {
		return setlMode;
	}

	public void setSetlMode(BigDecimal setlMode) {
		this.setlMode = setlMode;
	}

	public BigDecimal getTranAmnt() {
		return tranAmnt;
	}

	public void setTranAmnt(BigDecimal tranAmnt) {
		this.tranAmnt = tranAmnt;
	}

	public BigDecimal getEqvlAmnt() {
		return eqvlAmnt;
	}

	public void setEqvlAmnt(BigDecimal eqvlAmnt) {
		this.eqvlAmnt = eqvlAmnt;
	}

	public BigDecimal getRqstRate() {
		return rqstRate;
	}

	public void setRqstRate(BigDecimal rqstRate) {
		this.rqstRate = rqstRate;
	}

	public BigDecimal getGrntRate() {
		return grntRate;
	}

	public void setGrntRate(BigDecimal grntRate) {
		this.grntRate = grntRate;
	}

	public String getBtsuRmrk() {
		return btsuRmrk;
	}

	public void setBtsuRmrk(String btsuRmrk) {
		this.btsuRmrk = btsuRmrk;
	}

	public String getTrsyRmrk() {
		return trsyRmrk;
	}

	public void setTrsyRmrk(String trsyRmrk) {
		this.trsyRmrk = trsyRmrk;
	}

	public String getInviCode() {
		return inviCode;
	}

	public void setInviCode(String inviCode) {
		this.inviCode = inviCode;
	}

	public String getGrntStat() {
		return grntStat;
	}

	public void setGrntStat(String grntStat) {
		this.grntStat = grntStat;
	}

	@Override
	public String toString() {
		return "T0400 [id=" + id + ", trdrFi=" + trdrFi + ", book=" + book + ", tranIndc=" + tranIndc + ", refNmbr="
				+ refNmbr + ", currFrom=" + currFrom + ", currTo=" + currTo + ", acptMode=" + acptMode + ", setlMode="
				+ setlMode + ", tranAmnt=" + tranAmnt + ", eqvlAmnt=" + eqvlAmnt + ", rqstRate=" + rqstRate
				+ ", grntRate=" + grntRate + ", btsuRmrk=" + btsuRmrk + ", trsyRmrk=" + trsyRmrk + ", inviCode="
				+ inviCode + ", grntStat=" + grntStat + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRDRFI":
this.setTrdrFi(map.get(key));
break;
case "BOOK":
this.setBook(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "TRANINDC":
this.setTranIndc(map.get(key));
break;
case "REFNMBR":
this.setRefNmbr(map.get(key));
break;
case "CURRFROM":
this.setCurrFrom(map.get(key));
break;
case "CURRTO":
this.setCurrTo(map.get(key));
break;
case "ACPTMODE":
this.setAcptMode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SETLMODE":
this.setSetlMode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "TRANAMNT":
this.setTranAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "EQVLAMNT":
this.setEqvlAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "RQSTRATE":
this.setRqstRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "GRNTRATE":
this.setGrntRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "BTSURMRK":
this.setBtsuRmrk(map.get(key));
break;
case "TRSYRMRK":
this.setTrsyRmrk(map.get(key));
break;
case "INVICODE":
this.setInviCode(map.get(key));
break;
case "GRNTSTAT":
this.setGrntStat(map.get(key));
break;}}}}