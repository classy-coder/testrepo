package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClass.Homepage;
import pomClass.LoginPage;

public class FBauto {
	
	
	WebDriver driver;
	Homepage homepage;
	
	public class Testclass1 {
		@BeforeClass
		public void loginToApp()
		{
			 System.setProperty("webdriver.chrome.driver","D:\\Senium Library\\new chrome jun 2022\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}	 
		
		@BeforeMethod
		public void loginPage()
		{
			driver.get("https://www.facebook.com/");
		
			 LoginPage loginPage = new LoginPage(driver);
			 loginPage.enterUN();
			 loginPage.enterPass();
			 loginPage.clickOnLogIn();
			 loginPage.clickOnYes();
			 
			 homepage = new Homepage(driver);
			
		}
		
			
		@Test
		public void test()
		{
			 homepage.clickOnHomePage();
			 
			 String url =driver.getCurrentUrl();
			 
			 String title = driver.getTitle();
			 
			 if(url.equals("https://www.facebook.com/home.php")&& title.equals("facebook"))
					 {
				       System.out.println("pass");
					 }
			 else
			 {
				 System.out.println("fail");
			 }
			 
			 
		}
		
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("after method");
		}
		
		@AfterClass
		public void afterClass()
		{
			System.out.println("after class");
		}
		
		


	}

}
