import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://login.salesforce.com/?locale=in");
driver.findElement(By.cssSelector("input[class='input r4 wide mb16 mt8 username']")).sendKeys("vamsi4963");
driver.findElement(By.cssSelector("[id='password']")).sendKeys("123vamsi");
driver.findElement(By.xpath("//input[@id='Login']")).click();


	}

}
