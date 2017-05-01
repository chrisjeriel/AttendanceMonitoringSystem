package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class FXMCRO {
	
	private int id;
	private BigDecimal mcroTag;
	private String mcroName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal getMcroTag() {
		return mcroTag;
	}
	public void setMcroTag(BigDecimal mcroTag) {
		this.mcroTag = mcroTag;
	}
	public String getMcroName() {
		return mcroName;
	}
	public void setMcroName(String mcroName) {
		this.mcroName = mcroName;
	}
	@Override
	public String toString() {
		return "FXMCRO [id=" + id + ", mcroTag=" + mcroTag + ", mcroName=" + mcroName + "]";
	}

}
