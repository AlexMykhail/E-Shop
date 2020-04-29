package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {

    private WebDriver driver;

    @FindBy(id = "total_price")
    public WebElement totalPrice;


    @FindBy(css = "#HOOK_PAYMENT > div:nth-child(2) > div > p > a")
    private WebElement payByCheck;

    @FindBy(css = "#cart_navigation > button")
    private WebElement confirm;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[1]")
    public WebElement successMessageDiv1;

    @FindBy(css = "#center_column > p.cart_navigation.exclusive > a")
    private WebElement backToOrders;


    public Payment(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setPayByCheck() {
        payByCheck.click();
    }

    public void setConfirm() {
        confirm.click();
    }

    public String getTotalPayment() {
       return totalPrice.getText();
    }

    public void setBackToOrders() {
        backToOrders.click();
    }

}
