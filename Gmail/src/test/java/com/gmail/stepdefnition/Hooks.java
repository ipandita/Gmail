package com.gmail.stepdefnition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gmail.utility.Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utility  {

	private Utility driverbase;
	
	public Hooks(Utility driverbase) {
		this.driverbase=driverbase;
	}
	
	@Before
	public void launchbrowser() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\git\\repository\\Gmail\\exefiles\\chromedriver.exe");
		 driverbase.driver=new ChromeDriver();
		
		
	
	
		 driverbase.driver.manage().window().maximize();
		 driverbase.driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 driverbase.driver.get("https://mail.google.com/");
	}
	
	 
	
	@After
	public void teardownbrowser() {
		driverbase.driver.close();
		driverbase.driver.quit();
	}
}
