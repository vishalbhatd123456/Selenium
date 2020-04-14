import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildRel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		//driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		driver.findElement(By.xpath("//input[@title = 'Search']")).sendKeys("Hello Google");
	}

}
