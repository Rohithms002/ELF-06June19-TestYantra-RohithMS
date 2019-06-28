package com.tyss.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class RunnableLambdaExample {

	public static void main(String[] args) {

		Runnable r2 = () -> {
			log.info("Runnable2 Lambda");
		};

		Thread t1 = new Thread(() -> {
			log.info("Runnable1 Lambda");

		});
		Thread t2 = new Thread(r2);
		t2.start();
		t1.start();
	}
}
