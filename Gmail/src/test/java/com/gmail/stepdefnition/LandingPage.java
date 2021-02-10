package com.gmail.stepdefnition;

import org.junit.runner.RunWith;
import org.testng.Assert;

import com.gmail.pom.GmailLandingPage;
import com.gmail.utility.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
public class LandingPage extends Utility {
	 GmailLandingPage glp;
private Utility driverbase;
	
	public LandingPage(Utility driverbase) {
		this.driverbase=driverbase;
	}
	

	 @Then("^Validate user is on landing page$")
	    public void validate_user_is_on_landing_page() throws Throwable {
		  glp=new GmailLandingPage(driverbase.driver);
		 Thread.sleep(2000);
	       Assert.assertTrue(glp.Searchtextbox().isDisplayed());
	    }

	    @Then("^User compose email with to,cc and email text$")
	    public void user_compose_email_with_tocc_and_email_text() throws Throwable {
	    	glp.Composebtn().click();
	    	 Thread.sleep(3000);
	       glp.composefuntionalitybyuser("info@kansastek.com","Test Assignment","Test Message @IshanPandita");
	    	
	    	
	    }

	    

	    @And("^Click on send button$")
	    public void click_on_send_button() throws Throwable {
	        glp.Sendbtn().click();
	        
	      
	    }
	    
	  
}
