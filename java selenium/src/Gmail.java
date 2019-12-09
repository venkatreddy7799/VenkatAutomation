import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(5000);
		
		/*driver.findElement(By.id("identifierId")).sendKeys("tvenkat@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("ggkblhblh");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div.ck6P8:nth-child(1)")).getText());*/
		
		driver.findElement(By.id("identifierId")).sendKeys("tvenkatreddy007@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		
		
		
	}

}
