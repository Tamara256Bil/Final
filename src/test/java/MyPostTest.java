import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyPostTest {public class MyPostsTest extends AbstractTest {
    LoginPage loginPage;
    MyPostsPage myPostsPage;
    PostPage postPage;
    protected String username = "Bilinskaya" ;
    protected String password = "767e324e7c" ;

    @BeforeEach
    void init() {
        loginPage = new LoginPage(getWebDriver());
        myPostsPage = new MyPostsPage(getWebDriver());
        postPage = new PostPage(getWebDriver());
    }
    @Test
    @DisplayName(" Переход к следущей странице в ленте своих постов")
    public void test1() throws InterruptedException {
        loginPage.loginIn();
        myPostsPage.toNextPage();
        myPostsPage.checkToNextPage();
    }
    @Test
    @DisplayName(" Переход на предыдущую страницу ленты своих постов ")
    public void test2() throws InterruptedException {
        loginPage.loginIn();
        myPostsPage.moveToPreviousPage();
        myPostsPage.checkMoveToPreviousPage();
}
    @Test
    @DisplayName(" Сортировка постов от старых к новым и наоборот")
    public void test3() throws InterruptedException {
        loginPage.loginIn();
        myPostsPage.clickOrder();
        myPostsPage.checkOrderDESC();
        myPostsPage.clickOrderOn();
        myPostsPage.checkOrderASC();

    }
}}

