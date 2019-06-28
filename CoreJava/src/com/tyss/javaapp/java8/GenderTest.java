package com.tyss.javaapp.java8;

import lombok.extern.java.Log;

@Log
public class GenderTest {

	public static void main(String[] args) {
		log.info("" +Gender.MALE);
		log.info("" +Gender.FEMALE);
		log.info("" +Gender.OTHER);
		
	
		Gender f = Gender.MALE;
		Gender gender[]=Gender.values();
		for(Gender g : gender ) {
			System.out.println(g);
		}
		
	switch(f){
		
	case MALE: System.out.println("yes male");
	break;
	
	case FEMALE: System.out.println("yes male");
	break;
	
	case OTHER: System.out.println("yes male");
	break;
		
	}
	}
}
