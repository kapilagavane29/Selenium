package com.StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;

import BaseLayer.Demo1;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsFoe extends Demo1 {
	@When("user test google title")
	public void user_test_google_title() {
		Demo1.initialization("https://www.google.com");
		String a = driver.getTitle();
		Assert.assertEquals(a, "Google");
	}
	@Then("user test facebook title")
	public void user_test_facebook_title() {
		Demo1.initialization("https://www.facebook.com/");
		String a = driver.getCurrentUrl();
		Assert.assertEquals(a.contains("facebook"), true);
	}
	@Then("user test logo")
	public void user_test_logo() {
		Demo1.initialization("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		boolean a = driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
		Assert.assertEquals(a, true);
	    
	}


	



}
