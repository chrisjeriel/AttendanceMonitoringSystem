package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0501 extends TModelBase{

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
		return "T0501 [id=" + id + ", tranFi=" + tranFi + ", tranUnit=" + tranUnit + ", currCode=" + currCode
				+ ", mIflow=" + mIflow + ", tIflow=" + tIflow + ", mOflow=" + mOflow + ", tOflow=" + tOflow
				+ ", runnBaln=" + runnBaln + "]";
	}

	@Override
	public void parse(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		for(String key: map.keySet()){
		switch(key){
			case "TRAN_FI":
				this.setTranFi(map.get(key));
				break;
			case "CURR_CODE":
				this.setCurrCode((map.get(key)));
				break;	
			case "TRAN_UNIT":
				this.setTranUnit(map.get(key));
				break;
			case "M_IFLOW":
				this.setmIflow(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			case "T_IFLOW":
				this.settIflow(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;	
			case "M_OFLOW":
				this.setmOflow(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			case "T_OFLOW":
				this.settOflow(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			case "RUNN_BALN":
				this.setRunnBaln(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
	}
}
		
	}

}