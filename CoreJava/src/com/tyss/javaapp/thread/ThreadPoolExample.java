package com.tyss.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class ThreadPoolExample implements Runnable {

	String name;

	public ThreadPoolExample(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 0; i < 6; i++) {
			log.info(name + "started printing" + i);
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
