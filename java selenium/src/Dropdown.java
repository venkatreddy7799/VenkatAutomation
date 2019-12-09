import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.gecko.driver", "F:\\workspace\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.spicejet.com/ ");
	Thread.sleep(5000);
	
		// ault tab 
	driver.findElement(By.cssSelector("#divpaxinfo")).click();
	
	/*
	for(int i=1;i<5;i++)
			{
				driver.findElement(By.xpath("//*[@id=\"hrefIncAdt\"]")).click();
			}*/
	
                               //(or)	
	int i=1;
	while(i<5)
	{
		
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
	
	/*//currency
	Select s = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
	s.selectByValue("AED");
	s.selectByVisibleText("USD");*/
	
	
	}

}
