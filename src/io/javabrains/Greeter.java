package io.javabrains;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello world 3!");
			}
		};

		Greeting myLambdaFunction = () -> System.out.println("Hello world 2!");
		greeter.greet(myLambdaFunction);
		greeter.greet(innerClassGreeting);
		
		System.out.println("----------------------");
		helloWorldGreeting.perform();
		myLambdaFunction.perform();
		innerClassGreeting.perform();
		
		/**
		 * most cases lambda expressions are syntactical sugar for anonymous inner classes, ******but not always******
		 */
	}

}
