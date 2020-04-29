package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {

    WebDriver driver;

    @FindBy(css="#cgv")
    private WebElement agree;

    @FindBy(name="processCarrier")
    private WebElement proceed4;



    public Shipping (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setAgree() {
        agree.click();
    }
    public void setProceed4() {
        proceed4.click();
    }

}
