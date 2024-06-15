package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

import java.io.IOException;

import static utils.PageInitializer.productPage;

public class ProductSteps extends CommonMethods {

    @Given("I am on the Home Page")
    public void i_am_on_the_home_page() throws IOException {
        setUp();
    }

    @When("I navigate to a product page")
    public void i_navigate_to_a_product_page()  {
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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on {string} button")
    public void i_click_on_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the product should be added to the cart")
    public void the_product_should_be_added_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on {string} link")
    public void i_click_on_link(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I enter a review title and review description")
    public void i_enter_a_review_title_and_review_description() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I rate the product with {int} stars")
    public void i_rate_the_product_with_stars(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see a review submission confirmation message")
    public void i_should_see_a_review_submission_confirmation_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I select a product option \\(if applicable)")
    public void i_select_a_product_option_if_applicable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see the product availability status")
    public void i_should_see_the_product_availability_status() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
