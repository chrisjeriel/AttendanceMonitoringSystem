package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0307 extends TModelBase {

	private int id;
	private String vTranIndc;
	private String vcLName;
	private String vcFName;
	private String vcMName;
	private BigDecimal vBday;
	private String vTin;
	private String vcAddr1;
	private String vcAddr2;
	private String vtel;
	private String vTranDate;
	private String vTranTime;
	private String vTranUnit;
	private String vRefNo;
	private String vcurrFrom;
	private String vcurrTo;
	private BigDecimal vTranAmnt;
	private BigDecimal vusdAmnt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getvTranIndc() {
		return vTranIndc;
	}

	public void setvTranIndc(String vTranIndc) {
		this.vTranIndc = vTranIndc;
	}

	public String getVcLName() {
		return vcLName;
	}

	public void setVcLName(String vcLName) {
		this.vcLName = vcLName;
	}

	public String getVcFName() {
		return vcFName;
	}

	public void setVcFName(String vcFName) {
		this.vcFName = vcFName;
	}

	public String getVcMName() {
		return vcMName;
	}

	public void setVcMName(String vcMName) {
		this.vcMName = vcMName;
	}

	public BigDecimal getvBday() {
		return vBday;
	}

	public void setvBday(BigDecimal vBday) {
		this.vBday = vBday;
	}

	public String getvTin() {
		return vTin;
	}

	public void setvTin(String vTin) {
		this.vTin = vTin;
	}

	public String getVcAddr1() {
		return vcAddr1;
	}

	public void setVcAddr1(String vcAddr1) {
		this.vcAddr1 = vcAddr1;
	}

	public String getVcAddr2() {
		return vcAddr2;
	}

	public void setVcAddr2(String vcAddr2) {
		this.vcAddr2 = vcAddr2;
	}

	public String getVtel() {
		return vtel;
	}

	public void setVtel(String vtel) {
		this.vtel = vtel;
	}

	public String getvTranDate() {
		return vTranDate;
	}

	public void setvTranDate(String vTranDate) {
		this.vTranDate = vTranDate;
	}

	public String getvTranTime() {
		return vTranTime;
	}

	public void setvTranTime(String vTranTime) {
		this.vTranTime = vTranTime;
	}

	public String getvTranUnit() {
		return vTranUnit;
	}

	public void setvTranUnit(String vTranUnit) {
		this.vTranUnit = vTranUnit;
	}

	public String getvRefNo() {
		return vRefNo;
	}

	public void setvRefNo(String vRefNo) {
		this.vRefNo = vRefNo;
	}

	public String getVcurrFrom() {
		return vcurrFrom;
	}

	public void setVcurrFrom(String vcurrFrom) {
		this.vcurrFrom = vcurrFrom;
	}

	public String getVcurrTo() {
		return vcurrTo;
	}

	public void setVcurrTo(String vcurrTo) {
		this.vcurrTo = vcurrTo;
	}

	public BigDecimal getvTranAmnt() {
		return vTranAmnt;
	}

	public void setvTranAmnt(BigDecimal vTranAmnt) {
		this.vTranAmnt = vTranAmnt;
	}

	public BigDecimal getVusdAmnt() {
		return vusdAmnt;
	}

	public void setVusdAmnt(BigDecimal vusdAmnt) {
		this.vusdAmnt = vusdAmnt;
	}

	@Override
	public String toString() {
		return "T0307 [id=" + id + ", vTranIndc=" + vTranIndc + ", vcLName=" + vcLName + ", vcFName=" + vcFName
				+ ", vcMName=" + vcMName + ", vBday=" + vBday + ", vTin=" + vTin + ", vcAddr1=" + vcAddr1 + ", vcAddr2="
				+ vcAddr2 + ", vtel=" + vtel + ", vTranDate=" + vTranDate + ", vTranTime=" + vTranTime + ", vTranUnit="
				+ vTranUnit + ", vRefNo=" + vRefNo + ", vcurrFrom=" + vcurrFrom + ", vcurrTo=" + vcurrTo
				+ ", vTranAmnt=" + vTranAmnt + ", vusdAmnt=" + vusdAmnt + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "VTRANINDC":
this.setvTranIndc(map.get(key));
break;
case "VCLNAME":
this.setVcLName(map.get(key));
break;
case "VCFNAME":
this.setVcFName(map.get(key));
break;
case "VCMNAME":
this.setVcMName(map.get(key));
break;
case "VBDAY":
this.setvBday(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "VTIN":
this.setvTin(map.get(key));
break;
case "VCADDR1":
this.setVcAddr1(map.get(key));
break;
case "VCADDR2":
this.setVcAddr2(map.get(key));
break;
case "VTEL":
this.setVtel(map.get(key));
break;
case "VTRANDATE":
this.setvTranDate(map.get(key));
break;
case "VTRANTIME":
this.setvTranTime(map.get(key));
break;
case "VTRANUNIT":
this.setvTranUnit(map.get(key));
break;
case "VREFNO":
this.setvRefNo(map.get(key));
break;
case "VCURRFROM":
this.setVcurrFrom(map.get(key));
break;
case "VCURRTO":
this.setVcurrTo(map.get(key));
break;
case "VTRANAMNT":
this.setvTranAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "VUSDAMNT":
this.setVusdAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}