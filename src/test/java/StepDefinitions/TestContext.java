package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestContext {

    private WebDriver driver;
    private final String URL = "http://automationpractice.com/index.php";


    public TestContext() {
        }

        @Before
        public void initialiseMainElements() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexander\\Desktop\\FORTE\\ChromeDriver\\chromedriver.exe");
            this.driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
            driver.manage().window().maximize();
    }

        @After
        public void closing() {
            driver.close();
            driver.quit();
        }

        public WebDriver getDriver() {
            return this.driver;
        }
    }

