import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
/*driver.findElement(By.id( "email")).sendKeys("vamsikrishna17290@gmail.com");
driver.findElement(By.name("pass")).sendKeys("123vamsi");
driver.findElement(By.linkText("Forgotten password?")).click();*/
driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("vamsi@gmail.com");
//driver.findElement(By.cssSelector("#pass")).sendKeys("123vamsi");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123vamsi");
//driver.findElement(By.xpath("//*[@id=\'loginbutton\']")).click();
driver.findElement(By.xpath("//button[@name='login']")).click();
//driver.close();
	}

}
