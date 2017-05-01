package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0305 {

private int id;
private String tranIndc;
private BigDecimal acptStat;
private BigDecimal setlStat;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTranIndc() {
	return tranIndc;
}
public void setTranIndc(String tranIndc) {
	this.tranIndc = tranIndc;
}
public BigDecimal getAcptStat() {
	return acptStat;
}
public void setAcptStat(BigDecimal acptStat) {
	this.acptStat = acptStat;
}
public BigDecimal getSetlStat() {
	return setlStat;
}
public void setSetlStat(BigDecimal setlStat) {
	this.setlStat = setlStat;
}

}