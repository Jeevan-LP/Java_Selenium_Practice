package Practice_demo;

import org.testng.annotations.Test;

public class Selenium_demo {

	@Test(groups = "Sanity")
	void test1() {
		System.out.println("Sanity Test");
	}
	
	@Test(groups = "Regression")
	void test2() {
		System.out.println("Regression Test");
	}
	
	@Test(groups = {"Sanity","Regression"})
	void test3() {
		System.out.println("Both Sanity and Regression Test");
	}
	
}
