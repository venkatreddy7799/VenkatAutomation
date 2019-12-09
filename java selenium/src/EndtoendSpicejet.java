import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EndtoendSpicejet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "F:\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/ ");
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//From
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//To
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		                //(or)
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DHM']")).click();
		
		//Date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		//passengers
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		int i;
		for(i=1;i<5;i++)
				{
					driver.findElement(By.xpath("//*[@id=\"hrefIncAdt\"]")).click();
				}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		
		//Currency
		Select s = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		
		//Select seniorcitizen checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		//search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
	}

}
