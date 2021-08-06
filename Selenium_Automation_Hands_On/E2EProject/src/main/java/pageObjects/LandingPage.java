package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	private By login=By.cssSelector("a[href*='sign_in']");
	private By title=By.xpath("//div[@class='text-center']/h2");
	private By navigatorBar=By.xpath("//nav[@class='navbar-collapse collapse']/ul");
	private By popup=By.xpath("//button[text()='NO THANKS']");
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public LoginPage getLogin()
	{
		driver.findElement(login).click();
		return new LoginPage(driver);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement getNavigatorBar()
	{
		return driver.findElement(navigatorBar);
	}
	
	public WebElement getPopup()
	{
        return driver.findElement(popup);		
	}
	public int getPopupSize()
	{
        return driver.findElements(popup).size();		
	}
}
