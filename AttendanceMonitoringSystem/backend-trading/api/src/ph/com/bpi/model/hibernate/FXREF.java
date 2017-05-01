package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class FXREF {

	private int id;
	private String rTable;
	private String rFile;
	private String rDummy;
	private String rGet;
	private String rSuccess;
	private String rUsers;
	private String rUpdate;
	private String rStat;
	private String rIxfld1;
	private String rIxnme1;
	private String rIxfld2;
	private String rIxnme2;
	private String rDelefld;
	private BigDecimal rDelelen;
	private String lUpdate;
	private String lTime;
	private String lReason;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getrTable() {
		return rTable;
	}
	public void setrTable(String rTable) {
		this.rTable = rTable;
	}
	public String getrFile() {
		return rFile;
	}
	public void setrFile(String rFile) {
		this.rFile = rFile;
	}
	public String getrDummy() {
		return rDummy;
	}
	public void setrDummy(String rDummy) {
		this.rDummy = rDummy;
	}
	public String getrGet() {
		return rGet;
	}
	public void setrGet(String rGet) {
		this.rGet = rGet;
	}
	public String getrSuccess() {
		return rSuccess;
	}
	public void setrSuccess(String rSuccess) {
		this.rSuccess = rSuccess;
	}
	public String getrUsers() {
		return rUsers;
	}
	public void setrUsers(String rUsers) {
		this.rUsers = rUsers;
	}
	public String getrStat() {
		return rStat;
	}
	public void setrStat(String rStat) {
		this.rStat = rStat;
	}
	public String getrIxfld1() {
		return rIxfld1;
	}
	public void setrIxfld1(String rIxfld1) {
		this.rIxfld1 = rIxfld1;
	}
	public String getrUpdate() {
		return rUpdate;
	}
	public void setrUpdate(String rUpdate) {
		this.rUpdate = rUpdate;
	}
	public String getrIxnme1() {
		return rIxnme1;
	}
	public void setrIxnme1(String rIxnme1) {
		this.rIxnme1 = rIxnme1;
	}
	public String getrIxfld2() {
		return rIxfld2;
	}
	public void setrIxfld2(String rIxfld2) {
		this.rIxfld2 = rIxfld2;
	}
	public String getrIxnme2() {
		return rIxnme2;
	}
	public void setrIxnme2(String rIxnme2) {
		this.rIxnme2 = rIxnme2;
	}
	public String getrDelefld() {
		return rDelefld;
	}
	public void setrDelefld(String rDelefld) {
		this.rDelefld = rDelefld;
	}
	public BigDecimal getrDelelen() {
		return rDelelen;
	}
	public void setrDelelen(BigDecimal rDelelen) {
		this.rDelelen = rDelelen;
	}
	public String getlUpdate() {
		return lUpdate;
	}
	public void setlUpdate(String lUpdate) {
		this.lUpdate = lUpdate;
	}
	public String getlTime() {
		return lTime;
	}
	public void setlTime(String lTime) {
		this.lTime = lTime;
	}
	public String getlReason() {
		return lReason;
	}
	public void setlReason(String lReason) {
		this.lReason = lReason;
	}
	@Override
	public String toString() {
		return "FXREF [id=" + id + ", rTable=" + rTable + ", rFile=" + rFile + ", rDummy=" + rDummy + ", rGet=" + rGet
				+ ", rSuccess=" + rSuccess + ", rUsers=" + rUsers + ", rUpate=" + rUpdate + ", rStat=" + rStat
				+ ", rIxfld1=" + rIxfld1 + ", rIxnme1=" + rIxnme1 + ", rIxfld2=" + rIxfld2 + ", rIxnme2=" + rIxnme2
				+ ", rDelefld=" + rDelefld + ", rDelelen=" + rDelelen + ", lUpdate=" + lUpdate + ", lTime=" + lTime
				+ ", lReason=" + lReason + "]";
	}
	
}
