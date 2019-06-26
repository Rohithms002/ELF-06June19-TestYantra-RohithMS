package com.tyss.javaapp.java8;

import java.util.function.Supplier;

public class SupplierTestExample {

	public static void main(String[] args) {
		Supplier<GunClass> g = ()-> new GunClass(100);
		GunClass gun= g.get();
		System.out.println(gun.bullet+" Bullets loaded");
	}
}
