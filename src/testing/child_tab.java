package testing;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;



public class child_tab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		 
		
		Set<String> windowid = driver.getWindowHandles();
		for(String str:windowid)
		{
			driver.switchTo().window(str);
			
			if(driver.getTitle().equals("Tech Mahindra"))
			{ 			
			driver.manage().window().maximize();
		    System.out.println(driver.getTitle());
     		System.out.println(driver.getCurrentUrl());
     		Thread.sleep(1000);
			driver.close();
			}	
		}
		Thread.sleep(1000);

		Set<String> windowid1 = driver.getWindowHandles();
		for(String str1:windowid1)
		{			
			driver.switchTo().window(str1);
			
			if(driver.getTitle().equals("Sykes"))
			{ 			
			driver.manage().window().maximize();
		    System.out.println(driver.getTitle());
     		System.out.println(driver.getCurrentUrl());
     		Thread.sleep(1000);
			driver.close();
			}
			
		}
	
		Thread.sleep(1000);
		driver.quit();
		
				
		
	}

}
