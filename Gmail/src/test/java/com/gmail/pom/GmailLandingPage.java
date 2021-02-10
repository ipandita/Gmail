package com.gmail.pom;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.utility.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;


public class GmailLandingPage extends Utility {

private Utility driverbase;
	
	public GmailLandingPage(Utility driverbase) {
		this.driverbase=driverbase;
	}
	
	@FindBy(xpath = "//div[@class=\"T-I T-I-KE L3\"]")
	private WebElement Composebtn;
	
	@FindBy(xpath = "//input[@aria-label=\"Search mail\"]")
	private WebElement Searchtextbox;
	
	@FindBy(xpath = "//textarea[@name=\"to\"]")
	private WebElement totxt;
	
	@FindBy(xpath = "//input[@name=\"subjectbox\"]")
	private WebElement subjectbx;
	
	@FindBy(xpath = "//div[@class=\"Am Al editable LW-avf tS-tW\"]")
	private WebElement Msgtxt;
	
	@FindBy(xpath = "//div[@class=\"T-I J-J5-Ji aoO v7 T-I-atl L3\"]")
	private WebElement SendBtn;
	
	@FindBy(xpath = "//div[@class=\"TN bzz aHS-bnu\"]")
	private WebElement Sentitemsbtn;
	
	
	@FindBy(xpath = "//img[@class=\"gb_Da gbii\"]")
	private WebElement AccountImg;
	
	@FindBy(xpath = "//a[text()=\"Sign out\"]")
	private WebElement SignOut;
	
public GmailLandingPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	
		
	}
	
	public WebElement Composebtn() {
		return Composebtn;
	}
	
	public WebElement Searchtextbox() {
		return Searchtextbox;
	}
	
	public WebElement To() {
		return totxt;
	}
	
	public WebElement Sendbtn() {
		return SendBtn;
	}
	public WebElement Sentitems() {
		return Sentitemsbtn;
	}
	
	public WebElement AccountImg() {
		return AccountImg;
	}
	
	public WebElement SignOut() {
		return SignOut;
	}
	
	public void composefuntionalitybyuser(String to,String subject,String Message) {
		
		totxt.sendKeys(to);
		subjectbx.sendKeys(subject);
		Msgtxt.sendKeys(Message);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
