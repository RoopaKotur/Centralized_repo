package Generic_scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_constants {
	public WebDriver driver;
@BeforeMethod
public void OpenAppln()
{
	System.setProperty(gecko_key,gecko_value);
	driver=new FirefoxDriver();
	driver.get(url);
}
			
@AfterMethod
public void CloseAppln(ITestResult result) throws IOException
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		generic_screenshot.getPhoto(driver);
	}
	
	driver.close();
}


}
