package stepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class WindowHandlingMergeLead extends BaseStep {

	Set<String> allWindowHandles = driver.getWindowHandles();

	List<String> NextWindowHandles = new ArrayList<String>(allWindowHandles);

	@And("Window Handling to FromLead SubWindow")
	public void switchToSubWindow1() {
		System.out.println("WindowHandling: " + allWindowHandles.size());
		System.out.println(" ");

		// Switch to From Lead sub-window
		driver.switchTo().window(NextWindowHandles.get(1));

		System.out.println("Sub-Window(From Lead) Title: " + driver.getTitle());
		System.out.println("Sub-Window(From Lead) URL: " + driver.getCurrentUrl());
		System.out.println(" ");
	}

	@Then("To Lead Sub Window Again Comes To Parent Window")
	public void comesParentWindow() {
		// Comes Again Parent Window
		driver.switchTo().window(NextWindowHandles.get(0));
	}

	@And("Window Handling to ToLead SubWindow")
	public void switchToSubWindow2() {
		allWindowHandles = driver.getWindowHandles();
		System.out.println("WindowHandling: " + allWindowHandles.size());
		NextWindowHandles = new ArrayList<String>(allWindowHandles);
		System.out.println(" ");

		// Switch to To Lead sub-window
		driver.switchTo().window(NextWindowHandles.get(1));

		System.out.println("Sub-Window(From Lead) Title: " + driver.getTitle());
		System.out.println("Sub-Window(From Lead) URL: " + driver.getCurrentUrl());
		System.out.println(" ");
	}

	@And("Window Handling to ParentWindow")
	public void switchToParentWindow() throws InterruptedException {

		// Switch to Comes Again Parent Window
		driver.switchTo().window(NextWindowHandles.get(0));

		System.out.println("Parent-Window Title: " + driver.getTitle());
		System.out.println("Parent-Window URL: " + driver.getCurrentUrl());
		System.out.println(" ");
		Thread.sleep(1000);
	}

}
