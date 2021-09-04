package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalenfield.com/in/en/app-login/");
		
		driver.findElement(By.className("input_field")).sendKeys("sanjaikumar815@gmail.com");
		//driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("password")).sendKeys("Abc123456");
		//driver.findElement(By.className("submit_login login-submit")).click();

		((RemoteWebDriver) driver).findElementByXPath("(//input[@class='submit_login login-submit'])[1]").click();
	     
		driver.findElement(By.id("Logout"));
		
		//Thread.sleep(1000);
		//driver.quit();

	}

}
