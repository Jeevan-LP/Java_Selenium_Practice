package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations_01 {
	
	/*
	 	a. @Test annotation will execute all tests
		b. @BeforeTest annotation will execute once before executing all @Test annotation
		c. @AfterTest annotation will execute once after executing all @Test annotation
		d. @BeforeMethod annotation will execute before executing each @Test annotation
		e. @AfterMethod annotation will execute after executing each @Test annotation
		f. @BeforeClass annotation will execute once before executing all @Test annotation
		g. @AfterClass annotation will execute once after executing all @Test annotation
		h. @BeforeSuite annotation will execute once before executing the entire suite
		i. @AfterSuite annotation will execute once after executing the entire suite

		@BeforeSuite
		      ↓
		   @BeforeTest
		      		↓
		   		@BeforeClass
		      			↓
		   			@BeforeMethod
		      			  ↓
		     			@Test
		      			  ↓
		   			@AfterMethod
		      			↓
		   		@AfterClass
		           ↓
		   @AfterTest
		      ↓
		@AfterSuite
	 */

	@BeforeSuite
	void BeforeSuite() {
		System.out.println("@BeforeSuite methods.......");	
	}
	@BeforeTest
	void BeforeTest() {
		System.out.println("@BeforeTest methods.......");	
	}
	@BeforeClass
	void BeforeClass() {
		System.out.println("@BeforeClass methods.......");	
	}
	@BeforeMethod
	void Login() {
		System.out.println("@BeforeMethod methods.......");	
	}
	@Test(priority = 1)	//priority is optional
	void Search() {
		System.out.println("Search methods.......");	
	}
	
	@Test(priority = 2)	//priority is optional
	void Profile() {
		System.out.println("Profile methods.......");	
	}
	@AfterMethod
	void Logout() {
		System.out.println("@AfterMethod methods.......");	
	}
	@AfterClass
	void AfterClass() {
		System.out.println("@AfterClass methods.......");	
	}
	@AfterTest
	void AfterTest() {
		System.out.println("@AfterTest methods.......");
	}
	@AfterSuite
	void AfterSuite() {
		System.out.println("@AfterSuite methods.......");	
	}
}
