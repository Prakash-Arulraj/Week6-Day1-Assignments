package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class DuplicateLeadPage extends BaseStep{
	@When("Click And Enter Mail (.*)$")
	public void enterMail(String mail) {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(mail);
	}
	@And("Click Update Duplicate Lead")
	public void updateMail() {
		driver.findElement(By.name("submitButton")).click();
	}

}
