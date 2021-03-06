package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0304 extends TModelBase {

	private int id;
	private String trdrFi;
	private BigDecimal modeIndc;
	private BigDecimal acptMode;
	private String acptDesc;
	private BigDecimal setlMode;
	private String setlDesc;

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

	public BigDecimal getModeIndc() {
		return modeIndc;
	}

	public void setModeIndc(BigDecimal modeIndc) {
		this.modeIndc = modeIndc;
	}

	public BigDecimal getAcptMode() {
		return acptMode;
	}

	public void setAcptMode(BigDecimal acptMode) {
		this.acptMode = acptMode;
	}

	public String getAcptDesc() {
		return acptDesc;
	}

	public void setAcptDesc(String acptDesc) {
		this.acptDesc = acptDesc;
	}

	public BigDecimal getSetlMode() {
		return setlMode;
	}

	public void setSetlMode(BigDecimal setlMode) {
		this.setlMode = setlMode;
	}

	public String getSetlDesc() {
		return setlDesc;
	}

	public void setSetlDesc(String setlDesc) {
		this.setlDesc = setlDesc;
	}

	@Override
	public String toString() {
		return "T0304 [id=" + id + ", trdrFi=" + trdrFi + ", modeIndc=" + modeIndc + ", acptMode=" + acptMode
				+ ", acptDesc=" + acptDesc + ", setlMode=" + setlMode + ", setlDesc=" + setlDesc + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRDRFI":
this.setTrdrFi(map.get(key));
break;
case "MODEINDC":
this.setModeIndc(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "ACPTMODE":
this.setAcptMode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "ACPTDESC":
this.setAcptDesc(map.get(key));
break;
case "SETLMODE":
this.setSetlMode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SETLDESC":
this.setSetlDesc(map.get(key));
break;}}}}