import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffLog {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://rediff.com");
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("vishal");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("1234");
	}

}
