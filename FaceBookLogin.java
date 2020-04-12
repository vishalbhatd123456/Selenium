import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://facebook.com");
			driver.findElement(By.xpath("//input[@id= 'email' ]")).sendKeys("vishaldbhat@gmaail.com");
			driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@value = 'Log In']")).click();
			//driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("My own CSS");
	}

}
