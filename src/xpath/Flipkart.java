package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
			
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		String ExcpectedText="Flipkart";
		String acutualText = driver.findElement(By.cssSelector("img[title='Flipkart']")).getAttribute("alt");
		
		if(acutualText !=null)
		{
			
			if(acutualText.equals(ExcpectedText))
			{
				System.out.println("Pass : ExcpectedText displayed ="+acutualText);
			}
			else
			{
				System.out.println("Fails : ExcpectedText not displayed ="+acutualText);
			}
					
		}
		else
		{
			System.out.println("Fails: ExcpectedText Not present"+acutualText);
		}
		
		driver.quit();
	}

}
