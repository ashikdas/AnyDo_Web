package AnyDo_WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AnyDoWebObjects {
	
	private static WebElement locator = null;
	
	public static WebElement continueWithEmail(WebDriver driver){
		locator = driver.findElement(By.xpath("//div[contains(text(),'Continue with Email or Apple')]"));
		return locator;
	}
	

	
	public static WebElement email(WebDriver driver){
		locator = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/input[1]"));
		return locator;
	}

	public static WebElement password(WebDriver driver){
//		locator = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[2]/div[1]/input[1]"));
		locator = driver.findElement(By.name("password"));
		return locator;
	}
	
	public static WebElement createTask(WebDriver driver){
		locator = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/button[1]/span[2]"));
		return locator;
	}

	public static WebElement taskName(WebDriver driver){
//		locator = driver.findElement(By.cssSelector("div.js-Portal.portal-default:nth-child(7) div.BackdropModal div.BackdropModal__modal form.SmartTypeNewTaskModal section.CardMenu div.CardMenuBody__tab div.SmartTypeNewTaskModal__body div.SmartTypeNewTaskModal__body__main.SmartTypeNewTaskModal__body__main--noCustomScrollbars div.SmartTypeNewTaskModal__cell:nth-child(1) div.SmartTypeNewTaskModal__taskTitle div.SmartTypeNewTaskModalTextFieldWrapper.SmartTypeNewTaskModalTextFieldWrapper--focus div.SmartTypeNewTaskModalTextFieldWrapper__content div.SmartTypeTextField:nth-child(2) div.DraftEditor-root div.DraftEditor-editorContainer div.notranslate.public-DraftEditor-content div:nth-child(1) div:nth-child(1) > div.public-DraftStyleDefault-block.public-DraftStyleDefault-ltr"));
//		locator = driver.findElement(By.xpath("//div[@class='SmartTypeNewTaskModalTextFieldWrapper__content']//div//div[@class='SmartTypeTextField']//div[@class='DraftEditor-root']//div[@class='DraftEditor-editorContainer']//div[@class='notranslate public-DraftEditor-content']//div[@data-contents='true']//div[@data-block='true']//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']"));
		locator = driver.findElement(By.className("public-DraftStyleDefault-block public-DraftStyleDefault-ltr"));
//		locator = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/section[1]/div[1]/article[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
		
		return locator;
	}
	
	public static WebElement addTask(WebDriver driver){
		locator = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/form[1]/section[1]/footer[1]/div[1]/div[1]/button[1]/strong[1]"));
		return locator;
	}
	
	public static WebElement nextWeek(WebDriver driver){
		locator = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[5]"));
		return locator;
	}
	
	public static WebElement notes(WebDriver driver){
		locator = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/textarea[1]"));
		return locator;
	}
	
	public static WebElement fridayTask(WebDriver driver){
//		locator = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/section[1]/div[1]/article[1]/div[1]/div[3]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		locator = driver.findElement(By.xpath("//div[contains(text(),'My Friday Task')]"));
		return locator;
		
	}
}
