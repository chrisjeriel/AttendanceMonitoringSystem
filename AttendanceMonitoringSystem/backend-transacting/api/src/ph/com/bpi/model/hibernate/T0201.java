package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0201 extends TModelBase{

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

	@Override
	public String toString() {
		return "T0201 [id=" + id + ", trdrFi=" + trdrFi + ", seqnNo=" + seqnNo + ", spreads=" + spreads + "]";
	}
	@Override
	public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key){
				case "TRDR_FI":
					this.setTrdrFi((map.get(key)));
					break;
				case "SEQN_NO":
					this.setSeqnNo((BigDecimal.valueOf(Long.valueOf(map.get(key)))));
					break;	
				case "SPREADS":
					this.setSpreads((BigDecimal.valueOf(Long.valueOf(map.get(key)))));
					break;
			}
		}

	}

}