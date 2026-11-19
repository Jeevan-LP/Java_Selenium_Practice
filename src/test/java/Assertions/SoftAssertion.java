package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	void SoftAssertion() {
		/*
		 1. We can access from SoftAssert object
		 2. have to create object
		 3. If soft assertion failed then rest of statements will still execute
		 */
		
		/*System.out.println("Welcome to");
		System.out.println("Java Selenium");
		
		SoftAssert SA = new SoftAssert();
		SA.assertEquals(27, 27);//soft assertion
		
		System.out.println("Welcome to");
		System.out.println("Python Selenium");*/
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		Actions ac=new Actions(driver);
		
		SoftAssert SA=new SoftAssert();
		
		ac.click(driver.findElement(By.xpath("//button[@name='start']"))).perform();
		ac.doubleClick(driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"))).perform();
		SA.assertEquals(driver.findElement(By.xpath("//button[@name='stop']")).getText(), "STOP");
		//here it will fail but still execute rest all assertion and script
		SA.assertNotEquals(driver.findElement(By.xpath("//button[@name='stop']")).getText(), "STOP");
		System.out.println("here it will fail but still execute rest all assertion and script");
		
		SA.assertTrue(driver.findElement(By.xpath("//button[@id='alertBtn']")).isDisplayed());
		SA.assertFalse(driver.findElement(By.xpath("//input[@id='sunday']")).isSelected());
		if(driver.findElement(By.xpath("//input[@id='sunday']")).isSelected()) {
			SA.fail();
		}
		SA.assertAll();
		driver.quit();
		
		SA.assertAll();//must mandatory
		
	}
}
