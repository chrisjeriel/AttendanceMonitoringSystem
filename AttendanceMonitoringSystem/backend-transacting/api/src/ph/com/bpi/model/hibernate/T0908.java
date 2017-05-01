package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0908 extends TModelBase {

	private int id;
	private String trdrFi;
	private BigDecimal regAmnt;
	private BigDecimal fcdAmnt;

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

	public BigDecimal getRegAmnt() {
		return regAmnt;
	}

	public void setRegAmnt(BigDecimal regAmnt) {
		this.regAmnt = regAmnt;
	}

	public BigDecimal getFcdAmnt() {
		return fcdAmnt;
	}

	public void setFcdAmnt(BigDecimal fcdAmnt) {
		this.fcdAmnt = fcdAmnt;
	}

	@Override
	public String toString() {
		return "T0908 [id=" + id + ", trdrFi=" + trdrFi + ", regAmnt=" + regAmnt + ", fcdAmnt=" + fcdAmnt + "]";
	}

	@Override
	public void parse(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		for (String key :map.keySet())
		{
			switch(key)
			{
			case "TRDR_FI":
				this.setTrdrFi(map.get(key));
				break;
			case "REG_AMNT":
				this.setRegAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			case "FCD_AMNT":
				this.setFcdAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			}
		}
		
	}

}