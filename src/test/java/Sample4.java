import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample4 extends Baseclass {

			

public static void main(String[] args) throws IOException, InterruptedException {
	
	Browser("https://adactinhotelapp.com/BookHotel.php");
		
	String readexcel = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 0, 1);
		
	WebElement locators = locators("id", "username");
	locators.sendKeys(readexcel);
	String readexcel2 = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 1, 1);
	WebElement locators1 = locators("id", "password");
	locators1.sendKeys(readexcel2);
	WebElement locators2 = locators("id", "login");
	locators2.click();
	WebElement location = locators("id", "location");
	String locddn = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 8, 1);
	dropDown(location, locddn);
	WebElement hotels = locators("id", "hotels");
	String Hoteddn = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 9, 1);
	dropDown(hotels, Hoteddn);
	WebElement room = locators("id", "room_type");
	String roomddn = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 10, 1);
	dropDown(room, roomddn);
	WebElement rmno = locators("id", "room_nos");
	String rNoddn = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 11, 1);
	dropDown(rmno, rNoddn);
	WebElement checkin = locators("id", "datepick_in");
	checkin.clear();
	String cdatevalue = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 12, 1);
	keys(checkin, cdatevalue);
	WebElement checkout = locators("id", "datepick_out");
	checkout.clear();
	String outdatevalue = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 13, 1);
	keys(checkout, outdatevalue);
	WebElement adult = locators("id", "adult_room");
	String aduddn = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 14, 1);
	dropDown(adult, aduddn);
	WebElement childrm = locators("id", "child_room");
	String chiddn = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 15, 1);
	dropDown(childrm, chiddn);
	WebElement submit = locators("id", "Submit");
	click(submit);
	WebElement radio = locators("id", "radiobutton_0");
	click(radio);
	WebElement conti = locators("id", "continue");
	click(conti);
	WebElement fName = locators("id", "first_name");
	String first = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 2, 1);
	keys(fName, first);
	WebElement LName = locators("id", "last_name");
	String Last = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 3, 1);
	keys(LName, Last);
	WebElement Address = locators("id", "address");
	String resident = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 4, 1);
	keys(Address, resident);
	WebElement cc = locators("id", "cc_num");
	String ccnum = readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 5, 1);
	keys(cc, ccnum);
	WebElement cctype = locators("id", "cc_type");
	String cctyddn= readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 16, 1);
	dropDown(cctype, cctyddn);
	WebElement exmonth = locators("id", "cc_exp_month");
	String mntddn= readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 17, 1);
	dropDown(exmonth, mntddn);
	WebElement exyear = locators("id", "cc_exp_year");
	String yearddn= readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 18, 1);
	dropDown(exyear, yearddn);
	WebElement ccv = locators("id", "cc_cvv");
	String ccvno= readexcel("H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase3-BookaHotelwww.adactinhotelapp.comandGenerateOrderIDviaMaven-DataDriven-Selenium\\Testexcel\\Test Data.xlsx", "Adactin", 7, 1);
	keys(ccv, ccvno);
	locators("id", "book_now").click();
	Thread.sleep(6000);
	WebElement attr = locators("id", "order_no");
	String att = getAtt(attr, "value");
	System.out.println(att);
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
