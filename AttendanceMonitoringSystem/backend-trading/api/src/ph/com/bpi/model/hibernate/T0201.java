package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0201 {

private int id;
private String trdrFi;
private BigDecimal seqnNo;
private BigDecimal spreads;
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
public BigDecimal getSeqnNo() {
	return seqnNo;
}
public void setSeqnNo(BigDecimal seqnNo) {
	this.seqnNo = seqnNo;
}
public BigDecimal getSpreads() {
	return spreads;
}
public void setSpreads(BigDecimal spreads) {
	this.spreads = spreads;
}

}