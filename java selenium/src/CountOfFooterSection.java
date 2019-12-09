import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountOfFooterSection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "F:\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://qaclickacademy.com/practice.php/ ");
		Thread.sleep(5000);
		
		//count of number of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		//count of number of links on the footer section on the page
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		//count the number links on the 1st coloumn in footer section
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		//click on each link in the coloumn check of the pages are opening
		for(int i=1; i<coloumndriver.findElements(By.tagName("a")).size(); i++)
		{
			//String clinkonlinkTab= Keys.chord(Keys.CONTROL , Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL , Keys.ENTER);
			Thread.sleep(5000);
		}
		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

	private static void iterator() {
		// TODO Auto-generated method stub
		
	}

	private static void getWindowHandles() {
		// TODO Auto-generated method stub
		
	}

}
