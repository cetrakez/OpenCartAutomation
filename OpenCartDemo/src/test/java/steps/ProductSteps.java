package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.io.IOException;

import static utils.PageInitializer.productPage;

public class ProductSteps extends CommonMethods {

    @Given("I am on the Home Page")
    public void i_am_on_the_home_page() throws IOException {
        setUp();
    }

    @When("I navigate to a product page")
    public void i_navigate_to_a_product_page() {
        click(productPage.macbookLink);

    }

    @Then("I should see the product name")
    public void i_should_see_the_product_name() throws InterruptedException {
        Thread.sleep(4000);
        String expectedProductName = "MacBook";
        String actualProductName = productPage.getProductName();
        Assert.assertEquals("Product name does not match", expectedProductName, actualProductName);
    }

    @Then("I should see the product price")
    public void i_should_see_the_product_price() {
        String expectedProductPrice = "$602.00";
        String actualProductPrice = productPage.getProductPrice();
        Assert.assertEquals("Product price does not match", expectedProductPrice, actualProductPrice);
    }

    @Then("I should see the product description")
    public void i_should_see_the_product_description() {
        String expectedProductDescription = "Description";
        String actualProductDescription = productPage.getProductDescription();
        Assert.assertTrue("Product description is not displayed", actualProductDescription.contains(expectedProductDescription));
    }

    @Then("I should see the product images")
    public void i_should_see_the_product_images() {
        Assert.assertTrue("Product images are not displayed", productPage.areProductImagesDisplayed());
    }

    @Given("I am on a product page")
    public void i_am_on_a_product_page() {
        click(productPage.macbookLink);
    }

    @When("I click on Add to Cart button")
    public void i_click_on_add_to_cart_button(){

    WebElement addToCartBtn = driver.findElement(By.xpath("//button[@id='button-cart']"));
        addToCartBtn.click();
    }

    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {
WebElement successMessage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue("Confirmation message is not displayed", successMessage.isDisplayed());
    }

    @And("the product should be added to the cart")
    public void the_product_should_be_added_to_the_cart() {
        WebElement cart = driver.findElement(By.xpath("//a[@title='Shopping Cart']"));
        cart.click();
    }

    @When("I click on Write a Review link")
    public void i_click_on_link() {
        WebElement writeReviewLink = driver.findElement(By.xpath("//a[text()='Write a review']"));
        writeReviewLink.click();
    }

    @When("I enter my name and my review")
    public void i_enter_my_name_and_my_review() {
        WebElement nameField = driver.findElement(By.id("input-name"));
        nameField.sendKeys("John Doe");

        WebElement reviewField = driver.findElement(By.id("input-text"));
        reviewField.sendKeys("This is a good product, I would buy it again!");
    }

    @When("I rate the product with a good rating")
    public void i_rate_the_product_with_a_good_rating() {
        WebElement goodRating = driver.findElement(By.xpath("//input[@name='rating' and @value='5']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", goodRating);
    }

    @When("I click on Continue button")
    public void i_click_on_continue_button() throws InterruptedException {
        WebElement continueButton = driver.findElement(By.xpath("//button[text()='Continue']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", continueButton);
        Thread.sleep(2000);
    }
    @Then("I should see a review submission confirmation message")
    public void i_should_see_a_review_submission_confirmation_message() {
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue("Review submission confirmation message is not displayed", successMessage.isDisplayed());
    }
}
