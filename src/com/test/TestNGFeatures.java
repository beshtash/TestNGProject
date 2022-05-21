package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Login test.");
		System.out.println("This is a new comment.");
		int i = 3/1;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("Home page test.");
	}
}
