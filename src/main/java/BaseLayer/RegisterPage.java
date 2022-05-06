package BaseLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPage {
	WebDriver driver;
	@Given("user is on register page")
	public void user_is_on_register_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/reg");

	}
	@When("user enter first name and last name")
	public void user_enter_first_name_and_last_name() {
		driver.findElement(By.name("firstname")).sendKeys("fdss");
		driver.findElement(By.name("lastname")).sendKeys("dx");

	    
	}
	@When("user enter password, user select date of birth")
	public void user_enter_password_user_select_date_of_birth() {
		driver.findElement(By.name("reg_passwd__")).sendKeys("9765912200");
		WebElement wb=driver.findElement(By.id("month"));
		Select sel = new Select(wb);
		sel.selectByVisibleText("Jul");
		System.out.println(sel.getFirstSelectedOption().getText());
	    
	}
	@Then("account is succesfully created")
	public void account_is_succesfully_created() {
		System.out.println("account is created.");
	
	    
	}



}
