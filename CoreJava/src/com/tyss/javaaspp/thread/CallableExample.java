package com.tyss.javaaspp.thread;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {

		return 100;
	}

}