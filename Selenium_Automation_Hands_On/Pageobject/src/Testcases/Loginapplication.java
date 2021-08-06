package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;
import objectrepository.RediffLoginPagePF;

public class Loginapplication {

	// Login page class implemented in Page factory model
	// Home page class is implemented in Page object model
	
	@Test
	public void Login() throws InterruptedException {	
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	RediffLoginPagePF rd=new RediffLoginPagePF(driver);
	rd.EmailId().sendKeys("vamsi@gmail.com");
	rd.Password().sendKeys("123vamsi");
	rd.signin().click();
	rd.Home().click();
	RediffHomePage rh= new RediffHomePage(driver);
	Thread.sleep(5000L);
	rh.Search().sendKeys("Business Insurance Subject");
	rh.Submit().click();
	}
}
