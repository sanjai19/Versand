package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class udemy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		
		driver.findElement(By.name("q")).sendKeys("aws");
		WebElement autosuggestion = driver.findElement(By.cssSelector("a[role='option']"));
		
		String ExpecetedText = "aws";
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
