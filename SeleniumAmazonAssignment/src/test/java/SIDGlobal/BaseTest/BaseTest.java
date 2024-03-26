package SIDGlobal.BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SIDGlobal.SeleniumAmoazonAssignment.Pageobjects.Searchpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

		public WebDriver  initializedriver() throws IOException {
			
			Properties prop = new Properties();
			FileInputStream fis= new FileInputStream("/Volumes/KINGSTON/Program/Eclipse/ServBetterAutomation/src/main/java/ServBetterAutomation/Resource/Globaldata.properties");
			prop.load(fis);
			String Browsername= prop.getProperty("Browser");
			
			if (Browsername.equalsIgnoreCase("Chrome")) {
				
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			else if (Browsername.equalsIgnoreCase("Firefox")) {
				
				
			}
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;			
			
		}
	public void closeapplication() {

		
	}
	

	}


