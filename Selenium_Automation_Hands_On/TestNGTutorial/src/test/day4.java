package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day4 {
	
	@AfterTest
	public void aTest()
	   {
		   System.out.println("afterTest_day4");
	   }
	
   @Test(groups= {"Smoke"})
   public void WebLoginHomeLoan()
   {
	   System.out.println("WebLoginHome");
   }
   
   @Test(dependsOnMethods= {"WebLoginHomeLoan"})
   public void MobLoginHomeLoan()
   {
	   System.out.println("MobLoginHome");
   }
   
   @Test
   public void LoginAPIHomeLoan()
   {
	   System.out.println("APILoginHome");
   }
}
