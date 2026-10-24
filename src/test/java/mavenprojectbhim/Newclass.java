package mavenprojectbhim;

import org.testng.annotations.Test;

public class Newclass extends Basetest {
	
	@Test
	public void Launchamundi()
	{
		getDriver().navigate().to("https://www.amundi-ee.com/account/#login");
	}
	
	@Test
	public void launchyutube()
	{
		getDriver().navigate().to("https://www.youtube.com/");
	}

}
