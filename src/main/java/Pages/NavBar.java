package Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBar {

    WebDriver driver;

    public NavBar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   
    @FindBy(xpath = "//a[text()='Bank Project']")
    WebElement bankProjectMenu;

    
    @FindBy(xpath = "//ul[@class='dropdown-menu']/li/a")
    List<WebElement> projectVersions;

    public void openBankProjectV2() {

       
        bankProjectMenu.click();

       
        for (WebElement item : projectVersions) {
            System.out.println("Found Menu: " + item.getText());

            if (item.getText().equalsIgnoreCase("Bank Project V2")) {
                item.click();
                System.out.println("Clicked Bank Project V2");
                break;
            }
        }
    }
}
