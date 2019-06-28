package com.tyss.javaapp.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CallableExample c = new CallableExample();
		FutureTask<Integer> ft = new FutureTask<Integer>(c);
		Thread t1 = new Thread(ft);
		t1.start();
		int i=ft.get();
		System.out.println(i);
	}
}
