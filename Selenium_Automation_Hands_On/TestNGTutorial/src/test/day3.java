package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeTest
	public void bTest()
	   {
		   System.out.println("Before_Test_day3");
	   }
   @Parameters({"URL", "KEY"})
   @Test
   public void WebLoginCarLoan(String strurl,String keyvalue)
   {
	   System.out.println("WebLoginCar");
	   System.out.println("URL"+strurl);
	   System.out.println("keyvalue"+keyvalue);
   }
   
   @Test(groups= {"Smoke"})
   public void MobLoginCarLoan()
   {
	   System.out.println("MobLoginCar");
   }
   
   @Test
   public void LoginAPICarLoan()
   {
	   System.out.println("APILoginCar");
   }
}
