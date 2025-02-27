import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SectionLoginTestCase {
    WebDriver driver;
    @BeforeTest
    public void init() {
        ChromeOptions options = new ChromeOptions();
//         Add the allowed-ips argument
        options.addArguments("--allowed-ips=217.174.153.53");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("https://demo.guru99.com/");
    }

    @AfterTest
    public void TC_001() {

    }

    @Test
    public void TearDown() {
        driver.quit();
    }
}
