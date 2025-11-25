package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;

	By Register = By.xpath("//div[@id='loginPanel']//a[text()='Register']");
	By FirstName = By.cssSelector("input[id='customer.firstName']");
	By LastName = By.cssSelector("input[id='customer.lastName']");
	By Address = By.cssSelector("input[id='customer.address.street']");
	By City = By.cssSelector("input[id='customer.address.city']");
	By State = By.cssSelector("input[id='customer.address.state']");
	By ZipCode = By.cssSelector("input[id='customer.address.zipCode']");
	By Phone = By.cssSelector("input[id='customer.phoneNumber']");
	By SSN = By.cssSelector("input[id='customer.ssn']");
	By Username = By.cssSelector("input[id='customer.username']");
	By Password = By.cssSelector("input[id='customer.password']");
	By Confirm = By.xpath("//input[@id='repeatedPassword']");
	By Submit = By.xpath("(//input[@type='submit'])[2]");

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void registerPage() {
		driver.findElement(Register).click();
		driver.findElement(FirstName).sendKeys("John");
		driver.findElement(LastName).sendKeys("Dob");
		driver.findElement(Address).sendKeys("123 Main Street");
		driver.findElement(City).sendKeys("Springfield");
		driver.findElement(State).sendKeys("CA");
		driver.findElement(ZipCode).sendKeys("90001");
		driver.findElement(Phone).sendKeys("9876543210");
		driver.findElement(SSN).sendKeys("123-45-6789");
		driver.findElement(Username).sendKeys("johndob123");
		driver.findElement(Password).sendKeys("Pass@123");
		driver.findElement(Confirm).sendKeys("Pass@123");
		driver.findElement(Submit).click();
	}
}
