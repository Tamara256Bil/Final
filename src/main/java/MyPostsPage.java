import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyPostsPage extends AbstractPage {

    public MyPostsPage(WebDriver driver) {super(driver);
    }
    @FindBy(xpath = "//span[@class='svelte-1rc85o5']")// Блок Home  в хедере
    private WebElement homeHeader;

    @FindBy(xpath = "//ul[@class='svelte-1rc85o5'")// Блок "About,Contacts,Hello"
    private WebElement blockInHerders;
    @FindBy(xpath = "//button[@id='SMUI-form-field-1']")// тумблер Not my Posts
    private WebElement switchButtonNotMyPosts;


    @FindBy(xpath = " //button[@id='SMUI-form-field-1'and @aria-checked='true']")// актиированный тумблер Not my Posts
    private WebElement switchButtonNotMyPostsON;

    @FindBy(xpath = "//div[@class='mdc-form-field']//button[@aria-pressed='true']")//Кнопка order - включена сортировка от старых к новым
    private WebElement buttonOrderOn;

    @FindBy(xpath = "//div[@class='mdc-form-field']//span[text ()= 'Order']/parent::label/preceding-sibling::button")// Кнопка order
    private WebElement buttonOrderOff;

    @FindBy(xpath = "//a[@href and text() = 'Next Page']")//next page
    private WebElement NextPage;

    @FindBy(xpath = "//a[@href and text() = 'Previous Page']")//Previous Page
    private WebElement PreviousPage;

    public void moveToPreviousPage() {
    }

    public void checkMoveToPreviousPage() {
    }

    public void toNextPage() {
    }

    public void checkToNextPage() {
    }

    public void clickOrder() {
    }

    public void checkOrderDESC() {
    }

    public void clickOrderOn() {
    }

    public void checkOrderASC() {
    }
}