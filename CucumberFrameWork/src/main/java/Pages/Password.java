package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password {
	WebDriver driver;
@FindBy(name = "password") WebElement psswd;
@FindBy(id="signInSubmit") WebElement SignbuttoncliCk;
@FindBy(xpath="//label[contains(text(),'Password')]") WebElement Passwordtxconfirm;
public Password(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void psswdsendchar(String psswds) {
	psswd.sendKeys(psswds);
}
public void Sign() {
	SignbuttoncliCk.click();
}
public WebElement PasswordTxConfrmation() {
	return PasswordTxConfrmation();
}
}
