package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0812 extends TModelBase {

	private int id;
	private String tranIndtr;
	private String cntrPrty;
	private String cntcPrsn;
	private String address1;
	private String address2;
	private BigDecimal tranAmnt;
	private BigDecimal exchRate;
	private BigDecimal eqvlAmnt;
	private String valDate;
	private String recvAcct;
	private String remarks;
	private String refNmbr;
	private String othrInst;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTranIndtr() {
		return tranIndtr;
	}

	public void setTranIndtr(String tranIndtr) {
		this.tranIndtr = tranIndtr;
	}

	public String getCntrPrty() {
		return cntrPrty;
	}

	public void setCntrPrty(String cntrPrty) {
		this.cntrPrty = cntrPrty;
	}

	public String getCntcPrsn() {
		return cntcPrsn;
	}

	public void setCntcPrsn(String cntcPrsn) {
		this.cntcPrsn = cntcPrsn;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public BigDecimal getTranAmnt() {
		return tranAmnt;
	}

	public void setTranAmnt(BigDecimal tranAmnt) {
		this.tranAmnt = tranAmnt;
	}

	public BigDecimal getExchRate() {
		return exchRate;
	}

	public void setExchRate(BigDecimal exchRate) {
		this.exchRate = exchRate;
	}

	public BigDecimal getEqvlAmnt() {
		return eqvlAmnt;
	}

	public void setEqvlAmnt(BigDecimal eqvlAmnt) {
		this.eqvlAmnt = eqvlAmnt;
	}

	public String getValDate() {
		return valDate;
	}

	public void setValDate(String valDate) {
		this.valDate = valDate;
	}

	public String getRecvAcct() {
		return recvAcct;
	}

	public void setRecvAcct(String recvAcct) {
		this.recvAcct = recvAcct;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRefNmbr() {
		return refNmbr;
	}

	public void setRefNmbr(String refNmbr) {
		this.refNmbr = refNmbr;
	}

	public String getOthrInst() {
		return othrInst;
	}

	public void setOthrInst(String othrInst) {
		this.othrInst = othrInst;
	}

	@Override
	public String toString() {
		return "T0812 [id=" + id + ", tranIndtr=" + tranIndtr + ", cntrPrty=" + cntrPrty + ", cntcPrsn=" + cntcPrsn
				+ ", address1=" + address1 + ", address2=" + address2 + ", tranAmnt=" + tranAmnt + ", exchRate="
				+ exchRate + ", eqvlAmnt=" + eqvlAmnt + ", valDate=" + valDate + ", recvAcct=" + recvAcct + ", remarks="
				+ remarks + ", refNmbr=" + refNmbr + ", othrInst=" + othrInst + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRANINDTR":
this.setTranIndtr(map.get(key));
break;
case "CNTRPRTY":
this.setCntrPrty(map.get(key));
break;
case "CNTCPRSN":
this.setCntcPrsn(map.get(key));
break;
case "ADDRESS1":
this.setAddress1(map.get(key));
break;
case "ADDRESS2":
this.setAddress2(map.get(key));
break;
case "TRANAMNT":
this.setTranAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "EXCHRATE":
this.setExchRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "EQVLAMNT":
this.setEqvlAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "VALDATE":
this.setValDate(map.get(key));
break;
case "RECVACCT":
this.setRecvAcct(map.get(key));
break;
case "REMARKS":
this.setRemarks(map.get(key));
break;
case "REFNMBR":
this.setRefNmbr(map.get(key));
break;
case "OTHRINST":
this.setOthrInst(map.get(key));
break;}}}}