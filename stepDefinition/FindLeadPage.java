package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FindLeadPage extends BaseStep {
	@And("Click And Type First Name Button (.*)$")
	public void typeFirstName(String firstname) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstname);
	}
	@And("Click And Type Last Name Button (.*)$")
	public void typeLastName(String lastname) {
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys(lastname);
	}
	@And("Click Submit Find Leads Button")
	public void clickSubmit() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
	}
	@Then("Click On First Match")
	public void clickFirstOne() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
	}
	

}
