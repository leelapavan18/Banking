package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Baseclass.BaseClass;

public class NewAccount extends BaseClass {
	By listfind = By.xpath("//ul[@class='menusubnav']//li");
	By CustomerId = By.xpath("//input[@name='cusid']");
	By AccountType = By.xpath("//select[@name='selaccount'][1]");
	By Initialdeposit = By.cssSelector("input[name='inideposit']");
	By submitBtn = By.name("button2");
	By AccountID = By.xpath("//tbody/tr[4]");
	By Continue = By.xpath("//tbody/tr[11]/td[1]/a[text()='Continue']");
	// ID 178628


	public NewAccount(WebDriver driver) {
		this.driver=driver;
	}

	public void NewAccountBank() {
		List<WebElement> Lst = driver.findElements(listfind);
		for (int i = 0; i < Lst.size(); i++) {
			WebElement item = driver.findElements(listfind).get(i);
			System.out.println(item.getText());
			String test = item.getText().trim();
			if (test.equalsIgnoreCase("New Account")) {
				item.click();
				System.out.println("Clicked on New Account menu");

			} else {
				System.out.println("Item Not Found Please Cross Check");
			}
		}
	}

	public void Details() throws InterruptedException {
		driver.findElement(CustomerId).sendKeys("55930");
		WebElement accType = driver.findElement(AccountType);
		Select select = new Select(accType);
		select.selectByVisibleText("Savings");
		driver.findElement(Initialdeposit).sendKeys("5000");
		driver.findElement(submitBtn).click();
	}

	public void getAccountID() {
		waitUntilElementLocated(AccountID);
		String AID = driver.findElement(AccountID).getText();
		Assert.assertEquals(AID, AID);
		System.out.println(AID);
	}

	public void Nexttomove() {
		driver.findElement(Continue).click();
	}

}
