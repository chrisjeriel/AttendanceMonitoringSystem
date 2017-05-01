package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class FXMENUD {
	
	private int id;
	private String itemName;
	private String caption;
	private String action;
	private BigDecimal level;
	private BigDecimal status;
	private BigDecimal accssLoc;
	private String tag;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public BigDecimal getLevel() {
		return level;
	}
	public void setLevel(BigDecimal level) {
		this.level = level;
	}
	public BigDecimal getStatus() {
		return status;
	}
	public void setStatus(BigDecimal status) {
		this.status = status;
	}
	public BigDecimal getAccssLoc() {
		return accssLoc;
	}
	public void setAccssLoc(BigDecimal accssLoc) {
		this.accssLoc = accssLoc;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "FXMENUD [id=" + id + ", itemName=" + itemName + ", caption=" + caption + ", action=" + action
				+ ", level=" + level + ", status=" + status + ", accssLoc=" + accssLoc + ", tag=" + tag + "]";
	}
	


}
