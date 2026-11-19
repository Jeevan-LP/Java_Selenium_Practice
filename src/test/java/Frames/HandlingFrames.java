package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebDriver parenetFrame = driver.switchTo().frame(driver.findElement(By.cssSelector("[src='frame_3.html']")));//switching to parent frame
		WebDriver childFrame = driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src, 'https://')]")));//switching to child frame
		childFrame.findElement(By.xpath("(//div[@class='vd3tt']//div[@class='AB7Lab Id5V1'])[3]")).click();
		childFrame.findElement(By.cssSelector("[class='Hvn9fb zHQkBf']")).sendKeys("Jeevan Gowda");
		
		driver.switchTo().parentFrame();//switching back to parent frame
		parenetFrame.findElement(By.cssSelector("[name='mytext3']")).sendKeys("Appu Gowda");
		
		driver.switchTo().defaultContent();//switching to main page
		WebDriver leftFrame=driver.switchTo().frame(driver.findElement(By.cssSelector("[src='frame_2.html']")));//switching to left frame
		leftFrame.findElement(By.cssSelector("[name='mytext2']")).sendKeys("Gowda");
		driver.quit();
		
	}

}
