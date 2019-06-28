package com.testyantra.assessment.thread;

/*WAP to print the numbers from 1 to 10 using 5 threads, with the thread pool size of 2.*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumberTest {

	public static void main(String[] args) {

		PrintNumberThread printThread1 = new PrintNumberThread("first");
		PrintNumberThread printThread2 = new PrintNumberThread("second");
		PrintNumberThread printThread3 = new PrintNumberThread("third");
		PrintNumberThread printThread4 = new PrintNumberThread("fourth");
		PrintNumberThread printThread5 = new PrintNumberThread("fifth");

		ExecutorService service = Executors.newFixedThreadPool(2); //creating thread pool of size 2
		service.execute(printThread1);
		service.execute(printThread2);
		service.execute(printThread3);
		service.execute(printThread4);
		service.execute(printThread5);

	}
}
