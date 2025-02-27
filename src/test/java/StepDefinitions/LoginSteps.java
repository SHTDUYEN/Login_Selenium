package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver = null;


    @Given("is On Login Page")
    public void userIsOnLoginPage() {
        System.out.println("login");
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 50, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.navigate().to( "https://demo.guru99.com/test/login.html");
    }

    @When("^user enter email address and password$")
    public void userEnterEmailAddressAndPassword() {
        driver.findElement(By.id("email")).sendKeys("mngr613962@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("ranYvUp");

    }

    @When("user click login")
    public void userClickLogin() {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("we can see homepage")
    public void weCanSeeHomePage() {
        driver.getPageSource().contains("Invalid email address or password");

        driver.close();
        driver.quit();
    }

}
