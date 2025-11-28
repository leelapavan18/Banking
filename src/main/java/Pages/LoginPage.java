package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By Username=By.cssSelector("input[name='uid']");
	By Password=By.cssSelector("input[name='password']");
	By LoginButton= By.cssSelector("input[value='LOGIN']");
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public void login(String user ,String password) {
		driver.findElement(Username).sendKeys(user);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(LoginButton).click();
	}

}
