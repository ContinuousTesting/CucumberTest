package stepDefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
;

public class PetClinicTest {
public WebDriver driver;
	
	public PetClinicTest(){
		driver = Hooks.driver;
	}
	@When("^I click on the Veterinarians$")
	 public void i_open_petclinic_website_and_click_veteriranians() throws Throwable {
  
       driver.get("http://localhost:8080/petclinic/");
       WebElement element = driver.findElement(By.xpath("//li[3]/a/span[2]"));
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       element.click();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
   }
	 @Then("^I get the Title of the Page$")
	    public void i_get_the_title_of_the_page() throws Throwable {
	        
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 String actualTitle = driver.getTitle();
		 System.out.println("Title-"+actualTitle);
		 Assert.assertTrue(actualTitle.contains("PetClinic"));
	 }
}
