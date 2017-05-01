package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0811 {

	private int id;
	private String refNmbr;
	private String cntrPrty;
	private String cntcPrsn;
	private BigDecimal tranAmnt;
	private BigDecimal exchRate;
	private BigDecimal eqvlAmnt;
	private String tranTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRefNmbr() {
		return refNmbr;
	}
	public void setRefNmbr(String refNmbr) {
		this.refNmbr = refNmbr;
	}
	public String getCntrPrty() {
		return cntrPrty;
	}
	public void setCntrPrty(String cntrPrty) {
		this.cntrPrty = cntrPrty;
	}
	public String getCntcPrsn() {
		return cntcPrsn;
	}
	public void setCntcPrsn(String cntcPrsn) {
		this.cntcPrsn = cntcPrsn;
	}
	public BigDecimal getTranAmnt() {
		return tranAmnt;
	}
	public void setTranAmnt(BigDecimal tranAmnt) {
		this.tranAmnt = tranAmnt;
	}
	public BigDecimal getExchRate() {
		return exchRate;
	}
	public void setExchRate(BigDecimal exchRate) {
		this.exchRate = exchRate;
	}
	public BigDecimal getEqvlAmnt() {
		return eqvlAmnt;
	}
	public void setEqvlAmnt(BigDecimal eqvlAmnt) {
		this.eqvlAmnt = eqvlAmnt;
	}
	public String getTranTime() {
		return tranTime;
	}
	public void setTranTime(String tranTime) {
}
	@Override
	public String toString() {
		return "T0811 [id=" + id + ", refNmbr=" + refNmbr + ", cntrPrty=" + cntrPrty + ", cntcPrsn=" + cntcPrsn
				+ ", tranAmnt=" + tranAmnt + ", exchRate=" + exchRate + ", eqvlAmnt=" + eqvlAmnt + ", tranTime="
				+ tranTime + "]";
	}
	public void parse(HashMap<String, String> map){
		
		for(String key : map.keySet()){
			switch(key){
				case "REF_NMBR":
					this.setRefNmbr(map.get(key));
					break;
				case "CNTR_PRTY":
					this.setCntrPrty(map.get(key));
					break;
				case "CNTC_PRSN":
					this.setCntrPrty(map.get(key));
					break;
				case "TRAN_AMNT":
					this.setTranAmnt(new BigDecimal(map.get(key)));
					break;
				case "EXCH_RATE":
					this.setExchRate(new BigDecimal(map.get(key)));
					break;
				case "EQVL_AMNT":
					this.setEqvlAmnt(new BigDecimal(map.get(key)));
					break;
				case "TRAN_TIME":
					this.setTranTime(map.get(key));
					break;
			}
		}
	}

}