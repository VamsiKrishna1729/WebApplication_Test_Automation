import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w= new WebDriverWait(driver,5);
	  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// adding products to a string array
		String items[]={"Brocolli","Cucumber","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver,items);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	  //driver.findElement(By.xpath("//div[@class='action-block'] //button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver,String[] items)
	{
		List<WebElement> products=driver.findElements(By.className("product-name"));
		int j=0;
		for(int i=0;i<products.size();i++)
		{
			String name[]=products.get(i).getText().split("-");
			String formatString=name[0].trim();
			List itemsNeededList=Arrays.asList(items);
			
			if(itemsNeededList.contains(formatString))
			{
				// click on Add to cart
			driver.findElements(By.xpath("//div[@class='product-action'] //button[@type='button']")).get(i).click();
		  //driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			//Thread.sleep(6000L);
				j++;
				if(j==items.length) 
				{
			break;
			    }
			}
		}
	}
	
	
	
}
