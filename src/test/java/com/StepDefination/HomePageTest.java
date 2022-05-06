package com.StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;


import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTest extends BaseClass{
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		BaseClass.initialization();
	}
	@When("User entered valid username and password")
	public void user_entered_valid_username_and_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	   
	}
	@Then("user is on HomePage")
	public void user_is_on_home_page() {
		String a=driver.getTitle();
		System.out.println(a);
		
	    
	}
	@Then("validate user on homepage by using get title")
	public void validate_user_on_homepage_by_using_get_title() {
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle.contains("HRM"),true);
		//System.out.println("true");
		
	}
	@Then("validate user on homepage by using get Url")
	public void validate_user_on_homepage_by_using_get_url() {
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl.contains("dashboard"), true);
		}
	@Then("validate user on homepage by using Logo")
	public void validate_user_on_homepage_by_using_logo() {
		boolean actualLogo=driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
		Assert.assertEquals(actualLogo, true);
	    
	}

}
