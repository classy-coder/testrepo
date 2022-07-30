package pomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='email']") private WebElement user;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="// button[text()='Log In']")private WebElement logIn;
	@FindBy(xpath="//button[text()='Yes, Continue']")private WebElement yes;
	
	
	

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	public void enterUN()
	{
		user.sendKeys("pgpatil.1321@rediffmail.com");
	}
	public void enterPass()
	{
		password.sendKeys("");
	}
	public void clickOnLogIn()
	{
		logIn.click();
	}
	public void clickOnYes()
	{
		yes.click();
	}
	
	
	
	
}
