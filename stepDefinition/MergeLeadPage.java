package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MergeLeadPage extends BaseStep {
	@Then("Click And Enter From Lead Icon")
	public void clickFromLead() {
		driver.findElement(By.xpath("//span[text()='From Lead']/following::img")).click();
	}
	@And("Click And Enter Search First Name (.*)$")
	public void searchFirstName(String firstname) {
		driver.findElement(By.name("firstName")).sendKeys(firstname);
	}
	@Then("Click From Lead Search Button")
	public void clickSearchFrom() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
	}
	@And("Click First One Match To From Lead")
	public void clickFromFirst() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		Thread.sleep(3000);
	}
	@Then("Click And Enter To Lead Icon")
	public void clickToLead() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='To Lead']/following::img")).click();
		Thread.sleep(3000);
	}
	@And("Type And Enter Search To Lead Second Name (.*)$")
	public void searchLastNameToLead(String secondname) {
		driver.findElement(By.name("lastName")).sendKeys(secondname);
	}
	@Then("Click Search For To Lead Button")
	public void clickSearchTo() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
	}
	@And("Click First One Match For To Lead")
	public void clickToFirst() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
	}
	@Then("Click And Submit Merge Lead Tab")
	public void clickMergeSubmit() {
		driver.findElement(By.linkText("Merge")).click();
	}

}
