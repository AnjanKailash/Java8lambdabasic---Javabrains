package io.javabrains.unit2;

public class ClusersExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
//		doProcess(a, new Process() {
//
//			@Override
//			public void process(int i) {
//				System.out.println(i+b); //even though b is not getting called from method, compiler declares b as final and we cannot change the value of b from java 8 onwards
//			}
//			
//		});
		//even though b is not getting called from method, compiler declares b as final 
		//and we cannot change the value of b from java 8 onwards, in java 7 we need to explicitly declare b as final
		doProcess(a, i -> System.out.println(i + b));
	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
}

interface Process {
	void process(int i);
}