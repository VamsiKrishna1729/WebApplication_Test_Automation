import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//switching to frame
		driver.switchTo().frame(0); // <- using frame number
	    //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));  <- Using web_element
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source,target).build().perform();
		//switching to normal content/webpage
		driver.switchTo().defaultContent();
		
		
	}

}
