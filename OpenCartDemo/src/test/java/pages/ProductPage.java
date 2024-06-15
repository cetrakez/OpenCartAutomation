package pages;

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

    public ProductPage() {
        driver = driver;
        PageFactory.initElements(driver, this);
    }
    }
