package com.demo.programmingtointerface;

public class DBAccessor{
	
	static ConnectionMg conn;
	
	public DBAccessor(ConnectionMg conn)
	{
		conn.connect();
	}
	
	
	
	
	
}
