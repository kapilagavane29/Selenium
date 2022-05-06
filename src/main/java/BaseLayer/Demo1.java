package BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static WebDriver driver;
	public static void initialization(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	 driver = new ChromeDriver();
	driver.get(url);

}
	}

