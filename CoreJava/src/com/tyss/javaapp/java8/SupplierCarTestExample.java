package com.tyss.javaapp.java8;

import java.util.function.Supplier;

public class SupplierCarTestExample {

	public static void main(String[] args) {
		
		Supplier<Car> c = ()-> new Car(15.5);
		Car car =c.get();
		System.out.println(car.fuel);
	}
}
