package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CartSummary {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(linkText="Proceed to checkout")
    private WebElement proceed2;

    public CartSummary (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        PageFactory.initElements(driver, this);
    }

    public void setProceed2() {
        proceed2.click();
    }
}

