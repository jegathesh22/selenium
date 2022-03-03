package selenium1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class instagram {
	
	public static void main(String[]args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Workspaces\\Eclipse IDE for Java Developers 442\\selenium1\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.xpath("//input[@maxlength='75']"));
		username.sendKeys("7502553741");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Jega1993@.");
		//Thread.sleep(1000);
		
		WebElement login = driver.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm                                                                                                              ']"));
		login.click();
		//Thread.sleep(1000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Rajesh\\Workspaces\\Eclipse IDE for Java Developers 442\\selenium1\\Screenshots\\pic4.png");
        FileHandler.copy(source, destination);																													
	}
	

}
