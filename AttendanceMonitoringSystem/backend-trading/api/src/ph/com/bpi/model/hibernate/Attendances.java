package ph.com.bpi.model.hibernate;

import java.util.HashMap;

public class Attendances {

	private int attendanceId;
	private int sessionId;
	private String idNumber;
	private String timeIn;
	private String timeOut;
	private String fullName;

	public int getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}

	public String getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String toString() {
		return "Attendance [attendanceId=" + attendanceId 
				+ ", sessionId=" + sessionId 
				+ ", idNumber=" + idNumber 
				+ ", timeIn=" + timeIn 
				+ ", timeOut=" + timeOut
				+ ", fullName=" + fullName + "]";
	}
	
	public void parse(HashMap<String, String> map) {
		System.out.println("HERE AT PARSE.");
		System.out.println(map);
		for (String key : map.keySet()) {
			switch (key) {
			case "ATTENDANCE_ID":
				attendanceId = new Integer(map.get(key));
				break;
			case "SESSION_ID":
				sessionId = new Integer(map.get(key));
				break;
			case "ID_NUMBER":
				idNumber = (map.get(key));
				break;
			case "TIME_IN":
				timeIn = (map.get(key));
				break;
			case "TIME_OUT":
				timeOut = (map.get(key));
				break;
			case "FULL_NAME":
				fullName = (map.get(key));
				break;
			}
		}
	}

}