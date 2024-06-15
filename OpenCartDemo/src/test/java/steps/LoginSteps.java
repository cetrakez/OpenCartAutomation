package steps;

import io.cucumber.java.en.*;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;

import static utils.PageInitializer.loginPage;

public class LoginSteps extends CommonMethods {

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() throws IOException {
        setUp();  // Initialize the driver and navigate to the URL
    }

    @When("I enter username")
    public void iEnterUsername() throws IOException, InterruptedException {
        loginPage.usernameField.sendKeys(ConfigReader.read("userName"));
        Thread.sleep(2000);
    }


    @When("I enter password")
    public void iEnterPassword() throws IOException, InterruptedException {
        loginPage.passwordField.sendKeys(ConfigReader.read("password"));
        Thread.sleep(2000);
    }

    @When("I click on the login button")
    public void iClickOnTheLoginButton() throws InterruptedException {
        click(loginPage.loginButton);
        Thread.sleep(2000);
    }

    @Then("I should see the user dashboard")
    public void iShouldSeeTheUserDashboard() {
        // Add an assertion to verify that the dashboard is visible
        driver.quit();  // Ensure the driver is closed after the test
    }
}