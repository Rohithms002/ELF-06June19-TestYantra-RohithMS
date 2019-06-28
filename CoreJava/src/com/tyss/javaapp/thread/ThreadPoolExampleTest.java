package com.tyss.javaapp.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lombok.extern.java.Log;

@Log
public class ThreadPoolExampleTest {

	public static void main(String[] args) {

		ThreadPoolExample th1 = new ThreadPoolExample("first");
		ThreadPoolExample th2 = new ThreadPoolExample("second");
		ThreadPoolExample th3 = new ThreadPoolExample("third");
		ThreadPoolExample th4 = new ThreadPoolExample("fourth");
		ThreadPoolExample th5 = new ThreadPoolExample("fifth");
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(th1);
		service.execute(th2);
		service.execute(th3);
		service.execute(th4);
		service.execute(th5);
		service.shutdown();
	}
}
