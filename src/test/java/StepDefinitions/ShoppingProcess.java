package StepDefinitions;

import Objects.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ShoppingProcess {

    private WebDriver driver;

    private Checkout checkout;
    private WomenPage womenPage;
    private Payment payment;
    private CartSummary cartSummary;
    private AssertAddresses assertAddresses;
    private Shipping shipping;
    private OrderHistory orderHistory;
    public String totalPayment;
    public String PriceAssertion;


    public ShoppingProcess(TestContext testContext) {
        this.driver = testContext.getDriver();
        this.checkout = new Checkout(this.driver);
        this.womenPage = new WomenPage(this.driver);
        this.assertAddresses = new AssertAddresses(this.driver);
        this.shipping = new Shipping(this.driver);
        this.payment = new Payment(this.driver);
        this.orderHistory = new OrderHistory(this.driver);
        this.cartSummary = new CartSummary(this.driver);
    }

    @When("^User clicks women category button$")
    public void userClicksWomenCategoryButton() {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        this.womenPage.setWomen();
    }

    @And("^randomly chooses product$")
    public void randomlyChoosesProduct() {
        this.womenPage.addToCart();
    }

    @And("^clicks Proceed to checkout button$")
    public void clicksProceedToCheckoutButton() {
       this.womenPage.setSubmitCart();
    }

    @And("^clicks Proceed to checkout button to Address Page$")
    public void clicksProceedToCheckoutButtonToAddressPage() {
        this.checkout.setProceed1();
    }

    @And("^clicks Proceed to checkout button to Shipping Page after Address Assertion$")
    public void clicksProceedToCheckoutButtonToShippingPage()  {

        this.cartSummary.setProceed2();

        Assert.assertEquals(this.assertAddresses.deliveryAddressName1.getText(),this.assertAddresses.invoiceAddressName1.getText());
        Assert.assertEquals(this.assertAddresses.deliveryAddressStreet1.getText(),this.assertAddresses.invoiceAddressStreet1.getText());
        Assert.assertEquals(this.assertAddresses.deliveryAddressCity1.getText(), this.assertAddresses.invoiceAddressCity1.getText());
        Assert.assertEquals(this.assertAddresses.deliveryAddress1.getText(), this.assertAddresses.invoiceAddress1.getText());
        Assert.assertEquals(this.assertAddresses.deliveryPhone1.getText(), this.assertAddresses.invoicePhone1.getText());

        this.assertAddresses.setAddress();
    }

    @And("^submits agreement, Proceed to checkout button to to Payment Page$")
    public void submitsAgreementProceedToCheckoutButtonToToPaymentPage() {
        this.shipping.setAgree();
        this.shipping.setProceed4();
    }

    @And("^clicks Pay By Check button$")
    public void clicksPayByCheckButton()  {
        payment.setPayByCheck();;
    }

    @And("^clicks I confirm my order button$")
    public void clicksIConfirmMyOrderButton() {
        this.payment.setConfirm();
    }

    @Then("^gets success message \"Your order on My Store is complete.\"$")
    public void getsSuccessMessage() {
        String successMessageDiv = payment.successMessageDiv1.getText();
        Assert.assertEquals(successMessageDiv, "Your order on My Store is complete.");
    }

    @And("^clicks Back to orders$")
    public void clicksBackToOrders() {
        this.payment.setBackToOrders();
    }

    @When("^verifies order price is correct$")
    public void verifiesOrderPriceIsCorrect() {
        Assert.assertEquals(PriceAssertion, totalPayment);
    }

    @Then("^clicks Back to your account$")
    public void clicksBackToYourAccount() {
        this.orderHistory.setBackToAccount();
    }
}


