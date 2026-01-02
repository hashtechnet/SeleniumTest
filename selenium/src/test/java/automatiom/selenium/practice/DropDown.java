package automatiom.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//open the browser in full screen
		driver.manage().window().maximize();
		
		//open the browser
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement dropDown=driver.findElement(By.id("course"));
		Select selectOptions = new Select(dropDown);
		selectOptions.selectByValue("net");
		
		WebElement dropDownMlt=driver.findElement(By.id("ide"));
		Select selectMultiOptions = new Select(dropDownMlt);
		selectMultiOptions.selectByIndex(1);
		selectMultiOptions.selectByValue("vs");
		selectMultiOptions.selectByVisibleText("NetBeans");
		
		List<WebElement> dropDownOptions=selectOptions.getOptions();
		for(WebElement drpDwnOpt : dropDownOptions)
		{
			System.out.println(drpDwnOpt.getText());
		}
			
			
		
	}

}

//git