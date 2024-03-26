package SIDGlobal.SeleniumAmoazonAssignment.Tests;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SIDGlobal.BaseTest.BaseTest;
import SIDGlobal.SeleniumAmoazonAssignment.Pageobjects.Searchpage;
import SIDGlobal.SeleniumAmoazonAssignment.Pageobjects.Searchresultpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class endtoendcheckout extends BaseTest {

	public static void main(String[] args) throws InterruptedException {
	String Itemnames = "Hamilton Beach 6-Speed Electric Hand Mixer with Snap-On Case, Beaters, Whisk, Black (62692)";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Searchpage searchpage = new Searchpage(driver);
		searchpage.gotoamazon();
		searchpage.searchitem("mixer electric handheld");
		Searchresultpage resultpage = new Searchresultpage(driver);
		List<WebElement> products= resultpage.getitemlist();
		resultpage.getitembyname(Itemnames);
		resultpage.addtoca();
		resultpage.gotocart();
    	 driver.close();
             

	}}


