package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\eclipse-workspace\\Screenshot\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtusername = driver.findElement(By.name("username"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
				
		txtusername.click();
				
		executor.executeScript("arguments[0].setAttribute('value','harivarman')", txtusername);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
