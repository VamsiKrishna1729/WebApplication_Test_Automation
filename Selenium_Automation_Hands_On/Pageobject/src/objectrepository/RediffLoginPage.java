package objectrepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RediffLoginPage {
	// page object model
	WebDriver driver;
	public RediffLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	By username=By.xpath("//input[@id='login1']");
	By Password=By.id("password");
	By signin=By.name("proceed");
	By home=By.linkText("rediff.com");
	public WebElement EmailId()
	{
		return driver.findElement(username);
	}
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	public WebElement Home()
	{
		return driver.findElement(home);
	}
}
