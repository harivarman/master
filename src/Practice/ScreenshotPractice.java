package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotPractice {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\eclipse-workspace\\Screenshot\\Driver\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://en-gb.facebook.com/");
	 
	 driver.manage().window().maximize();
	 
	 TakesScreenshot screenshot = (TakesScreenshot)driver;
	 
	 File s = screenshot.getScreenshotAs(OutputType.FILE);
	 
	 File d = new File("E:\\Selenium Screenshot\\Result\\Pratice.jpeg");
	 
	 FileUtils.copyFile(s, d);
	 
	 driver.quit();
	 
	 
	 
	}

}
