package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Actitime {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/ty/login.do");
		
		String ExcpectedToolTip = "Do not select if this computer is shared";
		String actualToolTip = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");

		
		
		if(actualToolTip != null)
		{
		if(actualToolTip.equals(ExcpectedToolTip))
		{
			System.out.println("Pass: Tool Tips display as we excpected = "+actualToolTip);
		}
		else
		{
			System.out.println("Fails: Tool Tips Not display as we excpected = "+actualToolTip);
		}
		}
		else
		{
			System.out.println("Fails: Tool Tips Not there = "+actualToolTip);
		}
		driver.quit();
		
	}

}
