package io.javabrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Exercise {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>(Arrays.asList(
			new Person("Charles", "Dickens", 60),
			new Person("Lewis", "Carroll", 42),
			new Person("Thomas", "Carlyle", 51),
			new Person("Charlotte", "Bronte", 45),
			new Person("Mathew", "Arnold", 39)
		));

		//Step 1: sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getSecondName().compareTo(p2.getSecondName()));
		
		//Step 2: Create a method that prints all elements in list
		performConditionally(people, p -> true, p -> System.out.println(p));
		
		System.out.println("----------------------");
		//Step 2: Create a method that prints all elements in the list with last name beginning with C
		performConditionally(people, p -> p.getSecondName().startsWith("C"), p -> System.out.println(p));
	}

	//predicate is readily available with method which takes object and returns boolean in Java 8, name of the method is test in predicate interface
	//Consumer interface has a method to accept object and return void
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people)
			if (predicate.test(p))
				consumer.accept(p);
	}

}

