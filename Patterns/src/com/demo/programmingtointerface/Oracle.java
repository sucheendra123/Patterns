package com.demo.programmingtointerface;

public class Oracle implements ConnectionMg {

	@Override
	public void connect() {
		
		System.out.println("Oracle is connecting");

	}

}
