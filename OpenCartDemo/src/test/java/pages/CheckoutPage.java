package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;

    @FindBy(id = "input-payment-firstname")
    private WebElement billingFirstName;

    @FindBy(id = "button-confirm")
    private WebElement confirmOrderButton;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterBillingDetails(String firstName) {
        billingFirstName.sendKeys(firstName);
    }

    public void clickConfirmOrder() {
        confirmOrderButton.click();
    }
}