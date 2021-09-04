package xpath;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.upstox.com/");
		driver.findElement(By.id("userCode")).sendKeys("EX1555");
		driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("Sangavi@123");
		driver.findElement(By.id("submit-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='yob']")).sendKeys("1994");
		
		driver.switchTo().alert().accept();
				
		Robot robot = new Robot();
		robot.mouseMove(700, 550);
		Thread.sleep(5000);
		robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
		
		driver.findElement(By.xpath("//span[text()='karamadai s.']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("logout")).click();
	}

}
