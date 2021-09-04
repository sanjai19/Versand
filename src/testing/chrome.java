package testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://zerodha.com/");
		String expectedsourceText = "Invest in everything";
		String actualsource = driver.getPageSource();
		
		//title
		String Title = driver.getTitle();
		System.out.println(Title);
		String expectedTitle = "Online stock trading at lowest prices from India's biggest stock broker – Zerodha";
		
		if(Title.contains(expectedTitle))
		{
			System.out.println("Expected Title :"+Title);
			System.out.println("Pass: The Title which entred is present");	
		}
		else
		{
			System.out.println("Expected source Text :"+expectedsourceText);
			System.out.println("Fail: The Title which entred is Not present");
		}
		//url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//page source code
		if(actualsource.contains(expectedsourceText))
		{
			System.out.println("Expected source Text :"+expectedsourceText);
			System.out.println("Pass: The text which entred is present");
		}
		else
		{
			System.out.println("Expected source Text :"+expectedsourceText);
			System.out.println("Fail: The text which entred is Not present");
		}
		driver.close();
	}

}
