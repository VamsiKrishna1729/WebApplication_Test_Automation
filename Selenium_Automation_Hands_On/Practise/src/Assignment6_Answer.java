import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6_Answer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//select label name 
		String labelname=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		WebElement static_dropdown= driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
		Select dropdown=new Select(static_dropdown);
        dropdown.selectByVisibleText(labelname);
        driver.findElement(By.cssSelector("input[id='name']")).sendKeys(labelname);
        driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
        
        String str=driver.switchTo().alert().getText();
        if(str.contains(labelname))
        {
        	System.out.println("yes,label text is present in the alert message !!!!");
        }
        
			
	}

}
