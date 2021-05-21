package stepDefinations;

import org.junit.Assert;
//import org.openqa.selenium.WebDriver;

import com.tricentis.pages.CartPage;
import com.util.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {
	
	private CartPage cart = new CartPage(DriverFactory.getDriver());
	
	
	 
	@Given("^User is already on homepage$")
	public void user_is_already_on_homepage()  {
		
		DriverFactory.getDriver()
		.get("http://demowebshop.tricentis.com/");
	    
	}

	@Given("^User selected a product$")
	public void user_selected_a_product()  {
		
		
	    
	  cart.selectItem();
	}

	@When("^User is click the add to cart button$")
	public void user_is_click_the_add_to_cart_button()  {
	   cart.addtocart();
	}

	@Then("^message displayed \"([^\"]*)\"$")
	public void message_displayed(String arg1)  {
		
	String s=cart.getMessage();
	System.out.println(arg1);
	System.out.println(s);
	Assert.assertEquals(arg1, arg1);
	}

	

}
