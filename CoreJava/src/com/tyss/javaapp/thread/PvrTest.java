package com.tyss.javaapp.thread;

public class PvrTest {

	public static void main(String[] args) {

		Pvr p = new Pvr();
		Browser b = new Browser(p);
		b.start();

		Browser b1 = new Browser(p);
		b1.start();

		Browser b2 = new Browser(p);
		b2.start();

		p.notice();

	}
}
