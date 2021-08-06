package objectrepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RediffLoginPagePF {
	// PageFactory model
	WebDriver driver;
	public RediffLoginPagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*
	By username=By.xpath("//input[@id='login1']");
	By Password=By.id("password");
	By signin=By.name("proceed");
	By home=By.linkText("rediff.com");
	*/
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	@FindBy(id="password")
	WebElement Password;
	@FindBy(name="proceed")
	WebElement signin;
	@FindBy(linkText="rediff.com")
	WebElement home;

	public WebElement EmailId()
	{
		return username;
	}
	public WebElement Password()
	{
		return Password;
	}
	public WebElement signin()
	{
		return signin;
	}
	public WebElement Home()
	{
		return home;
	}
	
	
}
