package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Workspaces\\Eclipse IDE for Java Developers 442\\selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
        String title = driver.getTitle();
        System.out.println(title);
        
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(1000);
        
        driver.navigate().back();
        Thread.sleep(1000);
        
        driver.navigate().forward();
        Thread.sleep(1000);
}
}
