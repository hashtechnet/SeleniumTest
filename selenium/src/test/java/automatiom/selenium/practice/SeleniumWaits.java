package automatiom.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//open the browser in full screen
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.id("btn1")).click();
		
		//Implicit Wait
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//h3[text()='Show the textboxes here:']//child::input[@id='txt1']")).sendKeys("This is Implicit Wait");
		*/
		
		//Explicit Wait
		
		//set the timemout
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		//set the condition
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Show the textboxes here:']//child::input[@id='txt1']")));
		
		//perform the action
		element.sendKeys("This is Explicit Wait");
	}

}
