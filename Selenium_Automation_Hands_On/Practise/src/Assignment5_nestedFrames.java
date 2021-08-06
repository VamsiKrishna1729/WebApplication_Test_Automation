import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_nestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[href*='nested']")).click();
	  //driver.switchTo().frame(driver.findElement(By.tagName("frameset")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
      //System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText()); <- using the cssSelector for text grabbing
		System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
			
	}

}
