
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethods.driver;

public class LoginPage {

    @FindBy(id = "input-email")
    public WebElement usernameField;

    @FindBy(id = "input-password")
    public WebElement passwordField;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
}