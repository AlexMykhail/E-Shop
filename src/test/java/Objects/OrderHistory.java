package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderHistory extends Payment {

    WebDriver driver;


    @FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(2) > a")
    public WebElement backToAccount;

    @FindBy(id = "order-list")
    private WebElement orderTable;

    @FindBy(className="history_price")
    public WebElement orderPrice;

    @FindBy(css = "#order-list > tbody > tr.first_item > td.history_price")
    private WebElement lastOrder;




    public OrderHistory (WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setBackToAccount() {

        backToAccount.click();
    }

    public String PriceAssertion() {
        List <WebElement> orderRows = orderTable.findElements(By.tagName("tr"));
        System.out.println(orderRows.size()-1);
        return lastOrder.getText();
    }
}

