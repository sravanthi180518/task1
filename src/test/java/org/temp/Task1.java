package org.temp;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Task1 {

	static WebDriver driver;
	@BeforeClass
	private void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRADYUN\\eclipse-workspace\\DailyActivity\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
/*@AfterClass
	private void quitBrowser() {
		driver.quit();
	}
*/
@Parameters({"User"})
@Test
private void testcase2(String s1) throws Throwable {
	driver.get("https://www.shopclues.com/");
	driver.manage().window().maximize();
	WebElement input = driver.findElement(By.id("autocomplete"));
	input.sendKeys(s1);
	driver.findElement(By.xpath("//a[.='Search']")).click();
	driver.findElement(By.xpath("//h2[.='Refurbished Apple iPhone 6 64 GB (6 Months Gadgetwood W']")).click();
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	Set<String> allids = driver.getWindowHandles();
	for (String a : allids) {
		if (!parent.equals(a)) {
			driver.switchTo().window(a);

		driver.findElement(By.id("add_cart")).click();
	}

}
}}