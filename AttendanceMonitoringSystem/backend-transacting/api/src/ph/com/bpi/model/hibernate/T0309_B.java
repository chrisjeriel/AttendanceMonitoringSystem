package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0309_B extends TModelBase {

	private int id;
	private String refNmbr;
	private BigDecimal acctNmbr;
	private BigDecimal tranAmnt;
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

	public BigDecimal getAcctNmbr() {
		return acctNmbr;
	}

	public void setAcctNmbr(BigDecimal acctNmbr) {
		this.acctNmbr = acctNmbr;
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

	@Override
	public String toString() {
		return "T0309_B [id=" + id + ", refNmbr=" + refNmbr + ", acctNmbr=" + acctNmbr + ", tranAmnt=" + tranAmnt
				+ ", eqvlAmnt=" + eqvlAmnt + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "REFNMBR":
this.setRefNmbr(map.get(key));
break;
case "ACCTNMBR":
this.setAcctNmbr(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "TRANAMNT":
this.setTranAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "EQVLAMNT":
this.setEqvlAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}