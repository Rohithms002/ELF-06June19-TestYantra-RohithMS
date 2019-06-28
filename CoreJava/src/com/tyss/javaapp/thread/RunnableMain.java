package com.tyss.javaapp.thread;

public class RunnableMain {

	public static void main(String[] args) {

		RunnableExample th1 = new RunnableExample();
		Thread thread = new Thread(th1);
		RunnableExampleTwo th2 = new RunnableExampleTwo();
		Thread thread1 = new Thread(th2);
		thread.start();
		thread1.start();

	}
}
