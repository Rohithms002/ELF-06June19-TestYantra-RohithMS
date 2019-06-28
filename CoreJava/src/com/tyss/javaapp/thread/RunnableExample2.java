package com.tyss.javaaspp.thread;

import lombok.extern.java.Log;

@Log
public class RunnableExample2 implements Runnable {

	@Override
	public void run() {
		log.info("thread2 running");

	}

}
