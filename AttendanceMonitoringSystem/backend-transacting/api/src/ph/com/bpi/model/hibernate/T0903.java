package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0903 extends TModelBase{

	private int id;
	private String tranIndc;
	private String cLName;
	private String cFName;
	private String cMName;
	private BigDecimal accuAmnt;
	private BigDecimal accuAmnt2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTranIndc() {
		return tranIndc;
	}

	public void setTranIndc(String tranIndc) {
		this.tranIndc = tranIndc;
	}

	public String getcLName() {
		return cLName;
	}

	public void setcLName(String cLName) {
		this.cLName = cLName;
	}

	public String getcFName() {
		return cFName;
	}

	public void setcFName(String cFName) {
		this.cFName = cFName;
	}

	public String getcMName() {
		return cMName;
	}

	public void setcMName(String cMName) {
		this.cMName = cMName;
	}

	public BigDecimal getAccuAmnt() {
		return accuAmnt;
	}

	public void setAccuAmnt(BigDecimal accuAmnt) {
		this.accuAmnt = accuAmnt;
	}

	public BigDecimal getAccuAmnt2() {
		return accuAmnt2;
	}

	public void setAccuAmnt2(BigDecimal accuAmnt2) {
		this.accuAmnt2 = accuAmnt2;
	}

	@Override
	public String toString() {
		return "T0903 [id=" + id + ", tranIndc=" + tranIndc + ", cLName=" + cLName + ", cFName=" + cFName + ", cMName="
				+ cMName + ", accuAmnt=" + accuAmnt + ", accuAmnt2=" + accuAmnt2 + "]";
	}

	@Override
	public void parse(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		for(String key: map.keySet()){
			switch(key){
				case "TRAN_INDC":
					this.setTranIndc(map.get(key));
					break;

				case "C_LNAME":
					this.setcLName(map.get(key));
					break;

				case "C_FNAME":
					this.setcFName(map.get(key));
					break;

				case "C_MNAME":
					this.setcMName(map.get(key));
					break;

				case "ACCM_AMNT":
					this.setAccuAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;

				case "ACCM_AMNT2":
					this.setAccuAmnt2(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
			}
		}
	}

}