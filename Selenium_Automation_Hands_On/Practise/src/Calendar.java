import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(5000L);
		driver.findElement(By.cssSelector("input[id='travel_date']")).click();
		
		for(int i=0;i<12;i++)
		{
			
			String str=driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[1]/th[2]")).getText();
		if(str.equalsIgnoreCase("August 2021"))
		{
			// grab the common attribute and put it into a list
			List<WebElement> dates=driver.findElements(By.className("day"));
			int count=dates.size();
			
			for(int j=0;j<count;j++)
			{
				String text=driver.findElements(By.className("day")).get(i).getText();
				if(text.equalsIgnoreCase("1"))
				{
					driver.findElements(By.className("day")).get(i).click();
					System.out.println(driver.findElement(By.cssSelector("input[id='travel_date']")));
					
					break;
				}
			}
			break;
			
		}
		else 
		{
		driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[1]/th[3]")).click();
		}	
		
		}
		
	}

}
