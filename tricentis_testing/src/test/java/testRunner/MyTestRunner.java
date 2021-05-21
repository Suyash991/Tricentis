package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\samarth\\Documents\\Selenium\\tricentis_testing\\src\\test\\java\\com\\features\\Cart.feature",
         glue= {"stepDefinations","appHokks"},
         plugin= {"pretty"})


public class MyTestRunner {

}
