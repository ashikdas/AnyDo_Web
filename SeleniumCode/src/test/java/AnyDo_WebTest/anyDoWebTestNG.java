package AnyDo_WebTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class anyDoWebTestNG {
	
	static WebDriver driver = null;

	@BeforeTest
	public static void setup() throws AWTException, InterruptedException {
		
		Robot rb=new Robot();
		
//		WebDriverManager.chromedriver().setup();
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
//		driver=new ChromeDriver();
		
		driver.get("https://desktop.any.do/");
		
		AnyDoWebObjects.continueWithEmail(driver).click();
		Thread.sleep(2000);
		
//		AnyDoWebObjects.email(driver).sendKeys("nemex73672@niekie.com");
		AnyDoWebObjects.email(driver).sendKeys("ashik@gmail.com");
		Thread.sleep(3000);
		
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		AnyDoWebObjects.password(driver).sendKeys("Ashik");
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(7000);
	}
	
	@Test
	public static void createTask() throws InterruptedException, AWTException{
		Robot rb=new Robot();
		
		AnyDoWebObjects.createTask(driver).click();
		Thread.sleep(2000);
		
//		Alert simplealert=driver.switchTo().alert();
//		simplealert.sendKeys("My Daily Task");
		
		StringSelection ss = new StringSelection("My Daily Task");
		
		// ctrl c action
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		// Press Ctrl 
		rb.delay(4000);
				
		rb.keyPress(KeyEvent.VK_CONTROL);
				
		// Press "V" 
				
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
				
		// Press the "Enter" button
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2000);
		
//		AnyDoWebObjects.taskName(driver).sendKeys("My Daily Task");
//		Thread.sleep(2000);
//		
//		Robot rb=new Robot();
//		rb.keyPress(KeyEvent.VK_ENTER);
		
//		AnyDoWebObjects.addTask(driver).click();
		
		driver.close();
	}
	
	
	@Test
	public static void createTaskWithNotesAndRemainder() throws InterruptedException, AWTException{
		Robot rb=new Robot();
		
		AnyDoWebObjects.createTask(driver).click();
		Thread.sleep(5000);
		
		
		StringSelection ss = new StringSelection("My Friday Task");
		
		// ctrl c action
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		// Press Ctrl 
		rb.delay(4000);
				
		rb.keyPress(KeyEvent.VK_CONTROL);
				
		// Press "V" 		
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2000);

		AnyDoWebObjects.nextWeek(driver).click();
		
		AnyDoWebObjects.notes(driver).sendKeys("Hangout with friends");
//		// Press the "Enter" button
//		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2000);
		AnyDoWebObjects.addTask(driver).click();		
//		driver.close();
	} 
	
	public static void wakeUpEarly(){
		AnyDoWebObjects.fridayTask(driver).click();
	}

}
