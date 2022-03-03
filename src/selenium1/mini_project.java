package selenium1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class mini_project {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Workspaces\\Eclipse IDE for Java Developers 442\\selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
		driver.findElement(By.name("email")).sendKeys("Jegathesh@gmail.com");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("auto1234");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
		
		driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]")).click();
		driver.findElement(By.xpath("(//img[@title='Printed Dress'])[2]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
	
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("(//a[@rel='nofollow'])[3]")).click();
		
		driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span")).click();
		driver.findElement(By.name("cgv")).click();
		driver.findElement(By.xpath("//*[@id='form']/p/button/span")).click();
		driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a/span")).click();
		driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span")).click();
		
		JavascriptExecutor jsd = (JavascriptExecutor)driver;
		jsd.executeScript("window.scroll(0,350);");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Rajesh\\Workspaces\\Eclipse IDE for Java Developers 442\\selenium1\\Screenshots\\pic5.png");
        FileHandler.copy(source, destination);
	}
}