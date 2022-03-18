package io.javabrains.unit1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>(Arrays.asList(
			new Person("Charles", "Dickens", 60),
			new Person("Lewis", "Carroll", 42),
			new Person("Thomas", "Carlyle", 51),
			new Person("Charlotte", "Bronte", 45),
			new Person("Mathew", "Arnold", 39)
		));

		//Step 1: sort list by last name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getSecondName().compareTo(p2.getSecondName());
			}
		});
		//Step 2: Create a method that prints all elements in list
		printAll(people);
		
		System.out.println("----------");
		//Step 3: Create a method that prints all elements in the list with last name beginning with C
		printWithCondition(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getSecondName().startsWith("C");
			}
			
		});
	}

	private static void printWithCondition(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p))
				System.out.println(p);
		}
	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}
}

interface Condition {
	boolean test(Person p);
}
