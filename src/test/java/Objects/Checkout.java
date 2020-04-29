package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Checkout {

    WebDriver driver;

    @FindBy(linkText = "Proceed to checkout")
    private WebElement proceed1;


    public Checkout (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setProceed1() {
        proceed1.click();
    }

   }