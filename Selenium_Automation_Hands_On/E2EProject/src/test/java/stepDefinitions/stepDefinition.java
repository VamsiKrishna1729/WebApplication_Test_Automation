package stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.model.Log;

import Academy.E2EProject.base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;

public class stepDefinition extends base {
	LoginPage lp;
   

		@Given("^Inintialize the browser with chrome$")
		public void inintialize_the_browser_with_chrome() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver=intializeDriver();
		}

		@Given("^Navigate to \"([^\"]*)\" Site$")
		public void navigate_to_Site(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.get(arg1);
		}

		@Given("^Click on Login link in home page to land on secure sign in page$")
		public void click_on_Login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			LandingPage l=new LandingPage(driver);
			if(l.getPopupSize()>0) {
				l.getPopup().click();
			}
			lp=l.getLogin();
		}


		@Then("^Verify that user is successfully logged in$")
		public void verify_that_user_is_successfully_logged_in() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			portalHomePage p=new portalHomePage(driver);
			Assert.assertTrue(p.getSearchBox().isDisplayed());
		    
		}
		@When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
			lp.getEmail().sendKeys(username);
			lp.getPassword().sendKeys(password);   
			lp.getLoginB().click();
		}
	    
		@And("^close browsers$")
		public void close_browsers() throws Throwable{
			driver.quit();
		}
		
	

}
