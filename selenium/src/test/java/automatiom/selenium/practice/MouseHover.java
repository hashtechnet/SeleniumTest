package automatiom.selenium.practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		//open the browser in full screen
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/#");
		
		Actions action = new Actions(driver);
		
		//mouse hover
		WebElement element = driver.findElement(By.linkText("Main Item 2"));
		action.moveToElement(element).perform();
		
		
		//drag & drop
		driver.get("https://vinothqaacademy.com/mouse-event/");
		WebElement source = driver.findElement(By.xpath("//div[@id='draggableElement']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppableElement']"));
		action.dragAndDrop(source, dest).perform();
		//
	}

}
