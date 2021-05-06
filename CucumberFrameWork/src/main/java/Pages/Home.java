package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
@FindBy(id="nav-link-accountList") WebElement Signhover;
@FindBy(xpath = "(//*[text()='Sign in'])[1]") WebElement Signhoverclick;
public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void SignHoverMenu() {
	Actions actions=new Actions(driver);
	actions.moveToElement(Signhover).build().perform();
}
public void SignHoverClick() {
	Actions actions=new Actions(driver);
	actions.moveToElement(Signhoverclick).click().build().perform();
	
}
}
