import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends AbstractPage {

    @FindBy(xpath = "//span[contains(text(),'Username')]")
    private WebElement username;

    @FindBy(xpath = "//span[contains(text(),'Password')]")
    private WebElement password;


    @FindBy(xpath = "///button/span[text()='Login']")
    private WebElement submit;

    public MainPage(WebDriver driver) {
        super(driver);
    }
    public void goToAccountPage(){
       // username.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(20))
                .until(ExpectedConditions.urlContains("https://test-stand.gb.ru/"));
    }

    public MainPage clicksubmit() {
        submit.click();
        return this;
    }

    public MainPage clicksusername(String s){
        username.click();
        return this;
    }

    public void clickpasswprd(String s) {
        password.click();
        this.submit.click();
    }


}