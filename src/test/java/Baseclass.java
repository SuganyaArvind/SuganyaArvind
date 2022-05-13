import java.awt.geom.Ellipse2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	 static WebDriver driver;
	 static WebElement element; 
	 	 
	public static void Browser(String Url) {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get(Url);
			
	}
	
	public static WebElement locators(String locator, String value) {

		if (locator.equals("id")) {
						
			return element = driver.findElement(By.id(value));
					
		}
		
		else if (locator.equals("name")) {
			
			return element = driver.findElement(By.name(value));
				
		}
		
		else{
			
			return element = driver.findElement(By.xpath(value));
		}
				
	} 

	public static void keys(WebElement element, String keyvalue) {

		element.sendKeys(keyvalue);
	}
	
	public static void click(WebElement element) {

		element.click();
	}
	
	public static String getAtt(WebElement element, String Attvalue ) {

		
		String attribute = element.getAttribute(Attvalue);
		return attribute;
	}
	
	
	public static void dropDown(WebElement element, String ddnText) {

		Select s = new Select(element);
				
		s.selectByVisibleText(ddnText);
		
	}
	
	public static String readexcel(String path,String sheet, int rowindex, int cellindex) throws IOException {
		
		File f = new File(path);
		FileInputStream stream = new FileInputStream(f);
		Workbook w  = new XSSFWorkbook (stream);
		Sheet sheet2 = w.getSheet(sheet);
		Row row2 = sheet2.getRow(rowindex);
		Cell cell2 = row2.getCell(cellindex);
//		String stringCellValue = cell2.getStringCellValue();
		int cellType = cell2.getCellType();
		
		if (1==cellType) {
			cell2.getCellType();
			String stringCellValue = cell2.getStringCellValue();
			return stringCellValue;
		}else if (DateUtil.isCellDateFormatted(cell2)) {
				Date date = cell2.getDateCellValue();
			SimpleDateFormat dateformat =  new SimpleDateFormat("dd/MM/YYYY");
		String format = dateformat.format(date);
		return	format;
				
		}else {
			double numericCellValue = cell2.getNumericCellValue();
		long l = (long) numericCellValue;
		String valueOf = String.valueOf(l);
		return valueOf;
		
		
		
	}
	
	}
}
//	public static FileInputStream inputstream  (File f) throws FileNotFoundException {
//
//		return stream = new FileInputStream(f);
//		
//	}
//	
//	public static XSSFWorkbook Workbook (FileInputStream stream ) throws IOException {
//		return w  = new XSSFWorkbook (stream);
//
//		
//		
//	}
//	
//	public static XSSFSheet sheet(XSSFWorkbook w, String page) {
//		return sheet = w.getSheet(page);
//		
//	}
//	
//
//	public static int phyrows() {
//
//		return physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//	
//	}
//
//	public static XSSFRow getrow( int rindex) {
//
//		return row = sheet.getRow(rindex);
//		
//	}
//	
//	public static int phycells (int physicalNumberOfRows) {
//
//		return physicalNumberOfCells = row.getPhysicalNumberOfCells();
//		
//	}
//	
//	
//	public static XSSFCell getcell (int cindex) {
//	
//		XSSFCell cell = row.getCell(cindex);
//		return cell;
//		
//	}
//	
//	public static String stringvalue() {
//
//		String stringCellValue = cell.getStringCellValue();
//		return stringCellValue;
//				
//	}
	
	
	
	
	
	
	

	
 
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

