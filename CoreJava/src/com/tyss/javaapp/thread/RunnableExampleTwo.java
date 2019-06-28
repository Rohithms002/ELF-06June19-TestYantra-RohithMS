package com.tyss.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class RunnableExampleTwo implements Runnable {

	@Override
	public void run() {
		log.info("thread2 running");

	}

}
