package com.demo.programmingtointerface;

public class Test {

	public static void main(String[] args) {
		ConnectionMg con;
		con = new Oracle();
		DBAccessor dbAccessor = new DBAccessor(con);
		con = new MySQL();
		new DBAccessor(con);
	}

}
