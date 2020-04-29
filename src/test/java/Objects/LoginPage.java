package Objects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class LoginPage{

    private WebDriver driver;

        @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
        private WebElement signIn;

        @FindBy(id = "email")
        private WebElement email;

        @FindBy(id = "passwd")
        private WebElement password;

        @FindBy(xpath = "//button[@id='SubmitLogin']/span")
        private WebElement signInBtn;


        public LoginPage (WebDriver driver) {

            this.driver = driver;
            PageFactory.initElements(driver, this);
        }


        public void clickSignIn() {
            this.signIn.click();
        }

        public void timeout() {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        }

        public void setEmail (String email) {
            this.email.click();
            this.email.clear();
            this.email.sendKeys(email);
        }

        public void setPassword (String password) {
            this.password.clear();
            this.password.sendKeys(password);
        }

        public void setSignInBtn() {
            signInBtn.click();
        }

        public void doLogin(String email, String password) {

            timeout();
            setEmail(email);
            setPassword(password);
            setSignInBtn();
        }

    }




