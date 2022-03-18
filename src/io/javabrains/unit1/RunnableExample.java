package io.javabrains.unit1;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Printed inside runnable");
			}
		});
		myThread.run();
		
		//below thing is possible because Runnable is single method interface
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda runnable"));
		myLambdaThread.run();
	}

}
