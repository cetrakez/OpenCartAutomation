
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;


public class LoginPage extends CommonMethods {

    @FindBy(id = "input-email")
    public WebElement usernameField;

    @FindBy(id = "input-password")
    public WebElement passwordField;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccount;

    @FindBy(css = "a.dropdown-item[href*='route=account/login']")
    public WebElement loginLink;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
}