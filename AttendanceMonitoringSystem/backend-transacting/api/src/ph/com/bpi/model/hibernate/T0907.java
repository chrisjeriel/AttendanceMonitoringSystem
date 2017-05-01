package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0907 extends TModelBase {

	private int id;
	private String trdrFi;
	private String tranIndc;
	private String refNmbr;
	private String cLName;
	private String cFName;
	private String cMName;
	private BigDecimal acptMode;
	private String currFr;
	private BigDecimal tranAmt;
	private BigDecimal setlMode;
	private String currTo;
	private BigDecimal equiAmt;
	private BigDecimal grntRate;
	private BigDecimal netAmnt;
	private BigDecimal acptComm;
	private BigDecimal acptDocs;
	private BigDecimal acptPost;
	private BigDecimal setlComm;
	private BigDecimal setlDocs;
	private BigDecimal setlPost;
	private String pRefNmbr;
	private String trdrId;

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

	public BigDecimal getAcptMode() {
		return acptMode;
	}

	public void setAcptMode(BigDecimal acptMode) {
		this.acptMode = acptMode;
	}

	public String getCurrFr() {
		return currFr;
	}

	public void setCurrFr(String currFr) {
		this.currFr = currFr;
	}

	public BigDecimal getTranAmt() {
		return tranAmt;
	}

	public void setTranAmt(BigDecimal tranAmt) {
		this.tranAmt = tranAmt;
	}

	public BigDecimal getSetlMode() {
		return setlMode;
	}

	public void setSetlMode(BigDecimal setlMode) {
		this.setlMode = setlMode;
	}

	public String getCurrTo() {
		return currTo;
	}

	public void setCurrTo(String currTo) {
		this.currTo = currTo;
	}

	public BigDecimal getEquiAmt() {
		return equiAmt;
	}

	public void setEquiAmt(BigDecimal equiAmt) {
		this.equiAmt = equiAmt;
	}

	public BigDecimal getGrntRate() {
		return grntRate;
	}

	public void setGrntRate(BigDecimal grntRate) {
		this.grntRate = grntRate;
	}

	public BigDecimal getNetAmnt() {
		return netAmnt;
	}

	public void setNetAmnt(BigDecimal netAmnt) {
		this.netAmnt = netAmnt;
	}

	public BigDecimal getAcptComm() {
		return acptComm;
	}

	public void setAcptComm(BigDecimal acptComm) {
		this.acptComm = acptComm;
	}

	public BigDecimal getAcptDocs() {
		return acptDocs;
	}

	public void setAcptDocs(BigDecimal acptDocs) {
		this.acptDocs = acptDocs;
	}

	public BigDecimal getAcptPost() {
		return acptPost;
	}

	public void setAcptPost(BigDecimal acptPost) {
		this.acptPost = acptPost;
	}

	public BigDecimal getSetlComm() {
		return setlComm;
	}

	public void setSetlComm(BigDecimal setlComm) {
		this.setlComm = setlComm;
	}

	public BigDecimal getSetlDocs() {
		return setlDocs;
	}

	public void setSetlDocs(BigDecimal setlDocs) {
		this.setlDocs = setlDocs;
	}

	public BigDecimal getSetlPost() {
		return setlPost;
	}

	public void setSetlPost(BigDecimal setlPost) {
		this.setlPost = setlPost;
	}

	public String getpRefNmbr() {
		return pRefNmbr;
	}

	public void setpRefNmbr(String pRefNmbr) {
		this.pRefNmbr = pRefNmbr;
	}

	public String getTrdrId() {
		return trdrId;
	}

	public void setTrdrId(String trdrId) {
		this.trdrId = trdrId;
	}

	@Override
	public String toString() {
		return "T0907 [id=" + id + ", trdrFi=" + trdrFi + ", tranIndc=" + tranIndc + ", refNmbr=" + refNmbr
				+ ", cLName=" + cLName + ", cFName=" + cFName + ", cMName=" + cMName + ", acptMode=" + acptMode
				+ ", currFr=" + currFr + ", tranAmt=" + tranAmt + ", setlMode=" + setlMode + ", currTo=" + currTo
				+ ", equiAmt=" + equiAmt + ", grntRate=" + grntRate + ", netAmnt=" + netAmnt + ", acptComm=" + acptComm
				+ ", acptDocs=" + acptDocs + ", acptPost=" + acptPost + ", setlComm=" + setlComm + ", setlDocs="
				+ setlDocs + ", setlPost=" + setlPost + ", pRefNmbr=" + pRefNmbr + ", trdrId=" + trdrId + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRDRFI":
this.setTrdrFi(map.get(key));
break;
case "TRANINDC":
this.setTranIndc(map.get(key));
break;
case "REFNMBR":
this.setRefNmbr(map.get(key));
break;
case "CLNAME":
this.setcLName(map.get(key));
break;
case "CFNAME":
this.setcFName(map.get(key));
break;
case "CMNAME":
this.setcMName(map.get(key));
break;
case "ACPTMODE":
this.setAcptMode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "CURRFR":
this.setCurrFr(map.get(key));
break;
case "TRANAMT":
this.setTranAmt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SETLMODE":
this.setSetlMode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "CURRTO":
this.setCurrTo(map.get(key));
break;
case "EQUIAMT":
this.setEquiAmt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "GRNTRATE":
this.setGrntRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "NETAMNT":
this.setNetAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "ACPTCOMM":
this.setAcptComm(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "ACPTDOCS":
this.setAcptDocs(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "ACPTPOST":
this.setAcptPost(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SETLCOMM":
this.setSetlComm(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SETLDOCS":
this.setSetlDocs(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SETLPOST":
this.setSetlPost(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "PREFNMBR":
this.setpRefNmbr(map.get(key));
break;
case "TRDRID":
this.setTrdrId(map.get(key));
break;}}}}