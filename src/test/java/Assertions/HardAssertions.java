package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void HardAssertion() {
		/*
		 1. We can access from Assert Class directly
		 2. All methods are static
		 3. If Hard assertion failed then rest of statements will not execute
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		Actions ac=new Actions(driver);
		ac.click(driver.findElement(By.xpath("//button[@name='start']"))).perform();
		ac.doubleClick(driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"))).perform();
		Assert.assertEquals(driver.findElement(By.xpath("//button[@name='stop']")).getText(), "STOP");
		Assert.assertNotEquals(driver.findElement(By.xpath("//button[@name='stop']")).getText(), "START");
		Assert.assertTrue(driver.findElement(By.xpath("//button[@id='alertBtn']")).isDisplayed());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='sunday']")).isSelected());
		if(driver.findElement(By.xpath("//input[@id='sunday']")).isSelected()) {
			Assert.fail();
		}
		driver.quit();
	}
}
