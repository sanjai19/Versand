package testing;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class skillrally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Dimension currentdia = driver.manage().window().getSize();
		int height = currentdia.getHeight();
		int width = currentdia.getWidth();
		System.out.println("Height :" + height);
		System.out.println("Width :"+width);
		Point currentpoint = driver.manage().window().getPosition();
		int x = currentpoint.getX();
		int y = currentpoint.getY();
		System.out.println("From x :" + x);
		System.out.println("from y :"+y);
		
		//element
		
		  WebElement searchbox =
		  driver.findElementByXPath("(//input[@type='search'])[1]"); Point loc =
		  searchbox.getLocation(); int locx = loc.getX(); int locy = loc.getY();
		  Dimension locsize = searchbox.getSize();
		 
		  System.out.println("x cord : "+locx+" y cord : "+locy);
		  System.out.println(locsize);
	
		
//		WebElement searchboxname = driver.findElementByName("q");
//		Point loc = searchboxname.getLocation();
//		System.out.println(loc);
//		driver.quit();
	}

}
