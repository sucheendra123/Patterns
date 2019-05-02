package com.demo.factorydesignpattern;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the plan");
		String plan = scan.next();
		System.out.println("Enter the units");
		int unit = scan.nextInt();
		
		GetPlanFactory getPlanFactory = new GetPlanFactory();
		
		Plan p=getPlanFactory.getPlan(plan);
		
		System.out.println("The current plan is "+plan+" Total units is "+unit);
		p.getRate();
		p.calculateBill(unit);
		
		

	}

}
