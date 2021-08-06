package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	
	private By email=By.cssSelector("input[id='user_email']");
	private By password=By.cssSelector("input[id='user_password']");
	private By loginB=By.cssSelector("input[value='Log In']");
	private By forgotpwd=By.cssSelector("a[href*='password/new']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public ForgotPassword forgotPassword()
	{
	 driver.findElement(forgotpwd).click();
	 return new ForgotPassword(driver);
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getLoginB()
	{
		return driver.findElement(loginB);
	}
}
