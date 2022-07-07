package dev.prater;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTestDropdown {
	public static WebDriver wd40; 
	static String[] optionValues = {"az","za","lohi","hilo"};
	
	@BeforeAll
	public static void setup() 
	{
		File fFox = new File("src/test/resources/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", fFox.getAbsolutePath());
		wd40 = new FirefoxDriver();
		
		wd40.get("https://www.saucedemo.com");
		wd40.findElement(By.id("user-name")).sendKeys("standard_user");
		wd40.findElement(By.id("password")).sendKeys("secret_sauce");
		wd40.findElement(By.id("login-button")).click();
	}
	
//	@AfterAll
//	public static void teardown(){wd40.close();} //this causes errors for some reason
	
	@Test
	public void doesItSortAZ()
	{
		boolean failed = false;
		InventoryPOM iPOM = new InventoryPOM(wd40);
		List<String> nameList;
		Select sortDrop = iPOM.dropdownAsSelect();
		
		sortDrop.selectByValue("az");
		nameList = iPOM.getItemProperty("names");
		
		for (int i=0;i<nameList.size()-1;i++) 
		{
			if (nameList.get(i).compareTo(nameList.get(i+1))>0) 
			{
				failed = true;
			}
		}
		assertEquals(false, failed);
	}
	
	@Test
	public void doesItSortZA()
	{
		boolean failed = false;
		InventoryPOM iPOM = new InventoryPOM(wd40);
		List<String> nameList;
		Select sortDrop = iPOM.dropdownAsSelect();
		
		sortDrop.selectByValue("za");
		nameList = iPOM.getItemProperty("names");
		
		for (int i=0;i<nameList.size()-1;i++) 
		{
			if (nameList.get(i).compareTo(nameList.get(i+1))<0) 
			{
				failed = true;
			}
		}
		assertEquals(failed, false);
	}
	
	@Test
	public void doesItSortLOHI()
	{
		boolean failed = false;
		InventoryPOM iPOM = new InventoryPOM(wd40);
		List<String> priceList;
		Select sortDrop = iPOM.dropdownAsSelect();
		
		sortDrop.selectByValue("lohi");
		priceList = iPOM.getItemProperty("prices");
		
		double priceNums[] = new double[priceList.size()];
		
		for (int i=0;i<priceList.size();i++)
		{
			priceNums[i]=Double.parseDouble(priceList.get(i).replace("$", ""));
		}
		
		for (int i=0;i<priceList.size()-1;i++) 
		{
			if (priceNums[i]>priceNums[i+1]) 
			{
				failed = true;
			}
		}
		assertEquals(failed, false);
	}
	
	@Test
	public void doesItSortHILO()
	{
		boolean failed = false;
		InventoryPOM iPOM = new InventoryPOM(wd40);
		List<String> priceList;
		Select sortDrop = iPOM.dropdownAsSelect();
		
		sortDrop.selectByValue("hilo");
		priceList = iPOM.getItemProperty("prices");
		
		double priceNums[] = new double[priceList.size()];
		
		for (int i=0;i<priceList.size();i++)
		{
			priceNums[i]=Double.parseDouble(priceList.get(i).replace("$", ""));
		}
		
		for (int i=0;i<priceList.size()-1;i++) 
		{
			if (priceNums[i]<priceNums[i+1]) 
			{
				failed = true;
			}
		}
		assertEquals(failed, false);
	}
}

//https://github.com/220531-jwa/notes/blob/main/Selenium/selenium.md
//https://github.com/220531-jwa/demos/blob/main/SeleniumDemos/src/test/java/com/revature/actions/SeleniumActionsDemo.java