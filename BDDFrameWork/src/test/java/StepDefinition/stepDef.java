package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDef {
	
	WebDriver driver;
	
	@Given("Open the browser")
	public void open_the_browser() {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Indumathy. B/Downloads/Selenium/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	    System.out.println("Open the Google Browser");
	    driver.get("https://www.facebook.com/");
	   }

	@When("Enter credentials <\"Username\"> and <\"Password\">")
	public void enter_credentials_username_and_password() {
		 driver.findElement(By.id("email")).sendKeys("indu933946@gmail.com");
		    driver.findElement(By.id("pass")).sendKeys("Allstate10!");
		    driver.findElement(By.id("u_0_b")).click();
		    if(driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).isDisplayed()) {
		    	System.out.println("Logged In Facebook");
		    }
		    else {
		    	System.out.println("Not logged");
		    }
		
	    System.out.println("Enter values");
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    System.out.println("Home page is displayed");
	}



}
