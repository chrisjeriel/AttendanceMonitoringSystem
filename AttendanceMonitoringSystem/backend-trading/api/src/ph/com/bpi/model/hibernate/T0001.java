package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0001 {

	private int id;
	private String gUserId;
	private BigDecimal gUserType;
	private String gbrchName;
	private String glogdate;
	private String gUseraccs;
	private String gTranfi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getgUserId() {
		return gUserId;
	}

	public void setgUserId(String gUserId) {
		this.gUserId = gUserId;
	}

	public BigDecimal getgUserType() {
		return gUserType;
	}

	public void setgUserType(BigDecimal gUserType) {
		this.gUserType = gUserType;
	}

	public String getGbrchName() {
		return gbrchName;
	}

	public void setGbrchName(String gbrchName) {
		this.gbrchName = gbrchName;
	}

	public String getGlogdate() {
		return glogdate;
	}

	public void setGlogdate(String glogdate) {
		this.glogdate = glogdate;
	}

	public String getgUseraccs() {
		return gUseraccs;
	}

	public void setgUseraccs(String gUseraccs) {
		this.gUseraccs = gUseraccs;
	}

	public String getgTranfi() {
		return gTranfi;
	}

	public void setgTranfi(String gTranfi) {
		this.gTranfi = gTranfi;
	}

}