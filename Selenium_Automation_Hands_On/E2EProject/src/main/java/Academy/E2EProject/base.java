package Academy.E2EProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	Properties prop;
	public WebDriver driver;
	public WebDriver intializeDriver() throws IOException {
         prop=new Properties();	
FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");	
prop.load(fis);
//String browserName=System.getProperty("browser"); // uncomment this line if you are sending parameter from maven
String browserName=prop.getProperty("browser");  // comment this line if you are sending parameter from maven 

if(browserName.contains("chrome"))
{
	//execute in chrome driver
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	if(browserName.contains("headless")) 
	{
		options.addArguments("headless");
	}
	driver=new ChromeDriver(options);
	
}
else if(browserName.equals("firefox"))
{
	//firefox code
	System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
	driver=new FirefoxDriver();
}
else if(browserName.equals("IE"))
{
  //IE Code
}

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
return driver;

	}
	public String getScreenShotPath(String testMethodName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testMethodName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	}
	
}
