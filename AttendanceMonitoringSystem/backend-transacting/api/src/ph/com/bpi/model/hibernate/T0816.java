package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0816 extends TModelBase {

	private int id;
	private String acctNmbr;
	private String loaNmbr;
	private String cntrPrty;
	private String address1;
	private String address2;
	private BigDecimal tranAmnt;
	private String recvAcct;
	private String bankName;
	private String valDate;
	private String othrInst;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcctNmbr() {
		return acctNmbr;
	}

	public void setAcctNmbr(String acctNmbr) {
		this.acctNmbr = acctNmbr;
	}

	public String getLoaNmbr() {
		return loaNmbr;
	}

	public void setLoaNmbr(String loaNmbr) {
		this.loaNmbr = loaNmbr;
	}

	public String getCntrPrty() {
		return cntrPrty;
	}

	public void setCntrPrty(String cntrPrty) {
		this.cntrPrty = cntrPrty;
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

	public String getRecvAcct() {
		return recvAcct;
	}

	public void setRecvAcct(String recvAcct) {
		this.recvAcct = recvAcct;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getValDate() {
		return valDate;
	}

	public void setValDate(String valDate) {
		this.valDate = valDate;
	}

	public String getOthrInst() {
		return othrInst;
	}

	public void setOthrInst(String othrInst) {
		this.othrInst = othrInst;
	}

	@Override
	public String toString() {
		return "T0816 [id=" + id + ", acctNmbr=" + acctNmbr + ", loaNmbr=" + loaNmbr + ", cntrPrty=" + cntrPrty
				+ ", address1=" + address1 + ", address2=" + address2 + ", tranAmnt=" + tranAmnt + ", recvAcct="
				+ recvAcct + ", bankName=" + bankName + ", valDate=" + valDate + ", othrInst=" + othrInst + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "ACCTNMBR":
this.setAcctNmbr(map.get(key));
break;
case "LOANMBR":
this.setLoaNmbr(map.get(key));
break;
case "CNTRPRTY":
this.setCntrPrty(map.get(key));
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
case "RECVACCT":
this.setRecvAcct(map.get(key));
break;
case "BANKNAME":
this.setBankName(map.get(key));
break;
case "VALDATE":
this.setValDate(map.get(key));
break;
case "OTHRINST":
this.setOthrInst(map.get(key));
break;}}}}