import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostPage extends AbstractPage {
    public PostPage(WebDriver driver) {super(driver);
    }
    @FindBy(xpath = "//div[contains(@class,\"button-block\")]")
    private WebElement buttonsBlock;
}
