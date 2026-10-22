package mavenprojectbhim;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Bhimclass {
	
	WebDriver driver=new ChromeDriver();
	
	@Test
	public void launch()
	{
		driver.navigate().to("https://www.google.com");
		System.out.println("disply");
		
	}

}
