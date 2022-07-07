package dev.cross.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import dev.cross.pages.*;
import dev.cross.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInFeatureImp {
	
	public static WebDriver driver = TestRunner.driver;
	public static LogInPage loginPage = TestRunner.loginPage;

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		driver.get("https://www.saucedemo.com");
	}
	
	@When("the user types in their {string} and {string} and clicks login")
	public void the_user_types_in_creds_and_and_clicks_login(String uname, String pass) {
		loginPage.username.sendKeys(uname);
		loginPage.password.sendKeys(pass);
		loginPage.loginButton.click();
	}
	
	@When("the user types in locked out user credentials and clicks login")
	public void the_locked_user_types_in_creds_and_and_clicks_login() {
	    
		loginPage.username.sendKeys("locked_out_user");
		loginPage.password.sendKeys("secret_sauce");
		loginPage.loginButton.click();
	}
	
	@When("the user types in invalid user credentials and clicks login")
	public void the_invalid_user_types_in_creds_and_and_clicks_login() {
	    
		loginPage.username.sendKeys("username");
		loginPage.password.sendKeys("password");
		loginPage.loginButton.click();
	}
	
	@Then("the user should be on the home page")
	public void the_user_should_be_on_the_home_page() {
	   
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.urlContains("inventory"));
		
		assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
	}
	
	@Then("the user should recieve a locked out user error")
	public void the_user_should_recieve_a_locked_out_user_error() {
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]/h3"), 0));
		
		
		assertEquals(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]/h3")).getText(), 
				"Epic sadface: Sorry, this user has been locked out.");
		
	}
	
	@Then("the user should recieve an invalid credentials error")
	public void the_user_should_recieve_an_invalid_credentials_error() {
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]/h3"), 0));
		
		
		assertEquals(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]/h3")).getText(), 
				"Epic sadface: Username and password do not match any user in this service");
		
	}

}