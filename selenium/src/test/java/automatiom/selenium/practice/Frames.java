package automatiom.selenium.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//open the browser in full screen
		driver.manage().window().maximize();
		
		//open the browser
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("main page");
		
		//switch to frame2 and enter some text in field
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("pankaj in frame2");
		
		//switch back to main page and enter the text
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("back to main");
		
		//switch to frame3 and enter some text
	    driver.switchTo().frame("frm3");
	    driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("main page under frame 3");
	    
	    //switch to nested frame and enter some text
	    driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("pankaj in frame2 under frame3");
		
		//switch back to parent frame, ie frm3 and enter the text
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("main page under frame 3 is updated");
		
	    
	    
}

}
