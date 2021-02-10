package com.gmail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.stepdefnition.Hooks;
import com.gmail.utility.Utility;

public class GmailHomePage extends Utility {
	
	private Utility driverbase;
	
	public GmailHomePage(Utility driverbase) {
		this.driverbase=driverbase;
	}
	
	
	@FindBy(xpath = "//span[text()=\"Sign in\"]")
	private WebElement signIntext;
	
	@FindBy(xpath = "//input[@class=\"whsOnd zHQkBf\"]")
	private WebElement emailIdtextbox;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement passwordtextbox;
	
	@FindBy(xpath = "//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc\"]")
	private WebElement nextbtn;
	
	
	@FindBy(xpath = "//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc\"]")
	private WebElement nextbtn2;
	
	@FindBy(xpath = "//img[@class=\"gb_Da gbii\"]")
	private WebElement AccountImg;
	
	@FindBy(xpath = "//a[text()=\"Sign out\"]")
	private WebElement SignOut;
	
	public GmailHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	
		
	}
	
	public WebElement emailtxtbx() {
		return emailIdtextbox;
	}
	
	
	public WebElement passtxtbx() {
		return passwordtextbox;
	}
	
	public WebElement nextbtn() {
		return nextbtn;
	}
	
	public WebElement nextbtn2() {
		return nextbtn2;
	}
	
	public WebElement SignIntxt() {
		return signIntext;
	}
	
	public WebElement AccountImg() {
		return AccountImg;
	}
	
	public WebElement SignOut() {
		return SignOut;
	}
	public void loginingmailbyvalidcredentials() throws InterruptedException {
		emailIdtextbox.sendKeys("keith.singh158@gmail.com");
		nextbtn.click();
		Thread.sleep(2000);
		passwordtextbox.sendKeys("0833991023");
		
		
	}
	
	

}
