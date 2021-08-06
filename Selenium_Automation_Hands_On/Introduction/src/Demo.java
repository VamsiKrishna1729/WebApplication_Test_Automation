import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.tcs.com"); //it will hit this url
System.out.println(driver.getTitle()); //it will fetch the webpage title
System.out.println(driver.getCurrentUrl()); // it will print-out current url of opened page so that you can validate
//System.out.println(driver.getPageSource()); //it will print entire page source code in console
driver.get("https://www.yahoo.com");
driver.navigate().back();
driver.close();


	}

}
