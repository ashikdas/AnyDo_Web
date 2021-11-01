package AnyDo_WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnyDoWebTest {

	public static void setup () {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://desktop.any.do/");
		
		driver.findElement(By.xpath("//div[contains(text(),'Continue with Email or Apple')]")).click();

	}

}
