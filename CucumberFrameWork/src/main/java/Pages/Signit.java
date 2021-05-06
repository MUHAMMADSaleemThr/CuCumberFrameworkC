package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signit {
	WebDriver driver;
@FindBy(name="email") WebElement Emailfieldenter;
@FindBy(id="continue") WebElement continuebuttonclick;
@FindBy(xpath = "//label[contains(text(),'Email or mobile phone number')]") WebElement Confirmation;
@FindBy(name = "password") WebElement psswd;
@FindBy(id="signInSubmit") WebElement SignbuttoncliCk;
@FindBy(xpath="//label[contains(text(),'Password')]") WebElement Passwordtxconfirm;

public void psswdsendchar(String psswds) {
	psswd.sendKeys(psswds);
}
public void Sign() {
	SignbuttoncliCk.click();
}
public WebElement PasswordTxConfrmation() {
	return PasswordTxConfrmation();
}
public Signit(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void EmailFieldEnter(String Email) {
	Emailfieldenter.sendKeys(Email);
}
public void ContinueButtonClick() {
	continuebuttonclick.click();
}
public WebElement Confirmtiontxdisplays() {
	return Confirmation;
}
}
