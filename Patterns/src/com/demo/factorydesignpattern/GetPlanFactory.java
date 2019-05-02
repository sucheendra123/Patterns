package com.demo.factorydesignpattern;

public class GetPlanFactory {

	public Plan getPlan(String s) {
		if (s == null) {
			return null;
		} else if (s.equalsIgnoreCase("DomesticPlan")) {
			return new DomesticPlan();
			 
		} else if (s.equalsIgnoreCase("CommercialPlan")) {
			return new CommercialPlan();
		} else if (s.equalsIgnoreCase("InstitutionalPlan")) {
			return new InstitutionalPlan();
		} else
			return null;
	}

}
