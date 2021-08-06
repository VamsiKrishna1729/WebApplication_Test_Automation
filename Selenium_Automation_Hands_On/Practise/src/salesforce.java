import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://login.salesforce.com/");
driver.findElement(By.id("username")).sendKeys("vamsi@salesforce.com");
driver.findElement(By.name("pw")).sendKeys("password123");
//driver.findElement(By.name("Login")).click();
//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
driver.findElement(By.cssSelector("input#Login.button.r4.wide.primary")).click();
System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

	}

} 
