package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ProductPage extends CommonMethods {


    @FindBy(css = "img[src='https://demo.opencart.com/image/cache/catalog/demo/macbook_1-200x200.jpg']")
    public WebElement macbookLink;

    @FindBy(xpath = "//h1[text()='MacBook']")
    public WebElement productName;

    @FindBy(css = "span.price-new")
    public WebElement productPrice;

    @FindBy(css = "a.nav-link.active[href='#tab-description'][data-bs-toggle='tab']")
    public WebElement descriptionTab;

    @FindBy(css = "img.img-thumbnail[title='MacBook'][alt='MacBook']")
    public WebElement productImage;

    public String getProductName() {
        return productName.getText();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public String getProductDescription() {
        return descriptionTab.getText();
    }

    public boolean areProductImagesDisplayed() {
        return productImage.isDisplayed();
    }

    @FindBy(xpath = "//button[@id='button-cart']")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement ATCSuccessMessage;

    public WebElement getATCSuccessMessage() {
        return ATCSuccessMessage;
    }
    @FindBy(xpath = "//a[@title='Shopping Cart']")
    public WebElement cart;

    @FindBy(xpath = "//a[text()='Write a review']")
    public WebElement writeReviewLink;

    @FindBy(id = "input-name")
    public WebElement nameField;

    @FindBy(id = "input-text")
    public WebElement reviewField;

    @FindBy(xpath = "//input[@name='rating' and @value='5']")
    public WebElement goodRating;

    public void rateProductWithGoodRating() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", goodRating);
    }

    @FindBy(xpath = "//button[text()='Continue']")
    public WebElement continueButton;

    public void clickContinueButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", continueButton);
    }

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement ReviewSuccessMessage;




    public ProductPage() {
        driver = driver;
        PageFactory.initElements(driver, this);
    }
    }
