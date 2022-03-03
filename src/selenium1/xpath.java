package selenium1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class xpath {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Workspaces\\Eclipse IDE for Java Developers 442\\selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.xpath("//input[@autofocus='1']"));
		username.sendKeys("jegathesh");
		
		WebElement password1 = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		password1.sendKeys("abcdef");
		
		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		login.click();
		Thread.sleep(1000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Rajesh\\Workspaces\\Eclipse IDE for Java Developers 442\\selenium1\\Screenshots\\pic3.png");
		FileHandler.copy(source, destination);

}
}