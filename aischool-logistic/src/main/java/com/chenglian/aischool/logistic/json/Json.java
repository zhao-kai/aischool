package com.chenglian.aischool.logistic.json;

public class Json<T> {

	private boolean success = true;// 是否成功
	private String errorCode = "-1";//错误代码
	private String msg = "操作成功";// 提示信息
	private T body;
	/**
	 * @return success
	 */
	public boolean isSuccess() {
		return success;
	}
	/**
	 * @param success 要设置的 success
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}
	/**
	 * @return errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode 要设置的 errorCode
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg 要设置的 msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * @return body
	 */
	public T getBody() {
		return body;
	}
	/**
	 * @param body 要设置的 body
	 */
	public void setBody(T body) {
		this.body = body;
	}
	public Json(boolean success, String errorCode, String msg, T body) {
		super();
		this.success = success;
		this.errorCode = errorCode;
		this.msg = msg;
		this.body = body;
	}
	
}
