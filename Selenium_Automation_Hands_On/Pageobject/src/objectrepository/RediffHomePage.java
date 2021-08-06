package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
     // page object model
	WebDriver driver;
	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	By Search=By.cssSelector("input[id='srchword']");
	By submit=By.xpath("//input[@class='newsrchbtn']");
	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
	
	
	
	
	
	
}
