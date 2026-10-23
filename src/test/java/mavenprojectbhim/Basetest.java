package mavenprojectbhim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Basetest {
	
	private static ThreadLocal<WebDriver> driver =  new ThreadLocal<>();

	    @Parameters("browser")
	    @BeforeMethod
	    public void setup(String browser) {

	        driver.set(new ChromeDriver()); 
	        System.out.println("browser:-"+ browser);

	        System.out.println( "Driver Thread : "  + Thread.currentThread().getId());
	    }

	    public static WebDriver getDriver() {
	        return driver.get();
	    }
		 @AfterMethod
		 public void tearDown() 
		 { getDriver().quit(); driver.remove(); 
		 }
		 
	
}
