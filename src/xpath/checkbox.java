package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/ty/login.do");
		
		WebElement actualCheckBox = driver.findElement(By.cssSelector("input[type='checkbox']"));

		if(!actualCheckBox.isSelected()) 
		{
			System.out.println("Pass:: The CheckBox is not selected");
		}
		else
		{
			System.out.println("Fail:: The CheckBox is  selected");
		}
		
		actualCheckBox.click();
		Thread.sleep(3000);
		if(actualCheckBox.isSelected()) 
		{
			System.out.println("Pass:: The CheckBox is not selected");
		}
		else
		{
			System.out.println("Fail:: The CheckBox is  selected");
		}
		driver.quit();
	}

}
