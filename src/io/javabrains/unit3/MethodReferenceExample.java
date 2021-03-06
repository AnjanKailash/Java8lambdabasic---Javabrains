package io.javabrains.unit3;

import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		Thread t = new Thread(() -> printMessage());
		t.start();
		
		//instead of above we can use below called method reference
		//this is done when input parameters to lambda is same as input parameters of method we want to call
		
		Thread t2 = new Thread(MethodReferenceExample::printMessage); //as this is static we used class name directly
		t2.start();
		
		//in case of instance method with one argument
		printConditionally("String1", p -> System.out.println(p));
		printConditionally("Abc", System.out::println); //both are same
		//System.out is instance of out variable(reference of print stream class) in static System class, so while calling it we used reference
		
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}
	
	private static void printConditionally(String s, Consumer<String> consumer) {
		consumer.accept(s);
	}
}
