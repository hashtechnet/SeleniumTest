package automatiom.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATHS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//open the browser
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//open the browser in full screen
		driver.manage().window().maximize();

		//minimize the browser
		//driver.manage().window().minimize();
		/*
		//close the browser
		driver.close();
		*/
		
		//get the current url
		//System.out.println(driver.getCurrentUrl());
		
		//get the pagetitle
		//System.out.println(driver.getTitle());
		
		//get pageSource
		//System.out.println(driver.getPageSource());
		
		
		//relativexpath : //tagname[@attribute='value']
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pakaj@emali.com");
		
		//fullxpath: /rootnode/desirednode
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("hello");
		
		//xpath functions: usefull with dynamic attributes
		
		//startswith: "//tagname[starts-with(@attribute,'value')]"
		//driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0')]")).click();
		
		//contains: "//tagname[contains(@attribute,'value')]"
		//driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		
		//text(): //tagname[text()='value']
		//driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		
		//AND function: //tagname[@attribute1='value1' AND @attribute2='value2']
		//driver.findElement(By.xpath("//input[@name='email' and @placeholder='Email address or phone number']")).sendKeys("2538398");
		
		//OR function: //tagname[@attribute1='value1' OR  @attribute2='value2']
		//driver.findElement(By.xpath("//input[@name='random' or @placeholder='Email address or phone number']")).sendKeys("2538398");
				
		//xpath axes: parent, child, self, ancestor, descendant, sibling 
		
		//siblings: //tagname[@attribute=''value']/sibling::tagname
		//driver.findElement(By.xpath("//input[@title='Password']//preceding-sibling::input")).sendKeys("email");
		//driver.findElement(By.xpath("//label[text()='Password']//following-sibling::input[@title='Password']")).sendKeys("pwd");
		
		//child: 
		//driver.findElement(By.xpath("//div[@class='userform']//child::input[@title='Enter your first crush name']")).sendKeys("shaheen");
		
		//parent:
		//driver.findElement(By.xpath("//span[@class='menu__tab-label']//parent::button[@aria-controls='uid_n6udget12ac']")).click();
		
		//descendant 
		//String companyName=driver.findElement(By.xpath("//div[@class='element-companyId']//descendant::div[@class='input-label']//label[text()='Company']")).getText();
		//System.out.println(companyName);
		
		//ancestor
		String pay=driver.findElement(By.xpath("//span[@id='cardNumberError']//ancestor::div//h2[@class='text-2xl font-bold mb-6 text-gray-800']")).getText();
		System.out.println(pay);
	}

}
