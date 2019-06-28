package com.testyantra.assessment.thread;

import lombok.extern.java.Log;

@Log
public class PrintNumberThread implements Runnable {

	private String name;

	public PrintNumberThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			log.info(name + "started printing" + i);
			log.info("" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		log.info(name + "completed printing");
		log.info("end");

	}

}
