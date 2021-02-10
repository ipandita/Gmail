package com.gmail.stepdefnition;

import org.junit.runner.RunWith;
import org.testng.Assert;

import com.gmail.pom.GmailHomePage;
import com.gmail.utility.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class login extends Utility{
	  GmailHomePage ghm;
private Utility driverbase;
	
	public login(Utility driverbase) {
		this.driverbase=driverbase;
	}


    @Given("^Validate user is on gmail home page$")
    public void validate_gmail_home_page() throws Throwable {
    
    	ghm=new GmailHomePage(driverbase.driver);
    	
    	
    	Assert.assertEquals(ghm.SignIntxt().getText(),"Sign in");
    }

    @Then("^Enter Username and password$")
    public void enter_username_and_password() throws Throwable {
    	   
    	    ghm.loginingmailbyvalidcredentials();
    }

    @And("^Click on next button$")
    public void click_on_login_button() throws Throwable {
    	ghm.nextbtn2().click();
    	
    	
    }
    @Then("^Signoff from account$")
    public void signoff_from_account() throws Throwable {
    	 ghm.AccountImg().click();
    	 Thread.sleep(2000);
	        ghm.SignOut().click();
    }

}
