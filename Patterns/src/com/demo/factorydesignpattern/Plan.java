package com.demo.factorydesignpattern;

abstract public class Plan {

	public double rate;
	abstract public void getRate();
	
	public void calculateBill(int unit)
	{
		System.out.println(rate*unit);
	}

}
