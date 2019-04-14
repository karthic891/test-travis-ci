/**
 * 
 */
package org.karthic;

/**
 * @author vkarthi3
 *
 */
public class HelloWorld {

	public String sayHello() {
		return "Hello, world!";
	}

	public static void main(String[] args) {

		HelloWorld helloWorld = new HelloWorld();
		System.out.println(helloWorld.sayHello());
	}

}
