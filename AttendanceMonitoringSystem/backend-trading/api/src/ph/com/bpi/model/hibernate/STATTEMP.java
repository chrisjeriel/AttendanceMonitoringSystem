package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class STATTEMP {
	
	private int id;
	private BigDecimal statType;
	private String statTag;
	private String statDesc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal getStatType() {
		return statType;
	}
	public void setStatType(BigDecimal statType) {
		this.statType = statType;
	}
	public String getStatTag() {
		return statTag;
	}
	public void setStatTag(String statTag) {
		this.statTag = statTag;
	}
	public String getStatDesc() {
		return statDesc;
	}
	public void setStatDesc(String statDesc) {
		this.statDesc = statDesc;
	}
	@Override
	public String toString() {
		return "STATTEMP [id=" + id + ", statType=" + statType + ", statTag=" + statTag + ", statDesc=" + statDesc
				+ "]";
	}
	
}
