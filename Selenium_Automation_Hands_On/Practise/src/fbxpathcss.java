import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbxpathcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("vamsi@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123vamsi");
		driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
		//driver.close();
	}

}
