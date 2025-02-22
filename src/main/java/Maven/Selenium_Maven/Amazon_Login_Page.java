package Maven.Selenium_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_Page 
{
	WebDriver driver;
	
	@FindBy(name = "email")
	WebElement Mobileno;

	@FindBy(id = "continue")
	WebElement Continue_click;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement Signin;

	public void Mobileno() {

		Mobileno.sendKeys("9600850349");

	}

	public void Continue_click() {

		Continue_click.click();

	}

	public void password() {

																																	password.sendKeys("Amazon$24");
	}

	public void Signin() {

		Signin.click();
	}
	
	
	public Amazon_Login_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
}
