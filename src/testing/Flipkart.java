package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.skcet.ac.in/");
		
		driver.findElement(By.linkText("Google Class Attendance")).click();
		driver.findElement(By.xpath("//button[@text='ODD SEM']"));
				
		Thread.sleep(1000);
		
		driver.quit();
	}

}
