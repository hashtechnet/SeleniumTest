package automatiom.selenium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {

	public static void main(String[] st) {
	WebDriver driver = new ChromeDriver();
	
	//open the browser
	driver.get("https://www.facebook.com/");
	
	//open the browser in full screen
	driver.manage().window().maximize();
	
}
	
}