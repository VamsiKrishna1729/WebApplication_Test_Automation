import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffxpathcss_regexp {

	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com");
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("vamsi4964");
        driver.findElement(By.cssSelector("input#password")).sendKeys("123vamsi");
        driver.findElement(By.xpath("//input[@name='proceed']")).click();
        
		
		
		
	}
}
