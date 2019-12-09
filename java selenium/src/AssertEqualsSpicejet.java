import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AssertEqualsSpicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "F:\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/ ");
		Thread.sleep(5000);
		
		//AssertFalse
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		//AssertTrue
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		
		
		//AssertEquals
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		int i;
		for(i=1;i<5;i++)
				{
					driver.findElement(By.xpath("//*[@id=\"hrefIncAdt\"]")).click();
				}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.cssSelector("#divpaxinfo")).getText(), "4 Adult");
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		
		
	}

}
