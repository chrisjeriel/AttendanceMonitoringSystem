package ph.com.bpi.exception;

/**
 * 
 * @author ralphangelobautista
 *
 */
public class MFResponseException extends Exception{

	private String code;

	/**
	 * 
	 */
	private static final long serialVersionUID = 2232757827454023663L;

	public MFResponseException(){
		// TODO Auto-generated constructor stub
	}

	public MFResponseException(String code, String message){
		super(message);
		this.setCode(code);
	}

	public MFResponseException(String code, Throwable cause){
		super(cause);
		this.setCode(code);
	}

	public MFResponseException(String code, String message, Throwable cause){
		super(message, cause);
		this.setCode(code);
	}

	public MFResponseException(String code, String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace){
		super(message, cause, enableSuppression, writableStackTrace);
		this.setCode(code);
	}

	public String getCode(){
		return code;
	}

	public void setCode(String code){
		this.code = code;
	}

}
