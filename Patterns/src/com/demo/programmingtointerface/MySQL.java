package com.demo.programmingtointerface;

public class MySQL implements ConnectionMg
{

	@Override
	public void connect() {
	
		System.out.println("MySQL is connecting");
		
	}

}
