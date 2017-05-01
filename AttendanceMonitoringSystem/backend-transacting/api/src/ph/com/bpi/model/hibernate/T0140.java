package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0140 extends TModelBase{

	private int id;
	private BigDecimal userType;
	private String userDesc;
	private BigDecimal ovrdPt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getUserType() {
		return userType;
	}

	public void setUserType(BigDecimal userType) {
		this.userType = userType;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	public BigDecimal getOvrdPt() {
		return ovrdPt;
	}

	public void setOvrdPt(BigDecimal ovrdPt) {
		this.ovrdPt = ovrdPt;
	}

	@Override
	public String toString() {
		return "T0140 [id=" + id + ", userType=" + userType + ", userDesc=" + userDesc + ", ovrdPt=" + ovrdPt + "]";
	}
	@Override
	public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key){
				case "USER_TYPE":
					this.setUserType(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
				case "USER_DESC":
					this.setUserDesc((map.get(key)));
					break;		
				case "OVRD_PT":
					this.setOvrdPt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;	
			}
		}

	}
}