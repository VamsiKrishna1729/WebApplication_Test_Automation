import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SSL Certificates
		
        // created the profile  
		DesiredCapabilities ch=DesiredCapabilities.chrome();
	  //ch.acceptInsecureCerts();
	    ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
	    ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		// merged profile to your local browser
		ChromeOptions c=new ChromeOptions();         // ChromeOptions is used to set chrome browser settings
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
		
		
	}

}
