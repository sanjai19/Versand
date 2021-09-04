package testing;

import org.openqa.selenium.WebDriver;

public class multidriver_caller {

	public static void test(WebDriver driver)  {
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	String ExpcetedTitle="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
	String actuallTitle = driver.getTitle();
	System.out.println("ExpcetedTitle :"+ExpcetedTitle);
	System.out.println("actuallTitle :"+actuallTitle);
	if(ExpcetedTitle.equals(actuallTitle))
	{
		System.out.println("Pass : Title verified");
	}
	else
	{
		System.out.println("Fail : Title Not verified");
	}
	
	String ExpcetedURL="https://www.myntra.com/";
	String actuallURL = driver.getCurrentUrl();
	System.out.println("ExpcetedURL :"+ExpcetedURL);
	System.out.println("actuallURL :"+actuallURL);
	if(ExpcetedURL.equals(actuallURL))
	{
		System.out.println("Pass : URL verified");
	}
	else
	{
		System.out.println("Fail : URL Not verified");
	}
	

	
		driver.quit();
}
}
