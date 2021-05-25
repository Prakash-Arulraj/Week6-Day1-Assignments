package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends BaseStep {

	@Then("Verify Home Page")
	public void verifyHomePage() {
		WebElement findEle = driver.findElement(By.linkText("CRM/SFA"));
		System.out.println(findEle.isDisplayed());

	}

	@And("Click crmsfa Link")
	public void clickCrmLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	

}
