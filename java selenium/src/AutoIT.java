import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		 
			  System.setProperty("webdriver.gecko.driver", "F:\\workspace\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.seleniumhq.org/");
				Thread.sleep(5000);
				
		 driver.findElement(By.linkText("Download")).click();
		 driver.findElement(By.linkText("3.141.59")).click();
	
		 Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\Autoit.exe");
	}

}
