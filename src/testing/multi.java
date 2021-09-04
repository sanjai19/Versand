package testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class multi {

	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");

		
		multidriver_caller.test(new ChromeDriver());
		Thread.sleep(1000);
		multidriver_caller.test(new FirefoxDriver());
		Thread.sleep(1000);
		multidriver_caller.test(new OperaDriver());

	}

	
}

