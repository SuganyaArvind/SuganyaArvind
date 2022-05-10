import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3Adactin {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		
		File f =  new File("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		Workbook w  =new XSSFWorkbook(stream);
		
		Sheet sheet = w.getSheet("Adactin");
		
//		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//		
//		 for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
//			Row row = sheet.getRow(i);
//			
//			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
//			
//			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//				Cell cell = row.getCell(j);
//				
//				System.out.println(cell);
		
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(1);
		String usrtxt = cell.getStringCellValue();
		
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		String passtxt = cell1.getStringCellValue();
		WebDriver driver = new ChromeDriver();
		Row row2 = sheet.getRow(8);
		Cell cell2 = row2.getCell(1);
		String location = cell2.getStringCellValue();
		Row row3 = sheet.getRow(9);
		Cell cell3 = row3.getCell(1);
		String hotelName = cell3.getStringCellValue();
		Row row4 = sheet.getRow(10);
		Cell cell4 = row4.getCell(1);
		String RoomType = cell4.getStringCellValue();
		Row row5 = sheet.getRow(11);
		Cell cell5 = row5.getCell(1);
		String Numberofrooms = cell5.getStringCellValue();
		
		Row row6 = sheet.getRow(12);
		Cell cell6 = row6.getCell(1);
//		String checkindate = cell6.getStringCellValue();
		Date date = cell6.getDateCellValue();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		String checkindate = dateformat.format(date);
		Row row7 = sheet.getRow(13);
		Cell cell7 = row6.getCell(1);
		Date Date2 = cell6.getDateCellValue();
		SimpleDateFormat dateformat1 = new SimpleDateFormat("dd/MM/YYYY");
		String outdate = dateformat1.format(Date2);
		Row row8 = sheet.getRow(14);
		Cell cell8 = row8.getCell(1);
		String Adultsrm  = cell8.getStringCellValue();
		Row row9 = sheet.getRow(15);
		Cell cell9 = row9.getCell(1);
		String Childrenrm = cell9.getStringCellValue();
		Row row10 = sheet.getRow(2);
		Cell cell10 = row10.getCell(1);
		String FName = cell10.getStringCellValue();
		Row row11 = sheet.getRow(3);
		Cell cell11 = row11.getCell(1);
		String LName = cell11.getStringCellValue();
		Row row12 = sheet.getRow(4);
		Cell cell12 = row12.getCell(1);
		String Address = cell12.getStringCellValue();
		Row row13 = sheet.getRow(5);
		Cell cell13 = row13.getCell(1);
		String ccnum = cell13.getStringCellValue();
		Row row14 = sheet.getRow(16);
		Cell cell14 = row14.getCell(1);
		String cctype = cell14.getStringCellValue();
		Row row15 = sheet.getRow(17);
		Cell cell15 = row15.getCell(1);
		String ccexpirydate = cell15.getStringCellValue();
		Row row16 = sheet.getRow(18);
		Cell cell16 = row16.getCell(1);
		String ccexpiryyr = cell16.getStringCellValue();
		Row row17 = sheet.getRow(7);
		Cell cell17 = row17.getCell(1);
		String ccvnum = cell17.getStringCellValue();
				
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(usrtxt);
		driver.findElement(By.id("password")).sendKeys(passtxt);
		driver.findElement(By.id("login")).click();
		WebElement Locddn = driver.findElement(By.id("location"));
		Select s = new Select(Locddn);
		s.selectByVisibleText(location);
		WebElement Hoteddn= driver.findElement(By.id("hotels"));
		Select  s1 = new Select(Hoteddn);
		s1.selectByVisibleText(hotelName);
		WebElement roomddn = driver.findElement(By.id("room_type"));
		Select  s2 = new Select(roomddn);
		s2.selectByVisibleText(RoomType);
		WebElement rNoddn = driver.findElement(By.id("room_nos"));
		Select  s3 = new Select(rNoddn);
		s3.selectByVisibleText(Numberofrooms);
		driver.findElement(By.id("datepick_in")).clear();
		WebElement cdate = driver.findElement(By.id("datepick_in"));
		cdate.clear();
		cdate.sendKeys(checkindate);
		WebElement odate = driver.findElement(By.id("datepick_out"));
		odate.clear();
		odate.sendKeys(outdate);
		WebElement aduddn = driver.findElement(By.id("adult_room"));
		Select  s4 = new Select(aduddn);
		s4.selectByVisibleText(Adultsrm);
		WebElement chiddn = driver.findElement(By.id("child_room"));
		Select  s5 = new Select(chiddn);
		s5.selectByVisibleText(Childrenrm);
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys(FName);
		driver.findElement(By.id("last_name")).sendKeys(LName);
		driver.findElement(By.id("address")).sendKeys(Address);
		driver.findElement(By.id("cc_num")).sendKeys(ccnum);
		WebElement cc = driver.findElement(By.id("cc_type"));
		Select  s6 = new Select(cc);
		s6.selectByVisibleText(cctype);
		WebElement ccexpm = driver.findElement(By.id("cc_exp_month"));
		Select  s7 = new Select(ccexpm);
		s7.selectByVisibleText(ccexpirydate);
		WebElement ccexpy = driver.findElement(By.id("cc_exp_year"));
		Select  s8 = new Select(ccexpy);
		s8.selectByVisibleText(ccexpiryyr);
		driver.findElement(By.id("cc_cvv")).sendKeys(ccvnum);
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(6000);
		WebElement order = driver.findElement(By.id("order_no"));
		String id = order.getAttribute("value");
		
		File f1 = new File("H:\\Java_Sessions\\Sugi\\Output.xlsx");
//		FileInputStream stream1 = new FileInputStream(f1);
		Workbook w1  = new XSSFWorkbook();
		Sheet sheet2 = w1.createSheet("Sheet1");
		Row row18 = sheet2.createRow(1);

		Cell cell18 = row18.createCell(2);
		cell18.setCellValue(id);
		
		FileOutputStream out = new FileOutputStream(f1);
		w1.write(out);
		
//		String stringCellValue = cell18.getStringCellValue();
//		
		System.out.println(id);
		
		driver.quit();
				
				
				
						
				
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

