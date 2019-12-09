import javax.print.attribute.standard.Sides;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class cricbuzz {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
int sum=0;
		System.setProperty("webdriver.gecko.driver", "F:\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("div[class='cb-col-100 cb-col cb-hm-scg-blk '] div[class='cb-col cb-col-25 cb-mtch-blk']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Scorecard")).click();
		Thread.sleep(5000);
		/*WebElement rows = driver.findElement(By.cssSelector("div[class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope'] div[class='cb-col cb-col-100 cb-scrd-itms']"));
		rows.findElements(By.cssSelector("[class='cb-col cb-col-8 text-right text-bold']")).size();
		System.out.println(rows.getText());*/
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));
		int row = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0 ; i<count-2 ; i++)
		{
			/*String coloumn = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			System.out.println(coloumn);*/
			
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			//int integervalue = Integer.parseInt(value);
			//sum = sum+integervalue;
		}
		String extras = driver.findElement(By.xpath("//div[text()='Extras']/folloing-sibilng::div")).getText();
		/*int extrasrvalue = Integer.parseInt(extras);
		int TotalSumValue = sum+extrasrvalue;
		System.out.println(TotalSumValue);
		
		String ActualTotalVAlue = driver.findElement(By.xpath("//div[text()='Total']/folloing-sibilng::div")).getText();
		System.out.println(ActualTotalVAlue);*/
		
		/*if(ActualTotalVAlue==TotalSumValue)
		{
		System.out.println("Count Matches");
		}
		else
		{
		System.out.println("count fails");
		}*/
	}

}
