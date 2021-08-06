import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.qaclickacademy.com/index.php");
 System.out.println(driver.findElement(By.xpath("//li[@class='active']")).getText());
System.out.println(driver.findElement(By.xpath("//li[@class='active']/following-sibling::li[1]")).getText());
System.out.println(driver.findElement(By.xpath("//li[@class='active']/following-sibling::li[2]")).getText());

	}

}
