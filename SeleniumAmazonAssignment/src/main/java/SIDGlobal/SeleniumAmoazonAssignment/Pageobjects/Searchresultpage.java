package SIDGlobal.SeleniumAmoazonAssignment.Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SIDGlobal.Abstarctcomponents.Abstarctcomponent;

public class Searchresultpage extends Abstarctcomponent {
	
	WebDriver driver;
	
	public Searchresultpage(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);		
		
	}
	
	@FindBy(css=".a-section.a-spacing-none.puis-padding-right-small.s-title-instructions-style")
	List<WebElement> products;
	
	By itemsby = By.cssSelector(".a-section.a-spacing-none.puis-padding-right-small.s-title-instructions-style");
	
	@FindBy(css="input#add-to-cart-button.a-button-input")
	WebElement addtocart;
	
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement gotocartpage;
	
	public List<WebElement> getitemlist() {
		
		waitforitemtoappear(itemsby);
		return products;
		
	}
	
	public WebElement getitembyname(String Itemnames) {
		
		 WebElement prod = products.stream().filter(product-> 
	        product.findElement(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"))
	        .getText().equals(Itemnames)).findFirst().orElse(null);       
		 return prod; 
		 	
		
	}
	
	public void addtocart(String Itemname) {
		
		WebElement prod= getitembyname(Itemname);
		prod.click();	
	}
	
	public void addtoca() {
		
		addtocart.click();
		
	}
	public void gotocart() {
		gotocartpage.click();
		
		
	}

}
