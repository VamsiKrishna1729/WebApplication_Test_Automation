import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
		// gives 1 result
		List<WebElement> filtered_list=rows.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());	
		// gives 1 result
		Assert.assertEquals(rows.size(),filtered_list.size());
		
	}

}
