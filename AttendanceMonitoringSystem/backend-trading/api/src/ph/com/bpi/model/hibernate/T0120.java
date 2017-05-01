package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0120 {

	private int id;
	private String trdrFi;
	private String inviCode;
	private String tranCode;
	private String formNmbr;
	private String inviDesc;

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

	public String getInviCode() {
		return inviCode;
	}

	public void setInviCode(String inviCode) {
		this.inviCode = inviCode;
	}

	public String getTranCode() {
		return tranCode;
	}

	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}

	public String getFormNmbr() {
		return formNmbr;
	}

	public void setFormNmbr(String formNmbr) {
		this.formNmbr = formNmbr;
	}

	public String getInviDesc() {
		return inviDesc;
	}

	public void setInviDesc(String inviDesc) {
		this.inviDesc = inviDesc;
	}
	
	public void parse(HashMap<String, String> map){
		for(String key : map.keySet()){
			switch(key){
				case "TRDR_FI":
					this.setTrdrFi(map.get(key));
					break;
				case "INVI_CODE":
					this.setInviCode(map.get(key));
					break;
				case "TRAN_CODE":
					this.setTranCode(map.get(key));
					break;
				case "FORM_NMBR":
					this.setFormNmbr(map.get(key));
					break;
				case "INVI_DESC":
					this.setInviDesc(map.get(key));
					break;
			}
		}
	}

}