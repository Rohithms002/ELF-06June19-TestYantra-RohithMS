package com.testyantra.assessment.lambda;

import lombok.extern.java.Log;

@Log
public class SimpleInterestTest {

	public static void main(String[] args) {

		SimpleInterestCalculator s = (p, t, r) -> {
			Double si = p * t * r / 100;
			return si;
		};
		Double simple = s.calculate(10.3, 20.5, 2.0);
		log.info("Simple Interest is : " + simple);
	}

}
