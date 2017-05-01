package com.bpi;

/**
 * Created by olivergalleguez on 20/10/2016.
 */
public class EHLLAPIException extends Exception{

    private String code;
    private String description;
    private String responseStr = "";

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getResponseStr() {
        return responseStr;
    }

    public EHLLAPIException(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public EHLLAPIException(String code, String description, String responseStr) {
        this.code = code;
        this.description = description;
        this.responseStr = responseStr;
    }

    public EHLLAPIException(String message, String code, String description, String responseStr) {
        super(message);
        this.code = code;
        this.description = description;
        this.responseStr = responseStr;
    }

    public EHLLAPIException(String message, Throwable cause, String code, String description, String responseStr) {
        super(message, cause);
        this.code = code;
        this.description = description;
        this.responseStr = responseStr;
    }

    public EHLLAPIException(Throwable cause, String code, String description, String responseStr) {
        super(cause);
        this.code = code;
        this.description = description;
        this.responseStr = responseStr;
    }

    public EHLLAPIException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String code, String description, String responseStr) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.description = description;
        this.responseStr = responseStr;
    }
}
