package com.tyss.javaapp.jodadate;

import java.time.LocalDate;

import lombok.extern.java.Log;

@Log
public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		log.info("Current date is " + date);
		log.info("day of month" + date.getDayOfMonth());
		log.info("day of week" + date.getDayOfWeek());
		log.info("day of year" + date.getDayOfYear());
		log.info("current year" + date.getYear());
		log.info("era " + date.getEra());
		log.info("month value" + date.getMonthValue());
		log.info("start of day " + date.atStartOfDay());
		log.info(" no of years " + date.minusYears(1993));
		log.info("no of days" + date.minusDays(10));
	}
}
