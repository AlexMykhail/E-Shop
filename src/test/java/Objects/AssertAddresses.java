package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssertAddresses {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[2]")
    public WebElement deliveryAddressName1;
    //public String deliveryAddressName = deliveryAddressName1.getText();

    @FindBy(xpath = "//*[@id=\"address_invoice\"]/li[2]")
    public WebElement invoiceAddressName1;
    //public String invoiceAddressName = invoiceAddressName1.getText();

    @FindBy(xpath = "//*//*[@id=\"address_delivery\"]/li[3]")
    public WebElement deliveryAddressStreet1;
    //String deliveryAddressStreet = deliveryAddressStreet1.getText();

    @FindBy(xpath = "//*[@id=\"address_invoice\"]/li[3]")
    public WebElement invoiceAddressStreet1;
    //String invoiceAddressStreet = invoiceAddressStreet1.getText();

    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[4]")
    public WebElement deliveryAddressCity1;
  //  String deliveryAddressCity = deliveryAddressCity1.getText();

    @FindBy(xpath = "//*[@id=\"address_invoice\"]/li[4]")
    public WebElement invoiceAddressCity1;
  //  String invoiceAddressCity = invoiceAddressCity1.getText();

    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[5]")
    public WebElement deliveryAddress1;
   // String deliveryAddress = deliveryAddress1.getText();

    @FindBy(xpath = "//*[@id=\"address_invoice\"]/li[5]")
    public WebElement invoiceAddress1;
    //String invoiceAddress = invoiceAddress1.getText();

    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[6]")
    public WebElement deliveryPhone1;
    //String deliveryPhone = deliveryPhone1.getText();

    @FindBy(xpath = "//*[@id=\"address_invoice\"]/li[6]")
    public WebElement invoicePhone1;
    //String invoicePhone = invoicePhone1.getText();

    @FindBy(css="#center_column > form > p > button")
    public WebElement proceed3;



    public AssertAddresses(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setAddress() {
        proceed3.click();
    }
}
