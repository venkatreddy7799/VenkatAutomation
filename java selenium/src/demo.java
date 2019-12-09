import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.gecko.driver", "F:\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//gettite
		 System.out.println(driver.getTitle());
		
		//getpagesource
		//System.out.println(driver.getPageSource());
		
		//getcurrenturl
		//System.out.println(driver.getCurrentUrl());
		
	
		/*//navigate().to()
		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");
		//navigate().back()
		driver.navigate().back();
		//navigate().forward()
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		//navigate().refresh()
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());*/
		
		
	}

}
