package SIDGlobal.Abstarctcomponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstarctcomponent {
	WebDriver driver;
	public Abstarctcomponent(WebDriver driver) {
	this.driver=driver;
	}

	public void waitforitemtoappear(By findBy)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}

}
