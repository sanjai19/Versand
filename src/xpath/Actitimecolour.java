package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.Color;

public class Actitimecolour {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/ty/login.do");
		
		Thread.sleep(3000);
		String ExcpetedHexaCode = "#ce0100";
		String acutalRGB = driver.findElement(By.id("errorSpan")).getCssValue("color");
		
		
		if(!acutalRGB.isEmpty())
		{
		String acutalHexaCode= Color.fromString(acutalRGB).asHex();
		System.out.println("AcutalHexaCode="+acutalHexaCode);
		System.out.println("ExcpetedHexaCode="+ExcpetedHexaCode);
		
		if(acutalHexaCode.equals(ExcpetedHexaCode))
		{
			System.out.println("Pass: HexaCode colour display as we excpected = "+acutalRGB);
		}
		else
		{
			System.out.println("Fails: HexaCode colour Not display as we excpected = "+acutalRGB);
		}
		}
		else
		{
			System.out.println("Fails: HexaCode colour Not there = "+acutalRGB);
		}
		
		driver.quit();
	}

}
