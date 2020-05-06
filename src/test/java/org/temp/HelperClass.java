package org.temp;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HelperClass {


		public static WebDriver driver;

		public static void launchBrowser() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\PRADYUN\\eclipse-workspace\\DailyActivity\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		public static void loadUrl(String url) {
			driver.get(url);
		}
		public static void Title() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		public static void click(WebElement c) {
			c.click();
		}
		public static void sendkeys(WebElement e, String s) {
			e.sendKeys(s);
		}
		public static void insert(WebElement ins, String s) {
			ins.sendKeys(s);
		}
		public static void getAttribute(WebElement e, String s) {
			e.sendKeys(s);
			System.out.println(s);
		}
		public static void dropDown(WebElement e, int index) {
			Select s = new Select(e);
			s.selectByIndex(index);
		}
		public static String getDataFromExcel(String sheetname, int rowNo, int cellNo) throws Throwable {

			File f = new File("C:\\Users\\PRADYUN\\eclipse-workspace\\DailyActivity\\Excel\\Book1.xlsx");
			FileInputStream stream = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(stream);
           Sheet s = w.getSheet(sheetname);
Row r = s.getRow(rowNo);

Cell cell = r.getCell(cellNo);
			String ss = cell.getStringCellValue();
			return ss;
		}}



