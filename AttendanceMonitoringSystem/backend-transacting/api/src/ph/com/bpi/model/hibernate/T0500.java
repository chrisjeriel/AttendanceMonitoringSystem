package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0500 extends TModelBase {

	private int id;
	private String tranFi;
	private String tranUnit;
	private String currCode;
	private BigDecimal mIflow;
	private BigDecimal tIflow;
	private BigDecimal mOflow;
	private BigDecimal tOflow;
	private BigDecimal runnBaln;

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

	public BigDecimal getmIflow() {
		return mIflow;
	}

	public void setmIflow(BigDecimal mIflow) {
		this.mIflow = mIflow;
	}

	public BigDecimal gettIflow() {
		return tIflow;
	}

	public void settIflow(BigDecimal tIflow) {
		this.tIflow = tIflow;
	}

	public BigDecimal getmOflow() {
		return mOflow;
	}

	public void setmOflow(BigDecimal mOflow) {
		this.mOflow = mOflow;
	}

	public BigDecimal gettOflow() {
		return tOflow;
	}

	public void settOflow(BigDecimal tOflow) {
		this.tOflow = tOflow;
	}

	public BigDecimal getRunnBaln() {
		return runnBaln;
	}

	public void setRunnBaln(BigDecimal runnBaln) {
		this.runnBaln = runnBaln;
	}

	@Override
	public String toString() {
		return "T0500 [id=" + id + ", tranFi=" + tranFi + ", tranUnit=" + tranUnit + ", currCode=" + currCode
				+ ", mIflow=" + mIflow + ", tIflow=" + tIflow + ", mOflow=" + mOflow + ", tOflow=" + tOflow
				+ ", runnBaln=" + runnBaln + "]";
	

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
case "MIFLOW":
this.setmIflow(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "TIFLOW":
this.settIflow(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "MOFLOW":
this.setmOflow(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "TOFLOW":
this.settOflow(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "RUNNBALN":
this.setRunnBaln(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}