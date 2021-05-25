package stepDefinition;

import org.openqa.selenium.Alert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MergeLeadAlertPage extends BaseStep {

	@Then("Switch To Alert Box")
	public void clickAccept() {
		//switch to alert box
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert: " + alert.getText());
		//accept the alert
		alert.accept();
	}
	@And("Close The Browser")
	public void closeBrowser() {
		driver.close();
	}

}
