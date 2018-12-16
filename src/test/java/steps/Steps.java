package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	
	@Given("^I am able to access google search page$")
	public void i_am_able_to_access_google_search_page() {
		
		driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.get("http://google.com");
	}

	@When("^I type the keyword as \"([^\"]*)\"$")
	public void i_type_the_keyword_as(String arg1)  {
		
		driver.findElement(By.name("q")).sendKeys(arg1);
	
	}

	@When("^I choose the first suggestion$")
	public void i_choose_the_first_suggestion()  {
		driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
	}

	@When("^I click on the first result$")
	public void i_click_on_the_first_result()  {
		driver.findElement(By.tagName("h3")).click();
	}

	@Then("^I should have \"([^\"]*)\" as title$")
	public void i_should_have_as_title(String arg1) {
		Assert.assertTrue(driver.getTitle().toLowerCase().contains(arg1));
		driver.quit();
	}
}
