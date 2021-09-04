package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.skcet.ac.in/");
		driver.findElement(By.linkText("College Brochure")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
