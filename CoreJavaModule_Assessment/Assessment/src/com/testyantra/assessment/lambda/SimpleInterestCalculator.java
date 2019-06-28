package com.testyantra.assessment.lambda;

/*
 * Functional Interface:One abstract method calculate
 */
@FunctionalInterface
public interface SimpleInterestCalculator {

	public double calculate(Double principal, Double total, Double interest);
	
}
