package xpath;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://licindia.in/");
		String parentwindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//b[text()='SSS PA Portal']")).click();
		String ExcepetedAlertText = "This link will take you to an external site?";
		String AcutalAlertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		if(AcutalAlertText.equals(ExcepetedAlertText))
		{
			System.out.println("PASS:: Alert Text is correct");
		}
		else
		{
			System.out.println("FAIL:: Alert Text is Incorrect");
		}
		List<String>allwindowList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allwindowList.get(1));
		String ExcepetedURL = "https://merchant.licindia.in/LICMerchant/Login/begin.do";
		String AcutalURL = driver.getCurrentUrl();
		System.out.println(AcutalURL);
		
		if(AcutalURL.equals(ExcepetedURL))
		{
			System.out.println("PASS:: URL is correct");
		}
		else
		{
			System.out.println("FAIL:: URL is Incorrect");
		}
		Thread.sleep(5000);
		
		driver.switchTo().window(parentwindowId);

		driver.quit();
	}

}
