import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseoverAmazon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "F:\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkvernac-21&ascsubtag=_k_EAIaIQobChMIteCvu_2z5AIV2YRwCh2UoAAvEAAYASAAEgI-jfD_BwE_k_&ext_vrnc=hi&gclid=EAIaIQobChMIteCvu_2z5AIV2YRwCh2UoAAvEAAYASAAEgI-jfD_BwE");
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		
		
		
		//AMAZON CODE
		/*Actions a = new Actions(driver);
		//mouseover
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		//search box text in HELLO
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		//Double click on HELLO
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//RightClick
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();*/
		
		
		
		
		//SICEJET CODE
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		
	}

}
