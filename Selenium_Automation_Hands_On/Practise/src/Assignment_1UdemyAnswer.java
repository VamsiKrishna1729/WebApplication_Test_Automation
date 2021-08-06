import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1UdemyAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.findElement(By.id("checkBoxOption1")).click(); //check the first check box
System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); // verify if it is successfully checked
driver.findElement(By.id("checkBoxOption1")).click();  // uncheck the checkbox
System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); // verify if it is successfully unchecked 	
List<WebElement> elements=driver.findElements(By.xpath("//*[@type='checkbox']"));
       // count of number of checkboxes
System.out.println(elements.size());
		
	}

}
