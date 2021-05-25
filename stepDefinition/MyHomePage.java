package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyHomePage extends BaseStep {
	
	@Then("Click Lead Button")
	public void clickLeadButton() {
		driver.findElement(By.linkText("Leads")).click();
	}

	

}
