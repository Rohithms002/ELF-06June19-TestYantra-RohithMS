package com.tyss.javaapp.jodadate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Set;

import lombok.extern.java.Log;

@Log
public class LocalDateTimeExample {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();
		log.info("current time" + dateTime);

		LocalDate bir = LocalDate.of(1993, 4, 8);
		LocalDate ld = LocalDate.now();
		LocalDateTime t = dateTime.minusYears(1993);
		log.info("age is " + t.getYear());
		Period p = Period.between(bir, ld);
		log.info("your age is " + p.getYears() + " Years " + p.getMonths() + " Months " + p.getDays() + " Days ");

		// Zone

		ZoneId z = ZoneId.systemDefault();
		log.info("" + z);

		Set<String> s = z.getAvailableZoneIds();
		s.forEach(j -> System.out.println("Total AVailable TimeZones are" + j));

	}
}
