package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Home;
import Pages.Password;
import Pages.Signit;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Sign {
	WebDriver driver;
	
	@Before
	public void setup() {
		String Path=System.getProperty("user.dir");
		 
			   System.setProperty("webdriver.chrome.driver", Path+"\\Drivers\\chromedriver.exe");
			    driver= new ChromeDriver();
			    driver.get("https://www.amazon.com");
			    driver.manage().window().maximize();
	}
	@After
	public void teardown() {
		System.out.println("This to after");
		
	
}
	@When("^hover mouse pointer to signin$")
	public void hover_mouse_pointer_to_signin() throws Throwable {
		Home Home=new Home(driver);
		Home.SignHoverMenu();
	    
	}

	@When("^clicks on sign-in button$")
	public void clicks_on_sign_in_button() throws Throwable {
		Home Home=new Home(driver);
		Home.SignHoverClick();
	    
	}

	@Then("^user will see sign-in page$")
	public void user_will_see_sign_in_page() throws Throwable {
		Signit Signit=new Signit(driver);
		String Mobiles=Signit.Confirmtiontxdisplays().getText();
		Assert.assertEquals(Mobiles, "Email or mobile phone number");
	    
	}

	@When("^I enters userid \"([^\"]*)\"$")
	public void i_enters_userid(String arg1) throws Throwable {
		Signit Signit=new Signit(driver);
		Signit.EmailFieldEnter(arg1);
	    
	}

	@When("^clicks on continue button$")
	public void clicks_on_continue_button() throws Throwable {
		Signit Signit=new Signit(driver);
		Signit.ContinueButtonClick();
	    
	}

	@Then("^password page displays to the user$")
	public void password_page_displays_to_the_user() throws Throwable {
		//Password Password=new Password(driver);
		Signit Signit=new Signit(driver);
		String Write=Signit.PasswordTxConfrmation().getText();
		Assert.assertEquals(Write, "Password");
		
	   
	}

	@When("^I enters valid password \"([^\"]*)\"$")
	public void i_enters_valid_password(String psswd) throws Throwable {
		//Password Password=new Password(driver);
		Signit Signit=new Signit(driver);
		Signit.psswdsendchar(psswd);
	    
	}

	@When("^click on Sign-in button$")
	public void click_on_Sign_in_button() throws Throwable {
		Signit Signit=new Signit(driver);
		//Password Password=new Password(driver);
		Signit.Sign();
	}

	@Then("^user logged-in successfully$")
	public void user_logged_in_successfully() throws Throwable {
	   
	}
}
