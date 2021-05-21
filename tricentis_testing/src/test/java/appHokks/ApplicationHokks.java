package appHokks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


import com.util.ConfigReader;
import com.util.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class ApplicationHokks {
private DriverFactory df;
private WebDriver driver;
private ConfigReader configReader;
Properties prop;

@Before(order=0)
public void getProperty() throws IOException
{
	configReader =new ConfigReader();
	prop=configReader.init_prop();
	//System.out.println(prop.getProperty("browser");
}
@Before(order=1)
public void launchBrowser()
{
	String browserName= prop.getProperty("browser");
	df=new DriverFactory();
	driver=df.init_driver(browserName);
	System.out.println("runnnn");
}

@After(order=0)
public void quitBrowser()
{
	driver.quit();
}

}
