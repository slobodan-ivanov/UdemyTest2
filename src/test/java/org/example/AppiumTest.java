package org.example;

import org.testng.annotations.Test;

public class AppiumTest {
	
	@Test
	public void nativeApp() {
		System.out.println("Hello native");
		System.out.println("Hello native2");
		System.out.println("Hello native3");
	}
	
	@Test
	public void AndroidTest() {
		System.out.println("Hello Android test");
	}

}
