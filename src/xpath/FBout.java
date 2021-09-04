package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FBout {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("kpsanju12@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Sanjai@1994");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();

		driver.findElement(By.cssSelector("div[aria-label='Account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
