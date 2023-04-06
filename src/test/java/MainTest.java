import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class MainTest extends AbstractTest {

    @Test
    void mainLoginTest(){
     // new  MainPage(getWebDriver()).goToAccountPage();
        new LoginPage(getWebDriver())
                .setUsername("Bilinskaya")
                .setPassword("767e324e7c")
                .loginIn();
        Assertions.assertTrue(getWebDriver().findElement(By.id("app")).isEnabled());

    }

    @Test
    void mainLogin345Test(){

      //  new MainPage(getWebDriver()).goToAccountPage();
        new LoginPage(getWebDriver())
                .setUsername("№345")
                .setPassword("27c1e5764e")
                .loginIn();

        Assertions.assertTrue(getWebDriver().findElement(By.id("app")).isEnabled());
    }
}


