package automatiom.selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		//open the browser
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//open the browser in full screen
		driver.manage().window().maximize();
		
		/*
		driver.findElement(By.id("alertBox")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		*/
		
		/*
		driver.findElement(By.id("confirmBox")).click();
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		*/
		
		driver.findElement(By.id("promptBox")).click();
		driver.switchTo().alert().sendKeys("Hi Pk");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		
	}

}

//test
