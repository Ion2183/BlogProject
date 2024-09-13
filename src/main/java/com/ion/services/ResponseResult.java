package com.ion.services;


import java.io.Serializable;

public class ResponseResult implements Serializable{

	private static final long serialVersionUID = -3969069773399950458L;
	private Integer state;
	private String message;

	@Override
    public String toString() {
        return "loginResponseResult [state=" + state + ", message=" + message + "]";
    }
    public ResponseResult(Integer state, String message) {
        this.state = state;
        this.message = message;
    }
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    
	
}