package io.javabrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
		printConditionally(people, p -> true);
		
		System.out.println("----------------------");
		//Step 2: Create a method that prints all elements in the list with last name beginning with C
		printConditionally(people, p -> p.getSecondName().startsWith("C"));
	}

	private static void printConditionally(List<Person> people, Condition1 condition) {
		for (Person p : people)
			if (condition.test(p))
				System.out.println(p);
	}

}

interface Condition1 {
	boolean test(Person p);
}
