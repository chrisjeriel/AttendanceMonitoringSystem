package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0502 extends TModelBase {

	private int id;
	private String tranFi;
	private String tranUnit;
	private String currCode;
	private BigDecimal seqNo;
	private BigDecimal amount;
	private String userId;
	private String termId;
	private BigDecimal timeStmp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTranFi() {
		return tranFi;
	}

	public void setTranFi(String tranFi) {
		this.tranFi = tranFi;
	}

	public String getTranUnit() {
		return tranUnit;
	}

	public void setTranUnit(String tranUnit) {
		this.tranUnit = tranUnit;
	}

	public String getCurrCode() {
		return currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public BigDecimal getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(BigDecimal seqNo) {
		this.seqNo = seqNo;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public BigDecimal getTimeStmp() {
		return timeStmp;
	}

	public void setTimeStmp(BigDecimal timeStmp) {
		this.timeStmp = timeStmp;
	}

	@Override
	public String toString() {
		return "T0502 [id=" + id + ", tranFi=" + tranFi + ", tranUnit=" + tranUnit + ", currCode=" + currCode
				+ ", seqNo=" + seqNo + ", amount=" + amount + ", userId=" + userId + ", termId=" + termId
				+ ", timeStmp=" + timeStmp + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRANFI":
this.setTranFi(map.get(key));
break;
case "TRANUNIT":
this.setTranUnit(map.get(key));
break;
case "CURRCODE":
this.setCurrCode(map.get(key));
break;
case "SEQNO":
this.setSeqNo(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "AMOUNT":
this.setAmount(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "USERID":
this.setUserId(map.get(key));
break;
case "TERMID":
this.setTermId(map.get(key));
break;
case "TIMESTMP":
this.setTimeStmp(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}