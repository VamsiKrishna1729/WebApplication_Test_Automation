import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_UIAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cleartrip.com/");
		driver.switchTo().alert().dismiss();
		// need to write chrome options code here 
		driver.findElement(By.cssSelector("input[title='Depart date']")).click();
		driver.findElement(By.className("ui-state-default ui-state-highlight ui-state-active ")).click();
		WebElement select_dropdown=driver.findElement(By.id("Adults"));
		Select select_dd=new Select(select_dropdown);
		select_dd.selectByIndex(3);
		System.out.println(select_dd.getFirstSelectedOption());
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.name("airline")).sendKeys("Indigo");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
				
				
		
		
		
	}

}
