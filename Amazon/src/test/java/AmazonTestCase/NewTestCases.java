package AmazonTestCase;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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
 @Test
 public void datePicker() {
		driver.get("https://selenium.qabible.in/date-picker.php");
		driver.findElement(By.id("single-input-field")).sendKeys("13/07/2024");
		Actions action=new Actions(driver);
 	action.sendKeys(Keys.ENTER);
 	action.build().perform();
 	driver.findElement(By.id("button-one")).click();
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		String formateddate=sdf.format(date);
		driver.findElement(By.id("single-input-field")).sendKeys(formateddate);
		action.sendKeys(Keys.ENTER);
 	action.build().perform();
 	driver.findElement(By.id("button-one")).click();
 
}
 @Test
 public void jqueryDatePicker() {
	 driver.get("https://selenium.qabible.in/jquery-date-picker.php");
	 driver.findElement(By.id("from")).click();
	 driver.findElement(By.xpath("//td[@class='  ui-datepicker-today']//a")).click();
 }
}
