package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0600_2 extends TModelBase {

	private int id;
	private String trdrFi;
	private String bank;
	private BigDecimal book;
	private String appl;
	private String curr;
	private BigDecimal prch;
	private BigDecimal sale;
	private BigDecimal unco;
	private BigDecimal cons;
	private BigDecimal unld;
	private BigDecimal totl;

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

	public String getAppl() {
		return appl;
	}

	public void setAppl(String appl) {
		this.appl = appl;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public BigDecimal getPrch() {
		return prch;
	}

	public void setPrch(BigDecimal prch) {
		this.prch = prch;
	}

	public BigDecimal getSale() {
		return sale;
	}

	public void setSale(BigDecimal sale) {
		this.sale = sale;
	}

	public BigDecimal getUnco() {
		return unco;
	}

	public void setUnco(BigDecimal unco) {
		this.unco = unco;
	}

	public BigDecimal getCons() {
		return cons;
	}

	public void setCons(BigDecimal cons) {
		this.cons = cons;
	}

	public BigDecimal getUnld() {
		return unld;
	}

	public void setUnld(BigDecimal unld) {
		this.unld = unld;
	}

	public BigDecimal getTotl() {
		return totl;
	}

	public void setTotl(BigDecimal totl) {
		this.totl = totl;
	}

	@Override
	public String toString() {
		return "T0600_2 [id=" + id + ", trdrFi=" + trdrFi + ", bank=" + bank + ", book=" + book + ", appl=" + appl
				+ ", curr=" + curr + ", prch=" + prch + ", sale=" + sale + ", unco=" + unco + ", cons=" + cons
				+ ", unld=" + unld + ", totl=" + totl + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRDRFI":
this.setTrdrFi(map.get(key));
break;
case "BANK":
this.setBank(map.get(key));
break;
case "BOOK":
this.setBook(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "APPL":
this.setAppl(map.get(key));
break;
case "CURR":
this.setCurr(map.get(key));
break;
case "PRCH":
this.setPrch(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SALE":
this.setSale(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "UNCO":
this.setUnco(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "CONS":
this.setCons(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "UNLD":
this.setUnld(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "TOTL":
this.setTotl(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}