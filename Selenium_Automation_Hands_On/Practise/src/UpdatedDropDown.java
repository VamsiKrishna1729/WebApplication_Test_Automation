import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("it's enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
				
		//count number of check boxes
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000L);
		for(int i=1;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
	}

}
