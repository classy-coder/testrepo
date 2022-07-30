package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClass.Homepage;
import pomClass.LoginPage;

;

public class Testclass {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Senium Library\\new chrome jun 2022\\chromedriver_win32\\chromedriver.exe");
		 //"D:\\Senium Library\\new chrome jun 2022\\chromedriver_win32\\chromedriver.exe"
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 driver.get("https://www.facebook.com/");
		 
		 LoginPage loginPage = new LoginPage(driver);
		 loginPage.enterUN();
		 loginPage.enterPass();
		 loginPage.clickOnLogIn();
		 loginPage.clickOnYes();
		 
		 Homepage homepage = new Homepage(driver);
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

}
