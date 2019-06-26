package com.tyss.javaaspp.thread;

public class RunnableMain {

	public static void main(String[] args) {

		RunnableExample th1 = new RunnableExample();
		Thread thread = new Thread(th1);
		RunnableExample2 th2 = new RunnableExample2();
		Thread thread1 = new Thread(th2);
		thread.start();
		thread1.start();

	}
}
