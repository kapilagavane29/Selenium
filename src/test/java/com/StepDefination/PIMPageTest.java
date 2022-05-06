package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilsLayer.SelectDropDown;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageTest extends BaseClass{
	 String employeeId;
	@Given("user is on pim page click on add button")
	public void user_is_on_pim_page_click_on_add_button() {
	    driver.findElement(By.xpath("//b[text()='PIM']")).click();
	    driver.findElement(By.id("btnAdd")).click();
	}
	@When("create a new emplyoee")
	public void create_a_new_emplyoee() {
	    driver.findElement(By.id("firstName")).sendKeys("adv");
	    driver.findElement(By.id("lastName")).sendKeys("sfsas");
	    employeeId=driver.findElement(By.id("employeeId")).getAttribute("value");
	    driver.findElement(By.id("btnSave")).click();
	}
	@Then("fillup more personal details")
	public void fillup_more_personal_details() {
	    driver.findElement(By.id("btnSave")).click();
	    WebElement wb=driver.findElement(By.id("personal_cmbNation"));
	    SelectDropDown.selectVisibleText(wb,"Indian");
	    SelectDropDown.getTheSelectedValue(wb);
	    driver.findElement(By.id("btnSave")).click();
	}
	@Then("search user by using emplyoee id")
	public void search_user_by_using_emplyoee_id() {
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(employeeId);
		driver.findElement(By.id("searchBtn")).click();
		
	  
	}
	@Then("delete newly created emplyoee id")
	public void delete_newly_created_emplyoee_id() {
//		driver.findElement(By.xpath("//table[@id='resultTable']//tbody//td[1]")).click();
//		driver.findElement(By.id("btnDelete")).click();
//		driver.findElement(By.id("dialogDeleteBtn")).click();
		System.out.println("work is completed");
		driver.close();
	    	   
	}


}
