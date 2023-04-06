import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractPage {
    private WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'Username')]")
    private WebElement username;

    @FindBy(xpath = "//span[contains(text(),'Password')]")
    private WebElement password;


    @FindBy(xpath = "///button/span[text()='Login']")
    private WebElement submit;

    public AbstractPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    protected WebDriver getDriver(){
        return this.driver;
    }
}
