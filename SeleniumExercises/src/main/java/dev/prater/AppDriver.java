package dev.prater;

import dev.prater.InventoryPOM;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AppDriver {
	public static void main(String args[])
	{
		String[] optionValues = {"az","za","lohi","hilo"};
		WebDriver wd40;
		File fFox = new File("src/test/resources/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", fFox.getAbsolutePath());
		wd40 = new FirefoxDriver();
		
		wd40.get("https://www.saucedemo.com");
		wd40.findElement(By.id("user-name")).sendKeys("standard_user");
		wd40.findElement(By.id("password")).sendKeys("secret_sauce");
		wd40.findElement(By.id("login-button")).click();
		
		System.out.println(wd40.getCurrentUrl());
		
		InventoryPOM iPOM = new InventoryPOM(wd40);
		List<String> nameList = iPOM.getItemProperty("names");
		List<String> priceList = iPOM.getItemProperty("prices");
		
		System.out.println(nameList.toString());
		System.out.println(priceList.toString());
		
		List<WebElement> dropList = iPOM.sortDrop.findElements(By.xpath("//option"));
		Select dropSelect = iPOM.dropdownAsSelect();
		
		
		for (int i=0;i<dropList.size();i++)
		{
			dropSelect.selectByValue(optionValues[i]);
			
			nameList = iPOM.getItemProperty("names");
			priceList = iPOM.getItemProperty("prices");
			
			System.out.println(nameList.toString());
			System.out.println(priceList.toString());
		}
		
		wd40.close();
	}
}

//GIVEN user is logged in 
//WHEN user selects option from sorting dropdown 
//THEN elements should be in listed order 