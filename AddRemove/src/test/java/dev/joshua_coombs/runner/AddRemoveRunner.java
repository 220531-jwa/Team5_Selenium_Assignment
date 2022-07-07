package dev.joshua_coombs.runner;

import java.io.File;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import dev.joshua_coombs.pages.ProductsPage;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"}, glue = {"dev.joshua_coombs.steps"})
public class AddRemoveRunner {
	public static WebDriver realHumanBeing;
	public static ProductsPage productsPage;
	
	@BeforeAll
	public static void setup() {
		File chrome = new File("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		
		realHumanBeing = new ChromeDriver(); 
		
		productsPage = new ProductsPage(realHumanBeing);
	}

	@AfterAll
	public static void teardown() {
		realHumanBeing.quit();
	}
}
