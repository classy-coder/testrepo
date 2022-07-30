package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//a[@aria-label='Home']") private WebElement home;
	
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	public void clickOnHomePage()
	{
		home.click();
	}

}
