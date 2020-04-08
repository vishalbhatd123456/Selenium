import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Index1 {
	public static void main(String[] args) {
		//create a driver object
		//this is specific to each and every browser
		// we will strictly implement the method of web driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//invoke chrome browser on the macj=hine
		//invoke .exe file first
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		//checkpoint to redirect to the correct website
		System.out.println(driver.getCurrentUrl());
		
		//get the page source 
		System.out.println(driver.getPageSource());
		
		
	}
}
