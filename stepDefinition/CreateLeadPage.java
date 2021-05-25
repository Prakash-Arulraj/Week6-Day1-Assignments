package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CreateLeadPage extends BaseStep {
	
	@Then("Type Company Name (.*)$")
	public void enterCompanyName(String companyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	}

	@And("Type First Name (.*)$")
	public void enterFirstName(String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	}

	@And("Type Last Name (.*)$")
	public void enterLastName(String lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}

	@And("Click Create Lead")
	public void clickCreate() {
		driver.findElement(By.name("submitButton")).click();
	}

	

}
