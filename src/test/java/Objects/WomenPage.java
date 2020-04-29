package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.Random;


public class WomenPage {

    private WebDriver driver;
    private Random random;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")
    private WebElement women;

    private By cart = By.xpath("//*[@id='center_column']/ul/li");

    @FindBy(id="add_to_cart")
    private WebElement submit;


    public WomenPage (WebDriver driver) {
        this.driver = driver;
        random = new Random();
        PageFactory.initElements(driver, this);
    }


    public void addToCart() {

        List<WebElement> itemsList = driver.findElements((By) cart);
        int i = random.nextInt(itemsList.size() - 1) + 1;
        driver.findElement(By.xpath("//ul/li[" + i + "]/div/div[2]/h5/a")).click();

    }

    public void setWomen() {
        women.click();
    }

    public void setSubmitCart() {
        this.submit.click();
    }

}
