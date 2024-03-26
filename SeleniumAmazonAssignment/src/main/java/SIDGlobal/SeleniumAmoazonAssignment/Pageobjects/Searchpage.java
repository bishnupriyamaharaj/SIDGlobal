package SIDGlobal.SeleniumAmoazonAssignment.Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SIDGlobal.Abstarctcomponents.Abstarctcomponent;

public class Searchpage extends Abstarctcomponent  {
	
	WebDriver driver;
	
	public Searchpage(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);		
		
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;

	public void searchitem(String itemname) {
		
		searchbox.sendKeys(itemname);
		searchbutton.click();
		
	}
	
	public void gotoamazon() {
		
		driver.get("https://www.amazon.com/");
	}

}
