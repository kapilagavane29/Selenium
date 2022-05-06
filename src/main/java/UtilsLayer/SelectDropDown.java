package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class SelectDropDown extends BaseClass {
	
	public static  void selectVisibleText(WebElement wb,String value) {
		new Select(wb).selectByVisibleText(value);
	}
	public static void getTheSelectedValue(WebElement wb) {
		System.out.println(new Select(wb).getFirstSelectedOption().getText());
	}

}
