package testing;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class skillrally1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		// before
		WebElement searchbox = driver.findElementByName("q");
		Point loc = searchbox.getLocation();
		System.out.println("Co-ordinate Before minimize Browser :"+loc);
		Dimension dia = searchbox.getSize();
		System.out.println("Dimension Before minimize Browser :"+dia);
		driver.manage().window().setSize(new Dimension(300,600));
		// after 
		Point loc1 = searchbox.getLocation();
		System.out.println("Co-ordinate After minimize Browser :"+loc1);
		Dimension dia1 = searchbox.getSize();
		System.out.println("Dimension After minimize Browser :"+dia1);
		driver.quit();
	}
	
}
