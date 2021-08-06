package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@AfterSuite
	public void aSuite() {
  	  System.out.println("After_Suite_day2");
    }
	  
      @Test(dataProvider="getData")
       public void DemoTestCase1(String usn,String psw) {
    	  System.out.println("Day2 Hello");
    	  System.out.println(usn+" "+psw);
      }
	  @DataProvider
	  public Object[][] getData(){
		  Object[][] data=new Object[3][2];
		  //first set combination
		  data[0][0]="1st_set_username";
		  data[0][1]="1st_set_password";
		  // second set combination
		  data[1][0]="2st_set_username";
		  data[1][1]="2st_set_password";
		  // third set combination
		  data[2][0]="3st_set_username";
		  data[2][1]="3st_set_password";
		return data;
		  
		  
	  }

}
