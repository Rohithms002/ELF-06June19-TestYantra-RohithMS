package com.tyss.javaaspp.thread;

import lombok.extern.java.Log;

@Log
public class ThreadExample2 extends Thread {

	@Override
	public void run() {
		log.info("thread2 running");
		for (int i = 5; i > 0; i--) {
			log.info("" + i);

		}
		String s = getName();
		log.info("" + s);

		setName("Rohith");
		String s1 = getName();
		log.info("" + s1);
	}
}
