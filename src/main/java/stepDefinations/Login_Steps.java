package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_Steps {
    private WebDriver driver;

 @Before
    public void setup()
    {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver= new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Given(": OpenURL")

    public void Open_URL() throws InterruptedException {
        driver.get("http://coreprospects.silicontechnolabs.com");
        Thread.sleep(3000);
    }

    @When("I enter an Email address name: superadmin@coreprospect.com")
    public void i_enter_an_email_address_name_superadmin_coreprospect_com()
    {
        driver.findElement(By.id("email")).sendKeys("superadmin@coreprospect.com");

    }

    @And("I enter a Password : Core@{int}")
    public void i_enter_a_password_core(Integer int1) {
     driver.findElement(By.id("password")).sendKeys("Core@123");
    }

    @And("I click on the Login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("I should be presented with a successful contact us submission page.")
    public void i_should_be_presented_with_a_successful_contact_us_submission_page() {
        System.out.println("Logged In Successfully");
    }

    public void tearDown()
    {
        driver.quit();
    }
}
