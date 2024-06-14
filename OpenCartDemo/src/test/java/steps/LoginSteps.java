package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static utils.PageInitializer.loginPage;


public class LoginSteps extends CommonMethods {

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() throws IOException {
        setUp();
    }

    @When("I enter username {string}")
    public void iEnterUsername(String username) throws IOException {
        loginPage.usernameField.sendKeys(ConfigReader.read("userName"));
        // loginPage.enterUsername();
        loginPage.passwordField.sendKeys(ConfigReader.read("password"));
        //loginPage.enterUsername(username);
    }

    @When("I enter password {string}")
    public void iEnterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click on the login button")
    public void iClickOnTheLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I should see the user dashboard")
    public void iShouldSeeTheUserDashboard() {
        assertTrue(loginPage.isDashboardVisible());
        driver.quit();  // Ensure to close the driver after the test
    }
}