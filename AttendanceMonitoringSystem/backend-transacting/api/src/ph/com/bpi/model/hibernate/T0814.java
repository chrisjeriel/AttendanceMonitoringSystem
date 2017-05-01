package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0814 extends TModelBase {

	private int id;
	private String refNmbr;
	private String cntrPrty;
	private String cntcPrsn;
	private BigDecimal tranAmnt;
	private BigDecimal exchRate;
	private BigDecimal eqvlAmnt;

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

	@Override
	public String toString() {
		return "T0814 [id=" + id + ", refNmbr=" + refNmbr + ", cntrPrty=" + cntrPrty + ", cntcPrsn=" + cntcPrsn
				+ ", tranAmnt=" + tranAmnt + ", exchRate=" + exchRate + ", eqvlAmnt=" + eqvlAmnt + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "REFNMBR":
this.setRefNmbr(map.get(key));
break;
case "CNTRPRTY":
this.setCntrPrty(map.get(key));
break;
case "CNTCPRSN":
this.setCntcPrsn(map.get(key));
break;
case "TRANAMNT":
this.setTranAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "EXCHRATE":
this.setExchRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "EQVLAMNT":
this.setEqvlAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}