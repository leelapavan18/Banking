package Baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.BeforeTest;

public class BaseClass {

	 public WebDriver driver;

	@BeforeTest
	public void browserSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
	}

	public WebElement waitUntilElementLocated(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	public String getScreenshort(String Testscreenshot,WebDriver driver) throws IOException {
		TakesScreenshot Ts = (TakesScreenshot) driver;
		File Source = Ts.getScreenshotAs(OutputType.FILE);
		String ScreenShortPath = (System.getProperty("user.dir") + "/reports/" + Testscreenshot + ".png");
		File file = new File(ScreenShortPath);
		FileUtils.copyFile(Source, file);
		return ScreenShortPath;

	}

}
