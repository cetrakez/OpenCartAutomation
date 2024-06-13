package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import static org.junit.Assert.assertTrue;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
    }

    @When("I enter username {string}")
    public void iEnterUsername(String username) {
        loginPage.enterUsername(username);
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