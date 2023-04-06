import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AbstractTest {

        static WebDriver webDriver;

        @BeforeAll
        static void setDriver(){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            //options.addArguments("--headless");
            options.addArguments("start-maximized");
            options.setPageLoadTimeout(Duration.ofSeconds(10));
            options.addArguments(("--remote-allow-origins=*"));


            webDriver = new ChromeDriver(options);
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }

        @BeforeEach
        void MainPage(){
            Assertions.assertDoesNotThrow( ()-> getWebDriver().navigate().to("https://test-stand.gb.ru/"),
                    "Страница не доступна");
            Assertions.assertTrue(true);

        }

        public WebDriver getWebDriver(){
            return this.webDriver;
        }
}
