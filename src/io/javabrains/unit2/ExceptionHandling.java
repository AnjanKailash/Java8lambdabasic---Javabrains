package io.javabrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandling {

	public static void main(String[] args) {
		int[] someNumbers = {1, 2, 3, 4};
		int key = 0;
		
		process(someNumbers, key, wrapperLambda((a, b) -> System.out.println(a / b)));
	}

	//BiConsumer interface has method to take 2 objects and void as return
	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers)
			consumer.accept(i, key);
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try{
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic exception");
			}
		};
	}

}
