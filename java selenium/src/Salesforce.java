import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Salesforce {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.gecko.driver", "F:\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com/login/");
		Thread.sleep(5000);
		
		//won x-path
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
		                      //(or)
		//won css
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("hello");
		
		
		//won css
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("hiiii");
		                       //(or)
		//won xpath
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hiiii");
		
		
		//won regular expression x-path
		//driver.findElement(By.xpath("//input[contains(@id,'Logi')]")).click();
		                           //(or)
		//won regular expression css
		driver.findElement(By.cssSelector("input[id*='Logi']")).click();
		
	}

}
