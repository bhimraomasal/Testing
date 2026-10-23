package mavenprojectbhim;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bhimclass extends Basetest {
	 
		
	
	@Test
	public void launch()
	{
		
			
			getDriver().navigate().to("https://www.google.com");
		
			System.out.println("launch method"+ getDriver());
		
	}
	
	@Test
	public void seach()
	{
		getDriver().navigate().to("https://www.michaelpage.co.in/");
		System.out.println("search method"+getDriver());
	}

	@Test
	public void show()
	{
		getDriver().navigate().to("https://www.facebook.com");
		System.out.println("Show method"+getDriver());
	}
}
