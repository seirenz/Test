package com.naver.www.springTest.dd;

public class Greeter {
	private String format;
	

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
	public String greet(String guest) {
		return String.format(format, guest);
	}

}
