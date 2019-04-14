/**
 * 
 */
package org.karthic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vkarthi3
 *
 */
public class HelloWorldTest {
	
	private HelloWorld helloWorld;
	
	@Before
	public void init() {
		helloWorld = new HelloWorld();
	}
	
	@Test
	public void testHelloWorld() {
		
		Assert.assertEquals("Hello, world!", helloWorld.sayHello());
	}
	
}
