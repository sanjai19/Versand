package testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://licindia.in/");
		
		//Verify the title & url
		
		String Title = driver.getTitle();
		String expectedTitle = "Life Insurance Corporation of India - Home";
		
		
		if(Title.contains(expectedTitle))
		{
			System.out.println("Expected Title :"+expectedTitle);
			System.out.println("Actual Title :"+Title);
			System.out.println("Pass : Title verified");
		}
		else
		{
			System.out.println("Expected Title :"+expectedTitle);
			System.out.println("Fail : Title Not verified");
		}
		System.out.println("=======================================================================");
		
		String url = driver.getCurrentUrl();
		String expectedurl = "https://licindia.in/";
		
		if(url.contains(expectedurl))
		{
			System.out.println("Expected URL :"+expectedurl);
			System.out.println("Actual URL :"+url);
			System.out.println("Pass: The URL which  is present");
		}
		else
		{
			System.out.println("Expected source Text :"+expectedurl);
			System.out.println("Actual URL :"+url);
			System.out.println("Fail: The URL which  is Not present");
		}
		System.out.println("=================================================================");
		//navigate
		driver.navigate().to("https://licindia.in/Products/Insurance-Plan");
		String expectedurl1 = "https://licindia.in/Products/Insurance-Plan";
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		if(url1.contains(expectedurl1))
		{
			System.out.println("Expected URL :"+expectedurl1);
			System.out.println("Actual URL :"+url);
			System.out.println("Pass: The URL which  is present");
		}
		else
		{
			System.out.println("Expected source Text :"+expectedurl1);
			System.out.println("Actual URL :"+url1);
			System.out.println("Fail: The URL which  is Not present");
		}
		System.out.println("======================================================================");
		//Back
		driver.navigate().back();
		String expectedurl2 = "https://licindia.in/";
		String url2 = driver.getCurrentUrl();
		if(url2.contains(expectedurl2))
		{
			System.out.println("Expected URL :"+expectedurl2);
			System.out.println("Actual URL :"+url2);
			System.out.println("Pass: The URL which  is present");
		}
		else
		{
			System.out.println("Expected source Text :"+expectedurl2);
			System.out.println("Actual URL :"+url2);
			System.out.println("Fail: The URL which  is Not present");
		}
		System.out.println("=============================================================================");
		//Forward
		driver.navigate().forward();
		String expectedurl3 = "https://licindia.in/Products/Insurance-Plan";
		String url3 = driver.getCurrentUrl();
		if(url3.contains(expectedurl3))
		{
			System.out.println("Expected URL :"+expectedurl3);
			System.out.println("Actual URL :"+url3);
			System.out.println("Pass: The URL which  is present");
		}
		else
		{
			System.out.println("Expected source Text :"+expectedurl3);
			System.out.println("Actual URL :"+url3);
			System.out.println("Fail: The URL which  is Not present");
		}
		driver.quit();

	}

}
