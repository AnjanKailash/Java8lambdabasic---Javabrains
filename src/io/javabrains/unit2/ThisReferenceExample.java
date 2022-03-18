package io.javabrains.unit2;

/**
 * 
 * @author Anjan
 *
 *
 *This example is the classic example of lambda expressions are not syntactic sugar quote on anonymous classes
 */
public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10, i -> System.out.println(this)); //this is possible outside static methos but the this here is the object on which it is being called
	}
	
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value of i is: "+i);
				System.out.println(this);
			}
			
			public String toString() {
				return "This is the anonymous inner class";
			}
			
		});
		
		//thisReferenceExample.doProcess(10, i -> System.out.println(this)); --> this will not work
		
		thisReferenceExample.execute();
	}
	
	public String toString() {
		return "This is the main ThisReferenceExample class instance";
	}
}
 