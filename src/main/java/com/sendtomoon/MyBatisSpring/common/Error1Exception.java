package com.sendtomoon.MyBatisSpring.common;

public class Error1Exception extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1050984411101876912L;

	public Error1Exception(String msg) {

		super(msg);
	}

	public Error1Exception(Throwable th) {
		super(th);
	}

	public Error1Exception(String msg, Throwable th) {
		super(msg, th);
	}
}
