package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "input-email")
    public WebElement usernameField;

    @FindBy(id = "input-password")
    public WebElement passwordField;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButton;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public boolean isDashboardVisible() {
        return driver.getTitle().contains("My Account");
    }
}