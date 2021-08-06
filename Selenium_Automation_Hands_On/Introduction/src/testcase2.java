import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.ie.driver","c:\\IEDriverServer.exe");
WebDriver driver=new InternetExplorerDriver();
driver.get("https://www.tcs.com");
System.out.print(driver.getTitle());
System.out.println(driver.getCurrentUrl());
	}

}
