package ph.com.bpi.model.hibernate;

public class FXPARAM {

	private int id;
	private String sysname;
	private String version;
	private String mfregion;
	private String mfapplid;
	private String tranid;
	private String prevdate;
	private String traderfi;
	private String rateOvrd;
	private String tranOvrd;
	private String lockRate;
	private String systest;
	private String sysoffc;
	private String valdUser;
	private String retdays;
	private String systimer;
	private String sysalarm01;
	private String sysalarm02;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSysname() {
		return sysname;
	}
	public void setSysname(String sysname) {
		this.sysname = sysname;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getMfregion() {
		return mfregion;
	}
	public void setMfregion(String mfregion) {
		this.mfregion = mfregion;
	}
	public String getMfapplid() {
		return mfapplid;
	}
	public void setMfapplid(String mfapplid) {
		this.mfapplid = mfapplid;
	}
	public String getTranid() {
		return tranid;
	}
	public void setTranid(String tranid) {
		this.tranid = tranid;
	}
	public String getPrevdate() {
		return prevdate;
	}
	public void setPrevdate(String prevdate) {
		this.prevdate = prevdate;
	}
	public String getTraderfi() {
		return traderfi;
	}
	public void setTraderfi(String traderfi) {
		this.traderfi = traderfi;
	}
	public String getRateOvrd() {
		return rateOvrd;
	}
	public void setRateOvrd(String rateOvrd) {
		this.rateOvrd = rateOvrd;
	}
	public String getTranOvrd() {
		return tranOvrd;
	}
	public void setTranOvrd(String tranOvrd) {
		this.tranOvrd = tranOvrd;
	}
	public String getLockRate() {
		return lockRate;
	}
	public void setLockRate(String lockRate) {
		this.lockRate = lockRate;
	}
	public String getSystest() {
		return systest;
	}
	public void setSystest(String systest) {
		this.systest = systest;
	}
	public String getSysoffc() {
		return sysoffc;
	}
	public void setSysoffc(String sysoffc) {
		this.sysoffc = sysoffc;
	}
	public String getValdUser() {
		return valdUser;
	}
	public void setValdUser(String valdUser) {
		this.valdUser = valdUser;
	}
	public String getRetdays() {
		return retdays;
	}
	public void setRetdays(String retdays) {
		this.retdays = retdays;
	}
	public String getSystimer() {
		return systimer;
	}
	public void setSystimer(String systimer) {
		this.systimer = systimer;
	}
	public String getSysalarm01() {
		return sysalarm01;
	}
	public void setSysalarm01(String sysalarm01) {
		this.sysalarm01 = sysalarm01;
	}
	public String getSysalarm02() {
		return sysalarm02;
	}
	public void setSysalarm02(String sysalarm02) {
		this.sysalarm02 = sysalarm02;
	}
	@Override
	public String toString() {
		return "FXPARAM [id=" + id + ", sysname=" + sysname + ", version=" + version + ", mfregion=" + mfregion
				+ ", mfapplid=" + mfapplid + ", tranid=" + tranid + ", prevdate=" + prevdate + ", traderfi=" + traderfi
				+ ", rateOvrd=" + rateOvrd + ", tranOvrd=" + tranOvrd + ", lockRate=" + lockRate + ", systest="
				+ systest + ", sysoffc=" + sysoffc + ", valdUser=" + valdUser + ", retdays=" + retdays + ", systimer="
				+ systimer + ", sysalarm01=" + sysalarm01 + ", sysalarm02=" + sysalarm02 + "]";
	}
	
}
