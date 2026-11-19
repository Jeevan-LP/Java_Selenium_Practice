package Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testes_01 {

	@BeforeTest
	void Login() {
		System.out.println("@BeforeTest annotations.......");	
	}
	
	@Test(priority = 1)	//priority is optional
	void Search() {
		System.out.println("Search methods.......");	
	}
	
	@Test(priority = 2)	//priority is optional
	void Profile() {
		System.out.println("Profile methods.......");	
	}
	
	@Test
	void Cart() {
		System.out.println("Cart methods.......");	
	}
	
	@AfterTest
	void Logout() {
		System.out.println("@AfterTest annotations.......");
	}
}
