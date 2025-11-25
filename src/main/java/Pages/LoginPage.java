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

	public void login() {
		driver.findElement(Username).sendKeys("mngr646848");
		driver.findElement(Password).sendKeys("dUneduj");
		driver.findElement(LoginButton).click();
	}

}
