package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseAdactin {
	

	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "H:\\Java_Sessions\\Sugi\\Sugi workspace\\TestCase 1 - Book a Hotel Generate Order ID via Java Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");
	
	driver.manage().window().maximize();
	
	
	driver.findElement(By.id("username")).sendKeys("SugiArvindTMG");
	driver.findElement(By.id("password")).sendKeys("sugi@1");
	driver.findElement(By.id("login")).click();

	
	WebElement Locddn = driver.findElement(By.id("location"));
	Select s = new Select(Locddn);
	s.selectByIndex(3);
	WebElement Hoteddn= driver.findElement(By.id("hotels"));
	Select  s1 = new Select(Hoteddn);
	s1.selectByValue("Hotel Hervey");
	WebElement roomddn = driver.findElement(By.id("room_type"));
	Select  s2 = new Select(roomddn);
	s2.selectByVisibleText("Deluxe");
	WebElement rNoddn = driver.findElement(By.id("room_nos"));
	Select  s3 = new Select(rNoddn);
	s3.selectByIndex(1);
	driver.findElement(By.id("datepick_in")).clear();
	WebElement cdate = driver.findElement(By.id("datepick_in"));
	cdate.clear();
	cdate.sendKeys("23/05/2022");
	WebElement odate = driver.findElement(By.id("datepick_out"));
	odate.clear();
	odate.sendKeys("25/05/2022");
	WebElement aduddn = driver.findElement(By.id("adult_room"));
	Select  s4 = new Select(aduddn);
	s4.selectByValue("2");
	WebElement chiddn = driver.findElement(By.id("child_room"));
	Select  s5 = new Select(chiddn);
	s5.selectByVisibleText("4 - Four");
	driver.findElement(By.id("Submit")).click();
	
	driver.findElement(By.id("radiobutton_0")).click();
	
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("first_name")).sendKeys("Alvin");
	driver.findElement(By.id("last_name")).sendKeys("Chipmunks");
	driver.findElement(By.id("address")).sendKeys("123 Blvd Ave, Grover St, Omaha, NE, 68106");
	driver.findElement(By.id("cc_num")).sendKeys("4801 2585 3599 1005");
	WebElement cc = driver.findElement(By.id("cc_type"));
	Select  s6 = new Select(cc);
	s6.selectByIndex(1);
	WebElement ccexpm = driver.findElement(By.id("cc_exp_month"));
	Select  s7 = new Select(ccexpm);
	s7.selectByValue("6");
	WebElement ccexpy = driver.findElement(By.id("cc_exp_year"));
	Select  s8 = new Select(ccexpy);
	s8.selectByVisibleText("2022");
	driver.findElement(By.id("cc_cvv")).sendKeys("058");
	driver.findElement(By.id("book_now")).click();
	Thread.sleep(6000);
	WebElement order = driver.findElement(By.id("order_no"));
	String id = order.getAttribute("value");
	System.out.println(id);
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	}		
	
}
