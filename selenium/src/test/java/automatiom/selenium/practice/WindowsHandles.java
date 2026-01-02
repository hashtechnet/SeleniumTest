package automatiom.selenium.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		

		//open the browser in full screen
		driver.manage().window().maximize();
		
		//open the browser
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindowHandle = driver.getWindowHandle();
		
		driver.findElement(By.id("newWindowBtn")).click();
		//driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Pankaj Kumar");
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("newTabBtn")).click();
		
		Set<String> allWindHandles = driver.getWindowHandles();
		for(String wndhndl : allWindHandles)
		{
			System.out.println(wndhndl);
		}

	}

}
