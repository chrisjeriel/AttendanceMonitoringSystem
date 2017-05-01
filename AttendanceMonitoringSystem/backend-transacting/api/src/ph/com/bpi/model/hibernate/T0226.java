package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0226 extends TModelBase {

	private int id;
	private String trdrFi;
	private String tranFi;
	private String currCode;
	private BigDecimal tierNmbr;
	private BigDecimal amntFrom;
	private BigDecimal amntTo;
	private BigDecimal prchSprd;
	private BigDecimal saleSprd;

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

	public String getTranFi() {
		return tranFi;
	}

	public void setTranFi(String tranFi) {
		this.tranFi = tranFi;
	}

	public String getCurrCode() {
		return currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public BigDecimal getTierNmbr() {
		return tierNmbr;
	}

	public void setTierNmbr(BigDecimal tierNmbr) {
		this.tierNmbr = tierNmbr;
	}

	public BigDecimal getAmntFrom() {
		return amntFrom;
	}

	public void setAmntFrom(BigDecimal amntFrom) {
		this.amntFrom = amntFrom;
	}

	public BigDecimal getAmntTo() {
		return amntTo;
	}

	public void setAmntTo(BigDecimal amntTo) {
		this.amntTo = amntTo;
	}

	public BigDecimal getPrchSprd() {
		return prchSprd;
	}

	public void setPrchSprd(BigDecimal prchSprd) {
		this.prchSprd = prchSprd;
	}

	public BigDecimal getSaleSprd() {
		return saleSprd;
	}

	public void setSaleSprd(BigDecimal saleSprd) {
		this.saleSprd = saleSprd;
	}

	@Override
	public String toString() {
		return "T0226 [id=" + id + ", trdrFi=" + trdrFi + ", tranFi=" + tranFi + ", currCode=" + currCode
				+ ", tierNmbr=" + tierNmbr + ", amntFrom=" + amntFrom + ", amntTo=" + amntTo + ", prchSprd=" + prchSprd
				+ ", saleSprd=" + saleSprd + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRDRFI":
this.setTrdrFi(map.get(key));
break;
case "TRANFI":
this.setTranFi(map.get(key));
break;
case "CURRCODE":
this.setCurrCode(map.get(key));
break;
case "TIERNMBR":
this.setTierNmbr(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "AMNTFROM":
this.setAmntFrom(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "AMNTTO":
this.setAmntTo(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "PRCHSPRD":
this.setPrchSprd(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SALESPRD":
this.setSaleSprd(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}