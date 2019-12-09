import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakemytriDropDowm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "F:\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/ ");
		Thread.sleep(5000);
		
		//From source
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/label")).click();
		WebElement source = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		source.click();
		Thread.sleep(5000);
		source.sendKeys("mum");
		Thread.sleep(5000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		
		//TO destination
		
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		destination.click();
		Thread.sleep(5000);
		destination.sendKeys("che");
		Thread.sleep(5000);
		
		for(int i=1;i<5;i++)
		{
		destination.sendKeys(Keys.ARROW_DOWN);
		}
		destination.sendKeys(Keys.ENTER);
		
		
		
	}

}
