package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {

		@BeforeSuite
		public void bSuite()
		{
			System.out.println("Before_Suite_day1");
		}
		
		@Test(groups= {"Smoke"})
		public void DemoTestCase1()
		{
			System.out.println("Hello");
		}
		@Test
		public void DemoTestCase2() {
			System.out.println("Bye");
		}

}