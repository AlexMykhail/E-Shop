package StepDefinitions;

import Objects.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LoginDefs {

    public WebDriver driver;
    final String URL = "http://automationpractice.com";
    private LoginPage loginPage;


    public LoginDefs(TestContext testContext) {
        this.driver = testContext.getDriver();
        this.loginPage = new LoginPage(driver);
    }


    @Given("^User clicks Sign in button$")
    public void userClicksButton() {
        this.driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.clickSignIn();
    }

    @And("^logins using credentials$")
    public void loginsUsingCredentials(DataTable table) {

        List<Map<String, String>> map = table.asMaps(String.class, String.class);
        Iterator varify = map.iterator();

        while (varify.hasNext()) {
            Map <String, String> map1 = (Map) varify.next();
            String email = map1.get("LOGIN_EMAIL");
            String password = map1.get("LOGIN_PASSWORD");
            this.loginPage.doLogin(email, password);
        }

    }
}


