// When we want to have only one instance created and same object can be used all the time
// Eg: Runtime , Logger, Spring Beans, Graphic Managers

package designpatterns.creational.singleton;

public class SingletonJavaExample {

	public static void main(String[] args) {
		
		Runtime singleInstance=Runtime.getRuntime();
		singleInstance.gc();
		System.out.println(singleInstance);
		
		Runtime anotherInstance=Runtime.getRuntime();
		System.out.println(anotherInstance);
		
		if(singleInstance==anotherInstance) {
			System.out.println("Same object");
		}

	}

}
