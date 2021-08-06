import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.tcs.com");
System.out.print(driver.getTitle());
	}

}
