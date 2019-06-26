package com.tyss.javaaspp.thread;

import lombok.extern.java.Log;

@Log
public class RunnableExample implements Runnable {

	@Override
	public void run() {
		log.info("Thread 1 running");
		for (int i = 0; i < 6; i++) {
			log.info("" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
