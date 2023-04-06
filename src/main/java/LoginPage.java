import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends AbstractPage {

    @FindBy(xpath= "//span[contains(text(),'Username')]")
private WebElement username;

    @FindBy(xpath = "//span[contains(text(),'Password')]")
    private WebElement password;


    @FindBy(xpath = "///button/span[text()='Login']")
    private WebElement submit;


    public LoginPage (WebDriver driver){
        super(driver);

    }

    public LoginPage setUsername(String username){
    return this;
}

    public LoginPage setPassword(String password){
        return this;
    }

    public void loginIn(){
        new WebDriverWait(getDriver(),Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://test-stand.gb.ru/"));
    }


}
