package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Workspaces\\Eclipse IDE for Java Developers 442\\selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("jegathesh");
		String attribute1 = username.getAttribute("value");
		System.out.println(attribute1);
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("245785278");
		String attribute = password.getAttribute("value");
		System.out.println(attribute);
		
		boolean displayed = username.isDisplayed();
		System.out.println("Is displayed or Not" +displayed);
		
		boolean enabled = password.isEnabled();
		System.out.println("Is displayed or Not" +enabled);
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		

}
}