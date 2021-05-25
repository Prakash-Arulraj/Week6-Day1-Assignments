package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends BaseStep {
	@Then("Verify Create Lead")
	public void verifyCreate() {
		WebElement ele = driver.findElement(By.xpath("//div[text()[normalize-space()='View Lead']]"));
		System.out.println(ele.isDisplayed());
	}

	@And("Click Edit Button")
	public void clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@And("Click Duplicate Button")
	public void clickDuplicateButton() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
}
