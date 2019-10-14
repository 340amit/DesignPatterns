// Its used when we have too many arguments required in creating different types of object -- telescoping constructors 
// Handle complex constructors having large number of paramters 
// Example: StringBuilder -- append method ,DocumentBuilder, Locale.Builder

package designpatterns.creational.builder;

public class BuilderJavaExample {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("I have "); // String addition
		sb.append(20); // int addition
		sb.append('p'); // char addition
		System.out.println(sb.toString());

	}

}
