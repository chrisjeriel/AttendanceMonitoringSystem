package ph.com.bpi.model.hibernate;

import java.util.HashMap;

public class Sessions {

	private int sessionId;
	private String sessionType;
	private String title;
	private String start;
	private String end;
	private String viewType;
	
	


	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public String getSessionType() {
		return sessionType;
	}

	public void setSessionType(String sessionType) {
		this.sessionType = sessionType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start.substring(0, 19).replace('-', '/');
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end.substring(0, 19).replace('-', '/');
	}

	public String getViewType() {
		return viewType;
	}

	public void setViewType(String viewType) {
		this.viewType = viewType;
	}
	
	public String toString() {
		return "Sessions [sessionId=" + sessionId 
				+ ", sessionType=" + sessionType 
				+ ", title=" + title 
				+ ", start=" + start 
				+ ", end=" + end 
				+ ", viewType=" + viewType + "]";
	}
	
	public void parse(HashMap<String, String> map) {
		System.out.println("HERE AT PARSE.");
		System.out.println(map);
		for (String key : map.keySet()) {
			switch (key) {
			case "SESSION_ID":
				sessionId = new Integer(map.get(key));
				break;
			case "SESSION_TYPE":
				sessionType = (map.get(key));
				break;
			case "TITLE":
				title = (map.get(key));
				break;
			case "START":
				start = (map.get(key));
				break;
			case "END":
				end = (map.get(key));
				break;
			case "VIEW_TYPE":
				viewType = (map.get(key));
				break;
			}
		}
	}

}