package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShotFinal {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\eclipse-workspace\\Screenshot\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		
		File Source = screen.getScreenshotAs(OutputType.FILE);
		
		File designation = new File("E:\\Selenium Screenshot\\Result\\Final.jpeg");
				
		FileUtils.copyFile(Source, designation);
		
		driver.quit();
		
		
	}

}
