package com.testyantra.assessment.arraylist;

/*5)	WAP to count the type of objects present in the ArrayList.
Eg: ArrayList has 20 Animal type objects, your program as to give me the count of Cow, Lion, Dog objects present inside it. 
*/
import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class AnimalTest {

	public static void main(String[] args) {
		int count = 0;
		Animal animal = new Animal();
		animal.setCow("cow1");
		animal.setLion("lion1");
		animal.setDog("dog1");

		Animal secondAnimal = new Animal();
		secondAnimal.setCow("cow2");
		secondAnimal.setLion("lion2");
		secondAnimal.setDog("dog2");

		ArrayList<Animal> al = new ArrayList<Animal>();
		al.add(animal);
		al.add(secondAnimal);

		for (Animal a : al) {
			String cow = a.getCow();
			String dog = a.getDog();
			String lion = a.getLion();
			log.info("cow " + cow);
			log.info("dog " + dog);
			log.info("lion " + lion);
			count++;
		}
		log.info("count of cow Objects are " + count);
		log.info("count of dog Objects are " + count);
		log.info("count of lion Objects are " + count);

	}
}
