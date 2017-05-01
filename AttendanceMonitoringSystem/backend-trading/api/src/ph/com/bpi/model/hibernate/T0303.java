package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0303 {

private int id;
private BigDecimal equiAmnt;
private BigDecimal docStmp1;
private BigDecimal comm1;
private BigDecimal docStmp2;
private BigDecimal comm2;
private BigDecimal tcPost1;
private BigDecimal tcPost2;
private BigDecimal netAmnt;
private BigDecimal ovrdPt;
private BigDecimal tranTag;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public BigDecimal getEquiAmnt() {
	return equiAmnt;
}
public void setEquiAmnt(BigDecimal equiAmnt) {
	this.equiAmnt = equiAmnt;
}
public BigDecimal getDocStmp1() {
	return docStmp1;
}
public void setDocStmp1(BigDecimal docStmp1) {
	this.docStmp1 = docStmp1;
}
public BigDecimal getComm1() {
	return comm1;
}
public void setComm1(BigDecimal comm1) {
	this.comm1 = comm1;
}
public BigDecimal getDocStmp2() {
	return docStmp2;
}
public void setDocStmp2(BigDecimal docStmp2) {
	this.docStmp2 = docStmp2;
}
public BigDecimal getComm2() {
	return comm2;
}
public void setComm2(BigDecimal comm2) {
	this.comm2 = comm2;
}
public BigDecimal getTcPost1() {
	return tcPost1;
}
public void setTcPost1(BigDecimal tcPost1) {
	this.tcPost1 = tcPost1;
}
public BigDecimal getTcPost2() {
	return tcPost2;
}
public void setTcPost2(BigDecimal tcPost2) {
	this.tcPost2 = tcPost2;
}
public BigDecimal getNetAmnt() {
	return netAmnt;
}
public void setNetAmnt(BigDecimal netAmnt) {
	this.netAmnt = netAmnt;
}
public BigDecimal getOvrdPt() {
	return ovrdPt;
}
public void setOvrdPt(BigDecimal ovrdPt) {
	this.ovrdPt = ovrdPt;
}
public BigDecimal getTranTag() {
	return tranTag;
}
public void setTranTag(BigDecimal tranTag) {
	this.tranTag = tranTag;
}

}