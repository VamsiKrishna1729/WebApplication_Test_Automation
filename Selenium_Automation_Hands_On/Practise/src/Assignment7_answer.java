import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	  /*int row_count=driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr")).size();
		int col_count=driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr/th")).size();
		System.out.println("rowcount="+row_count+" "+"columncount="+col_count);
		System.out.println(driver.findElement(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr[3]")).getText()); */
		WebElement table=driver.findElement(By.id("product"));
		System.out.println("rowcount"+table.findElements(By.tagName("tr")).size());
		System.out.println("columncount"+table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		
		
		
	}

}
