package org.example;

import org.testng.annotations.Test;

public class AppiumTest {
	
	@Test
	public void nativeApp() {
		System.out.println("Hello native");
		System.out.println("Hello native2");
		System.out.println("Hello native3");

		System.out.println("Hello nativeB1");
		System.out.println("Hello nativeB2");
		System.out.println("Hello nativeB3");
	}
	
	@Test
	public void AndroidTest() {
		System.out.println("Hello Android test");
		System.out.println("Hello Arhitect 1");
		System.out.println("Hello Arhitect 2");
		System.out.println("Hello Arhitect 3");
		System.out.println("Hello Arhitect 4");

	}

}
