package automatiom.selenium.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String[] gj) throws IOException
	{
		
		WebDriver driver = new ChromeDriver();
		
		//open the browser
		driver.get("https://github.com/");
		
		//open the browser in full screen
		driver.manage().window().maximize();
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File srcFile = tk.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\panka\\AppData\\Local\\Temp\\ss.png");
		FileUtils.copyFile(srcFile, destFile);
	}

}
