package com.letscatchup.core.exception;

public class LcuException extends Exception {

	public LcuException() {
		super();
	}


	public LcuException(String message, Throwable ex) {
		super(message, ex);
	}

	public LcuException(String message) {
		super(message);
	}

	public LcuException(Throwable ex) {
		super(ex);
	}

	
}
