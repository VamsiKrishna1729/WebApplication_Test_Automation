package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Academy.E2EProject.base;
import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
public class HomePage extends base{
	public WebDriver driver;
	
	private static Logger Log=LogManager.getLogger(base.class.getName());
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=intializeDriver();
					
	}  

@Test(dataProvider="getData")
public void baseNavigationPage(String Username, String Password, String text) throws IOException
{
	driver.get(prop.getProperty("URL"));
LandingPage l=new LandingPage(driver);
LoginPage lp=l.getLogin();
lp.getEmail().sendKeys(Username);
lp.getPassword().sendKeys(Password);

//System.out.println(text);
Log.info(text);

lp.getLoginB().click();
ForgotPassword fp=lp.forgotPassword();
fp.getEmail().sendKeys("abc@gmail.com");
fp.sendMeInstructions().click();

}

@DataProvider
public Object[][] getData()
{
	Object[][] obj=new Object[2][3];
	obj[0][0]="nonrestricteduser@qw.com";
	obj[0][1]="123456";
	obj[0][2]="Restricted User";
	
	obj[1][0]="restricteduser@qw.com";
	obj[1][1]="456788";
	obj[1][2]="Non Restricted User";
	
	return obj;
}
@AfterTest
public void tearDown()
{
	driver.close();
}
}


