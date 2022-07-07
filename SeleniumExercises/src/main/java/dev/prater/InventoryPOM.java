package dev.prater;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPOM {
	  WebDriver driver;

	  @FindBy(className = "inventory_item")
	  private List<WebElement> items;
	  
	  @FindBy(className = "product_sort_container")
	  public WebElement sortDrop;

	  public InventoryPOM(WebDriver dr) {
	    this.driver = dr;
	    PageFactory.initElements(dr, this);
	  }

	  public List<String> getItemProperty(String a)
	  {
		  List<String> output = new ArrayList<>();
		  String xPath = "";
		  
		  if (a.equals("names")) {xPath = "inventory_item_name";}
		  else if (a.equals("prices")) {xPath = "inventory_item_price";}
		  
		  for (int i=0;i<items.size();i++) {output.add(items.get(i).findElement(By.className(xPath)).getText());}
		  
		  return output;
	  }
	  
	  public Select dropdownAsSelect() {return new Select(sortDrop);}
}
