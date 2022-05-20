package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	// Preconditions 
	@BeforeSuite //1
	public void setUp() {
		System.out.println("Setup system property for Chrome.");
	}
	
	@BeforeTest  //2
	public void login() {
		System.out.println("Login method."); 
	}
	

	@BeforeClass  //3
	public void launchBrowser() {
		System.out.println("Launch Chrome browser.");
	}
	
	@BeforeMethod  //4
	public void enterURL() {
		System.out.println("Enter URL.");
	}
	
	
	
	@Test  //5
	public void googleTitleTest() {
		System.out.println("Google title test.");	
	}
	
	@Test // 
	public void searchTest() {
		System.out.println("Search test.");
	}
	@AfterMethod  //6
	public void logOut() {
		System.out.println("Log out from app.");
	}
	
	@AfterClass  //7
	public void closeBrowser() {
		System.out.println("Close the browser.");
	}
	
	@AfterTest  //8
	public void deleteAllCookies() {
		System.out.println("Delete all cookies.");
	}
	
	
	
	@AfterSuite  //9
	public void generateTestReport() {
		System.out.println("Generate test report.");
	}
}

