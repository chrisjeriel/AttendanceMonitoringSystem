package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0115 extends TModelBase{

	private int id;
	private BigDecimal modeCode;
	private String modeDesc;
	private BigDecimal mcroTag;
	private String actvTag;
	private String phpTag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getModeCode() {
		return modeCode;
	}

	public void setModeCode(BigDecimal modeCode) {
		this.modeCode = modeCode;
	}

	public String getModeDesc() {
		return modeDesc;
	}

	public void setModeDesc(String modeDesc) {
		this.modeDesc = modeDesc;
	}

	public BigDecimal getMcroTag() {
		return mcroTag;
	}

	public void setMcroTag(BigDecimal mcroTag) {
		this.mcroTag = mcroTag;
	}

	public String getActvTag() {
		return actvTag;
	}

	public void setActvTag(String actvTag) {
		this.actvTag = actvTag;
	}

	public String getPhpTag() {
		return phpTag;
	}

	public void setPhpTag(String phpTag) {
		this.phpTag = phpTag;
	}

	@Override
	public String toString() {
		return "T0115 [id=" + id + ", modeCode=" + modeCode + ", modeDesc=" + modeDesc + ", mcroTag=" + mcroTag
				+ ", actvTag=" + actvTag + ", phpTag=" + phpTag + "]";
	}

	@Override
	public void parse(HashMap<String, String> map) {
		// TODO Auto-generated method stub

		for(String key: map.keySet()){
			switch(key){
				case "MODE_CODE":
					this.setModeCode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
				case "MODE_DESC":
					this.setModeDesc(map.get(key));
					break;
				case "MCRO_TAG":
					this.setMcroTag(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
				case "ACTV_TAG":
					this.setActvTag(map.get(key));
					break;
				case "PHP_TAG":
					this.setPhpTag(map.get(key));
					break;
			}
		}
		
	}

}