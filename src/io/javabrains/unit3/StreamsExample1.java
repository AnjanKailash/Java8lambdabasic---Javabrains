package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.unit1.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)
			);
		
		people.stream()
		.filter(p -> p.getSecondName().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstName()));
		
		
		long count = people.stream()
		.count(); //count is terminal method, it is kept at end as it returns long
		
		people.parallelStream() //breaks collection to parallel streams
		.filter(p -> p.getSecondName().startsWith("C"))
		.forEach(System.out::println);
		
		System.out.println(count);
	}

}
