import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.gecko.driver", "F:\\workspace\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/login/");
			
			Thread.sleep(5000);
			driver.findElement(By.id("email")).sendKeys("venkat.reddy780@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("");
			driver.findElement(By.id("loginbutton")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("._3ixn")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.id("userNavigationLabel")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.cssSelector("li._54ni:nth-child(8) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
			
			driver.findElement(By.xpath("/html/body/div[24]/div/div/div/div/div[1]/div/div/ul/li[7]/a/span/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div/ul/li[1]/a/span[1]/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("primary_first_name")).clear();
			driver.findElement(By.name("primary_first_name")).sendKeys("venkat");
			driver.findElement(By.id("//*[@id=\"u_19_0\"]")).click();
	}

}
