
package BaseLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	@When("user enterd valid username and valid password")
	public void user_enterd_valid_username_and_valid_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	    
	}
	@Then("user is on home page")
	public void user_is_on_home_page() {
		String a=driver.getTitle();
		System.out.println(a);
		driver.close();
	    
	}

}
