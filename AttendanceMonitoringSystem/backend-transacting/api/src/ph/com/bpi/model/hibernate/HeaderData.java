package ph.com.bpi.model.hibernate;

import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class HeaderData extends TModelBase{

	public HeaderData(){
		// TODO Auto-generated constructor stub
	}

	private int		id;
	private String	luid;
	private String	officeCode;
	private String	userId;
	private String	logDate;
	private String	logTime;
	private String	tranFi;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getLuid(){
		return luid;
	}

	public void setLuid(String luid){
		this.luid = luid;
	}

	public String getOfficeCode(){
		return officeCode;
	}

	public void setOfficeCode(String officeCode){
		this.officeCode = officeCode;
	}

	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getLogDate(){
		return logDate;
	}

	public void setLogDate(String logDate){
		this.logDate = logDate;
	}

	public String getLogTime(){
		return logTime;
	}

	public void setLogTime(String logTime){
		this.logTime = logTime;
	}

	public String getTranFi(){
		return tranFi;
	}

	public void setTranFi(String tranFi){
		this.tranFi = tranFi;
	}

	@Override
	public String toString(){
		return "HeaderData [id=" + id + ", luid=" + luid + ", officeCode=" + officeCode + ", userId=" + userId
				+ ", logDate=" + logDate + ", logTime=" + logTime + ", tranFi=" + tranFi + "]";
	}

	@Override
	public void parse(HashMap<String, String> map){
		for(String key: map.keySet()){
			switch(key){
				case "G_LUID":
					this.setLuid(map.get(key));
					break;

				case "G_OFFICE_CODE":
					this.setOfficeCode(map.get(key));
					break;

				case "G_USER_ID":
					this.setUserId(map.get(key));
					break;

				case "C_LOG_DATE":
					this.setLogDate(map.get(key));
					break;

				case "G_LOG_TIME":
					this.setLogTime(map.get(key));
					break;

				case "G_TRAN_FI":
					this.setTranFi(map.get(key));
					break;
			}
		}
	}

}
