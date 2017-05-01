package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0804 extends TModelBase {

	private int id;
	private String bankCode;
	private String cntrPrty;
	private String cntcPrsn;
	private String address1;
	private String address2;
	private String recvAcct;
	private String bankName;
	private String othrInst;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
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

	public String getOthrInst() {
		return othrInst;
	}

	public void setOthrInst(String othrInst) {
		this.othrInst = othrInst;
	}

	@Override
	public String toString() {
		return "T0804 [id=" + id + ", bankCode=" + bankCode + ", cntrPrty=" + cntrPrty + ", cntcPrsn=" + cntcPrsn
				+ ", address1=" + address1 + ", address2=" + address2 + ", recvAcct=" + recvAcct + ", bankName="
				+ bankName + ", othrInst=" + othrInst + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "BANKCODE":
this.setBankCode(map.get(key));
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
case "RECVACCT":
this.setRecvAcct(map.get(key));
break;
case "BANKNAME":
this.setBankName(map.get(key));
break;
case "OTHRINST":
this.setOthrInst(map.get(key));
break;}}}}