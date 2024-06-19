package AmazonTestCase;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;

public class NewTestCases extends BaseClass{
	public WebDriver driver;
	@BeforeMethod  
	public void intialization() throws Exception
	{
		driver = browserIntialization("chrome");
		driver.manage().window().maximize();
	}

//Grouping till TC05
	@Test(groups = {"Regression Test"})
	public void TC01(){
		System.out.println("TestCase1");
		//driver.navigate().to("https://www.amazon.in/");
	}
	
	@Test(groups = {"Regression Test"})
	public void TC02(){
		System.out.println("TestCase2");
		//driver.navigate().to("https://www.myntra.com/");
	}
 @Test(groups = {"Regression Test"})
 public void TC03(){
	 System.out.println("TestCase3");
	 //driver.get("https://www.flipkart.com/");
 }
 @Test(groups = {"Smoke Test"})
public void TC04() {
	 System.out.println("TestCase4");
	 //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 }
 @Test(groups = {"Smoke Test"})
 public void TC05() {
	 System.out.println("TestCase5");
	 //driver.get("https://selenium.qabible.in/index.php");
 }
}
