package com.tyss.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class ThreadExample extends Thread {

	public void run() {

		log.info("Thread1 running");
		for (int i = 1; i < 5; i++) {
			log.info("" + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
