package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

    WebDriver driver;


    @FindBy(className = "logout")
    private WebElement outBtn;


    public Logout (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void doLogout() {
        outBtn.click();
    }
}
