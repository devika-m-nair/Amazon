package AmazonTestCase;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import static org.testng.Assert.assertEquals;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;

public class AmazonTest extends BaseClass {
	public WebDriver driver;
	@BeforeMethod  //this is added to tell its a precondition
	public void intialization() throws Exception
	{
		driver = browserIntialization("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	} // till now its a precondition where url is loaded
	@Test
	public void TC01() throws InterruptedException
	{
		/*System.out.println("TC01");
		driver.navigate().to("https://www.amazon.in/Redmi-Starlight-Storage-MediaTek-Dimensity/dp/B0CNX89QR8/?_encoding=UTF8&_encoding=UTF8&ref_=dlx_gate_sd_dcl_tlt_5db6bdf8_dt_pd_hp_d_atf_unk&pd_rd_w=muJdu&content-id=amzn1.sym.9e4ae409-2145-4395-aa6e-45d7f3e95c3e&pf_rd_p=9e4ae409-2145-4395-aa6e-45d7f3e95c3e&pf_rd_r=K2JJBYV7E0BG72DVZ0CH&pd_rd_wg=ORYSd&pd_rd_r=0a22d48c-264e-470f-92d5-4b7d4f910ce9");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.close();
		//driver.quit();
	
		//ID Locator
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
		//Class Name Locator
		driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("samsung");
		
		//Name Locator
		driver.findElement(By.name("field-keywords")).clear();
		
		//Tag Name Locator
		driver.findElement(By.tagName("input"));
		
		//Link Text  Locator
		driver.findElement(By.linkText("Shop on Amazon Business")).click();
		
		//Partial Link Text  Locator
		driver.findElement(By.partialLinkText("Conditions of")).click();*/
		
		//Basic Web Element Commands
		/*
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart TV");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> products=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int productsize=products.size();
		System.out.println(productsize);
		//Actions action=new Actions(driver);
		//action.contextClick().build().perform();
		//action.doubleClick(driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"))).build().perform();
		String value=driver.findElement(By.xpath("//span[text()='Deals & Discounts']")).getText();
		System.out.println(value);
		String value2=driver.findElement(By.xpath("//span[text()='Deals & Discounts']")).getTagName();
		System.out.println(value2);
		String value3=driver.findElement(By.id("twotabsearchtextbox")).getAttribute("name");
		System.out.println(value3);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.id("s-result-sort-select_2")).click();
		//driver.findElement(By.id("twotabsearchtextbox")).clear();
		//driver.findElement(By.className("s-image")).click();
		 */
		
		//Drop down with select tag
		/*
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		WebElement dropdown = driver.findElement(By.name("country"));
		Select obj=new Select(dropdown);
		//obj.selectByValue("ALGERIA");
		obj.selectByVisibleText("ANDORRA");
		*/
		
		//Drag and Drop
		/*
		 driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement source=driver.findElement(By.id("column-a"));
		WebElement target=driver.findElement(By.id("column-b"));
		Actions action=new Actions(driver);
		//action.dragAndDrop(source, target).build().perform(); 
		 */
		
		
		//moveToElement():
			/*
			driver.navigate().to("https://www.amazon.in/ref=nav_logo");
			WebElement a = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
			Actions action=new Actions(driver);
			action.moveToElement(a).build().perform(); 
			*/
			
		//Check Boxes and Radio Buttons
			/*
			driver.navigate().to("https://www.91mobiles.com/phonefinder.php");
			driver.findElement(By.id("latestandexpectprice1000002000001")).click();
			driver.findElement(By.id("latestandexpectprice2000003000001")).click();
			driver.findElement(By.id("mobraminmb614401000000")).click();
			*/
			
		//isSelected()
			/*
			boolean buttonselectedstatus=driver.findElement(By.id("mobraminmb614401000000")).isSelected();
			System.out.println(buttonselectedstatus);
			*/

		//isDisplayed():
			/*
			boolean pricerangeboxVarification = driver.findElement(By.xpath("//div[contains(@class,'price_tag_finder new-finder-left')]")).isDisplayed();
			System.out.println(pricerangeboxVarification); 
			*/
		
		//Is Enabled
			
			/*
			driver.navigate().to("https://www.amazon.in/");
			Thread.sleep(3000);
			boolean signinsecurelybutton=driver.findElement(By.id("nav-search-submit-button")).isEnabled();
			System.out.println(signinsecurelybutton); 
			boolean buyNowButtonStatus=driver.findElement(By.xpath("//span[@class='sponsoredBtn target_link_external']")).isEnabled(); 
			*/
		
		//Alert Handling
			/*
			driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
			driver.findElement(By.name("cusid")).sendKeys("123");
			driver.findElement(By.name("submit")).click();
			//driver.switchTo().alert().accept();    //accept the message pop up
			driver.switchTo().alert().dismiss();     //reject the message pop up
			*/
		
			//driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
				//Training
		
			//Dropdown select
		
		 /*	driver.get("https://demo.guru99.com/test/newtours/register.php");
		 	driver.manage().window().maximize();
		 	WebElement CountryDropDown=driver.findElement(By.name("country"));
		 	Select dropdownobj= new Select(CountryDropDown);
		 	dropdownobj.selectByValue("AMERICAN SAMOA");
		 	//dropdownobj.selectByVisibleText("ANTARCTICA");
		 	 */
		
			//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart TV");
		 	//driver.findElement(By.id("nav-search-submit-button")).click();
		 	/*Thread.sleep(2000);
		 	driver.findElement(By.id("a-autoid-0-announce")).click();
		 	driver.findElement(By.linkText("Avg. Customer Review")).click();
		 	*/
		
			//List<WebElement> product=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			//System.out.println(product);
			
//Doubt - Right and Double click
		
			driver.get("https://demoqa.com/buttons");
			Thread.sleep(2000);
			Actions actionobj=new Actions(driver);
			actionobj.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
			actionobj.contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();
			driver.findElement(By.linkText("Click Me")).click();
		
			
//Drag and drop
		  	/*
			driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		  	WebElement source=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		  	WebElement target=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		  	Actions action1=new Actions(driver);
		  	action1.dragAndDrop(source, target).build().perform();
		  	*/
	
//Mouse Hover
		/*
		WebElement mousehovered=driver.findElement(By.id("nav-link-accountList"));
		Actions action1=new Actions(driver);
		action1.moveToElement(mousehovered).build().perform();
		*/
		
//Check box and radio button
		/*
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.findElement(By.id("check-box-one")).click();
		driver.findElement(By.id("check-box-three")).click();
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.id("button-one")).click();
		String a=driver.findElement(By.id("message-one")).getText();
		System.out.println(a);
		*/
//isdisplayed()
		/* doubt
		driver.get("https://globfone.com/send-text/");
		Boolean buttondisplay=driver.findElement(By.linkText("text online")).isDisplayed();
		String value=driver.findElement(By.linkText("text online")).getText();
		System.out.println(buttondisplay);
		System.out.println(value);
		*/
		
		/* worked
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		Boolean buttondisplay1=driver.findElement(By.id("button-one")).isDisplayed();
		System.out.println(buttondisplay1);
		*/
//isselected()
		/*
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.findElement(By.id("inlineRadio1")).click();
		Boolean radiobuttonstatus=driver.findElement(By.id("inlineRadio1")).isSelected();
		System.out.println(radiobuttonstatus);
		*/
//isenabled
		/*
		driver.get("https://demoqa.com/dynamic-properties");
		Boolean buttonenablecheck=driver.findElement(By.id("enableAfter")).isEnabled();
		System.out.println(buttonenablecheck);
		Thread.sleep(6000);
		Boolean buttonenablecheck1=driver.findElement(By.id("enableAfter")).isEnabled();
		System.out.println(buttonenablecheck1);
		*/
		
//Alert Handling
	/*	driver.get("https://selenium.qabible.in/javascript-alert.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
		driver.switchTo().alert().accept();*/
	}
		
		@Test
		public void TC02() throws InterruptedException {
			/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
			driver.findElement(By.id("nav-search-submit-button")).click();
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(5000));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")));
			driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
			String parent=driver.getWindowHandle();
			Set<String> s=driver.getWindowHandles();
			Iterator<String> i1=s.iterator();
			while(i1.hasNext())
			{
				String childWindow=i1.next();
				if(!parent.equals(childWindow))
				{
					driver.switchTo().window(childWindow);
					Thread.sleep(3000);
					driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
					
				}
			}
			driver.switchTo().window(parent);
			Thread.sleep(3000);
			driver.navigate().refresh();

			 */
			
			/*driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
			String a = driver.findElement(By.xpath("//a[text()='Conditions of Use']")).getText();
			System.out.println(a);
			*/
			
//Frames
			/*
			driver.navigate().to("https://demoqa.com/frames");
			driver.switchTo().frame("frame1");
			String text=driver.findElement(By.id("sampleHeading")).getText();
			System.out.println(text);
			driver.switchTo().defaultContent();
			*/
			
//Handling Tables
			
			driver.navigate().to("https://selenium.qabible.in/table-sort-search.php");
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Bradley");
			String age = driver.findElement(By.xpath("(//tr[@class='odd']//td)[4]")).getText();
			System.out.println(age);
			driver.navigate().refresh();
			List<WebElement> data = driver.findElements(By.xpath("//tr[@class='odd' or @class='even']//td"));
			ArrayList<String> value1=new ArrayList<String>();
			for(int i=0;i<data.size();i++)
			{
				value1.add(data.get(i).getText());
			}
			String name=value1.get(5);
			System.out.println(name);
			System.out.println("  ");
			System.out.println(value1);
			ArrayList<String> value2 = new ArrayList<String>();
			value2.add("Airi Satou");
			value2.add("Accountant");
			boolean comaprevalue=value1.equals(value2);
			System.out.println(comaprevalue);
}



		@Test
	 public void TC03()
	 {	
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart tv");
			//driver.findElement(By.id("nav-search-submit-button")).click();
			WebElement element = driver.findElement(By.id("nav-search-submit-button"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			//page scrolling
			executor.executeScript("window.scrollBy(0,1000)", " ");
	 }
		@Test(dataProvider = "loginData")
		 public void TC04(String Cred1,String Cred2)
		 {
//Data Providers
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.name("username")).sendKeys(Cred1);
			driver.findElement(By.name("password")).sendKeys(Cred2);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//driver.quit();
		 }
		@DataProvider(name="loginData")
		public Object[][] loginCreds(){
			Object[][] loginData = new Object[3][2];
			loginData[0][0]="Admin";
			loginData[0][1]="admin123";
			loginData[1][0]="Admin1";
			loginData[1][1]="admin123";
			loginData[2][0]="Admin";
			loginData[2][1]="admin1234";
			return loginData;
		}
		
@Test
public void TC05(){
//Assertions
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watches");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> watches=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		int watchcount = watches.size();
		System.out.println("The no of watches = "+watchcount);
		Assert.assertEquals(watchcount, 71);
}
@Test
@Parameters({"username","password"})

public void TC06(String username,String password)
{
//login using parameter tag
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.quit();
}
}