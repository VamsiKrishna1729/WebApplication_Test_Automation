package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Academy.E2EProject.base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
public class validateNavigationBar extends base{
	public WebDriver driver;
	private static Logger Log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=intializeDriver();	
		driver.get(prop.getProperty("URL"));
	}
	
@Test
public void baseNavigationPage() throws IOException
{

// created object to that landingpage class and invoke methods to it to this class
LandingPage l=new LandingPage(driver);

//checking whether navigation bar is displayed or not
Assert.assertTrue(l.getNavigatorBar().isDisplayed());
Log.info("navigation bar is displayed");

}

@AfterTest
public void tearDown()
{
	driver.close();
}

}


