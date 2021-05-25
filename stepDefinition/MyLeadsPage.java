package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyLeadsPage extends BaseStep {

	@When("Click Create Lead Button")
	public void clickCreateLeadButton() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("Click Find Leads Button")
	public void clickFindLeadButton() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@Then("Update Industry Button")
	public void Update() throws InterruptedException {
		WebElement industryEnumId = driver.findElement(By.id("updateLeadForm_industryEnumId"));
		Thread.sleep(2000);
		new Select(industryEnumId).selectByIndex(3);
	}

	@And("Click Update Button")
	public void clickUpdate() {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	}
	@When("Click Merge Lead Button")
	public void clickMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}

}
