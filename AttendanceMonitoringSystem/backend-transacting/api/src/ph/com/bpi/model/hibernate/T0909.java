package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0909 extends TModelBase {

	private int id;
	private String bank;
	private BigDecimal book;
	private String cntrCurr;
	private String origCurr;
	private BigDecimal prchAmnt;
	private BigDecimal prchCost;
	private BigDecimal saleAmnt;
	private BigDecimal saleCost;
	private BigDecimal netAmnt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public BigDecimal getBook() {
		return book;
	}

	public void setBook(BigDecimal book) {
		this.book = book;
	}

	public String getCntrCurr() {
		return cntrCurr;
	}

	public void setCntrCurr(String cntrCurr) {
		this.cntrCurr = cntrCurr;
	}

	public String getOrigCurr() {
		return origCurr;
	}

	public void setOrigCurr(String origCurr) {
		this.origCurr = origCurr;
	}

	public BigDecimal getPrchAmnt() {
		return prchAmnt;
	}

	public void setPrchAmnt(BigDecimal prchAmnt) {
		this.prchAmnt = prchAmnt;
	}

	public BigDecimal getPrchCost() {
		return prchCost;
	}

	public void setPrchCost(BigDecimal prchCost) {
		this.prchCost = prchCost;
	}

	public BigDecimal getSaleAmnt() {
		return saleAmnt;
	}

	public void setSaleAmnt(BigDecimal saleAmnt) {
		this.saleAmnt = saleAmnt;
	}

	public BigDecimal getSaleCost() {
		return saleCost;
	}

	public void setSaleCost(BigDecimal saleCost) {
		this.saleCost = saleCost;
	}

	public BigDecimal getNetAmnt() {
		return netAmnt;
	}

	public void setNetAmnt(BigDecimal netAmnt) {
		this.netAmnt = netAmnt;
	}

	@Override
	public String toString() {
		return "T0909 [id=" + id + ", bank=" + bank + ", book=" + book + ", cntrCurr=" + cntrCurr + ", origCurr="
				+ origCurr + ", prchAmnt=" + prchAmnt + ", prchCost=" + prchCost + ", saleAmnt=" + saleAmnt
				+ ", saleCost=" + saleCost + ", netAmnt=" + netAmnt + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "BANK":
this.setBank(map.get(key));
break;
case "BOOK":
this.setBook(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "CNTRCURR":
this.setCntrCurr(map.get(key));
break;
case "ORIGCURR":
this.setOrigCurr(map.get(key));
break;
case "PRCHAMNT":
this.setPrchAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "PRCHCOST":
this.setPrchCost(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SALEAMNT":
this.setSaleAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SALECOST":
this.setSaleCost(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "NETAMNT":
this.setNetAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}