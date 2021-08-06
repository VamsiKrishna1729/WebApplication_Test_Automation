import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RelativeLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());
		WebElement dateOfBirth=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(withTagName("input").below(dateOfBirth)).sendKeys("06/07/2021");
		
		WebElement iceCreamLabel=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(withTagName("input").toLeftOf(iceCreamLabel)).click();
		// get me the label of first radio button
		WebElement rb=driver.findElement(By.cssSelector("[id='inlineRadio1']"));
		System.out.println(driver.findElement(withTagName("label").toRightOf(rb)).getText());

	}

}
