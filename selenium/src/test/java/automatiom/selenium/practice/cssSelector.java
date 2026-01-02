package automatiom.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		//open the browser
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		
		//open the browser in full screen
		driver.manage().window().maximize();
		
		//cssSelector
		
		//id: htmltag#id or #id
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("pankaj");
		
		//class: tagname.className or .className
		driver.findElement(By.cssSelector("input.gender")).sendKeys("male");
		
		//with []: htmltag[attribute='value']
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("kumar");
		
		//with more than one attribute like AND and OR
		driver.findElement(By.cssSelector("input[class=city][placeholder='City']")).sendKeys("chapra");
		
		//contains: use * with attribute
		driver.findElement(By.cssSelector("input[placeholder*='question']")).sendKeys("how are you");
		
		//starts with: use ^ operator
		driver.findElement(By.cssSelector("input[placeholder^='Verify']")).sendKeys("Good");
		
	


	}

}
