package com.tyss.javaapp.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lombok.extern.java.Log;

@Log
public class ThreadMain {

	public static void main(String[] args) {
		log.info("Main Thread started");

		ThreadExample th1 = new ThreadExample();
		ThreadExample2 th2 = new ThreadExample2();
		/*
		 * th1.setPriority(2); th2.setPriority(5); th1.start(); th2.start();
		 */
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.execute(th1);
		service.execute(th2);

		log.info("Main Thread ended");
	}
}