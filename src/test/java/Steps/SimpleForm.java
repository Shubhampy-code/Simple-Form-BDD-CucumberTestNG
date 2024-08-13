package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleForm {
	
	WebDriver driver;
	
	@Given("Open browser, Enter the URL")
	public void open_browser_enter_the_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/simple-form?");
	}

	@When("Enter the details in form")
	public void enter_the_details_in_form() {
		driver.findElement(By.cssSelector("[placeholder=\"First Name\"]")).sendKeys("Shubham");
		driver.findElement(By.cssSelector("[placeholder=\"Last Name\"]")).sendKeys("Shrivastava");
		driver.findElement(By.cssSelector("[placeholder=\"abc@xyz.com\"]")).sendKeys("shubham123@gmail.com");
		driver.findElement(By.cssSelector("[placeholder=\"9876543210\"]")).sendKeys("9450067694");

	}

	@When("Enter the message")
	public void enter_the_message() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//textarea[@rows=\"2\"]")).sendKeys("Hi This is shubham Shrivastava");
	}

	@Then("Click on the submit")
	public void click_on_the_submit() {
		driver.findElement(By.cssSelector("[onclick=\"simpleFormSubmit()\"]")).click();
		driver.quit();
	}

}
