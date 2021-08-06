package Academy.E2EProject;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
public class validateTitle extends base{
	public WebDriver driver;
	private static Logger Log=LogManager.getLogger(validateTitle.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=intializeDriver();	
		Log.info("driver is intialized");
		driver.get(prop.getProperty("URL"));
		Log.info("navigated to home page");
	}
	
@Test
public void baseNavigationPage() throws IOException
{
	
LandingPage l=new LandingPage(driver);
System.out.println(l.getTitle().getText());
Assert.assertEquals(l.getTitle().getText(),"FEATURED CURSES");
Log.info("successfully validated the Text messsage");
}

@AfterTest
public void tearDown()
{
	driver.close();
}

}


