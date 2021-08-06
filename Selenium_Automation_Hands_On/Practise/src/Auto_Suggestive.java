
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto_Suggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("india");
		Thread.sleep(1000L);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(int i=0;i<options.size();i++)
		{
			WebElement w=options.get(i);
			if(w.getText().equalsIgnoreCase("india"))
			{
				w.click();
				//System.out.print(driver.findElement(By.id("autosuggest")).getText());
				System.out.println(w.getText());
				break;
			}
		}
						
	}

}
