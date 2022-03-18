package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.unit1.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)
			);
		
		people.forEach(person -> System.out.println(person)); //ForEach takes lambda expression
		
		people.forEach(System.out::println);
	}
}
