import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTable_streams {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		Thread.sleep(9000L);
		//click on column tab
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		// capture all webelements into a list
		List<WebElement> elementList=driver.findElements(By.xpath("//tr/td[1]"));
		
		// capture text of all webelements into new(original) list
		List<String> originalList=elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step-3 -> sorted list
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		// scan the name column with getText ->Rice -> print the price of the Rice
	
		/* 
		 //Normal script
		 driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementList1=driver.findElements(By.xpath("//tr/td[1]"));
		for(int i=0;i<elementList.size();i++)
		{
		if(elementList1.get(i).getText().equals("Rice"))
		{
			System.out.println(driver.findElement(By.xpath("//tbody/tr[4]/td[2]")).getText());
		}
		
		}
		*/
		
	/*	// scan the name column with getText ->Beans -> print the price of the Beans
		// using stream
		List<String> price=elementList.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s))
				.collect(Collectors.toList());
		System.out.println(price.get(0));
		*/
		
		// scan name Rice through all pages by clicking next and print corresponding price
		List<String> price;
		do {
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
			price=rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
			if(price.size()<1)
			{
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
			
		}while(price.size()<1);		
		
	}	

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String str=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return str;
	}
	


}
