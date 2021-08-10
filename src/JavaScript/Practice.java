package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class Practice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\eclipse-workspace\\Screenshot\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtusername = driver.findElement(By.id("email"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('value','greens111111')",txtusername);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		executor.executeScript("arguments[0].setAttribute('value','pass@123')", txtpass);
		
		Object a = executor.executeScript("return arguments[0].getAttribute('value')", txtusername);
		System.out.println(a);
		
		Object b = executor.executeScript("return arguments[0].getAttribute('value')",txtpass);
		System.out.println(b);
				
		driver.quit();
		
		
		
		
	}

}
