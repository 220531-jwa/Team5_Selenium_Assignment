package dev.joshua_coombs.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import dev.joshua_coombs.pages.ProductsPage;
import dev.joshua_coombs.runner.AddRemoveRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddRemoveSteps {
	public static WebDriver realHumanBeing = AddRemoveRunner.realHumanBeing;
	public static ProductsPage productsPage = AddRemoveRunner.productsPage;
	
	
}
