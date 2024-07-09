package scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumTest {

	@Test
	public void emiCalculation() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
		driver.manage().window().maximize();	
		driver.findElement(By.id("loanamount")).sendKeys("100000");
		driver.findElement(By.id("rate")).sendKeys("12");
		driver.findElement(By.id("pmonths")).sendKeys("60");
		driver.findElement(By.id("Button1")).click();
		Thread.sleep(4000);
		String actualEmi = driver.findElement(By.id("EMI")).getAttribute("value");
		System.out.println("Emi Per Month Is: "+actualEmi);
		driver.close();
	}

}
