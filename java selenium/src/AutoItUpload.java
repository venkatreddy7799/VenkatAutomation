import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		 
			  System.setProperty("webdriver.gecko.driver", "F:\\workspace\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://imgbb.com/");
				Thread.sleep(5000);
				
		 driver.findElement(By.cssSelector("a.btn-big")).click();
		 Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\AutoitFileupload.exe");
		 
	}
	
}

