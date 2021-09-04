package screenshot;

import java.io.File;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t1 {

	public static void main(String[] args) throws Throwable {

		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		
		Thread.sleep(3000);
		WebElement expectedstop = driver.findElement(By.cssSelector("img[alt='LIC Policy Corornavirus']"));
		WebElement acutalstop = driver.findElement(By.cssSelector("img[alt='LIC Policy Corornavirus']"));
		
		if(acutalstop.equals(expectedstop))
		{
			driver.findElement(By.cssSelector("a[title='Stop']")).click();
		}
		else
		{
			driver.findElement(By.cssSelector("a[title='Play']")).click();
		}
		
		driver.findElement(By.cssSelector("a[title='Stop']"));
		File tempfile=driver.findElement(By.id("slides")).getScreenshotAs(OutputType.FILE);

		File perfile = new File("./errorshot/LIC"+timestamp+".png");
		FileUtils.copyFile(tempfile, perfile);
		
		driver.quit();
	}

}
