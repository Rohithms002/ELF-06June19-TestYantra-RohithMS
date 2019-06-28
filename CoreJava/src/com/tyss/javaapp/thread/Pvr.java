package com.tyss.javaapp.thread;

import lombok.Synchronized;
import lombok.extern.java.Log;

@Log
public class Pvr {

	synchronized void book() {

		for (int i = 0; i < 6; i++) {
			log.info("" + i);
			try {
				wait();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	synchronized void notice() {
		notifyAll();
	}
}
