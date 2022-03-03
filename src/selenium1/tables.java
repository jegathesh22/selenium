package selenium1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {
	     public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Workspaces\\Eclipse IDE for Java Developers 442\\selenium1\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/web-table-element.php/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			System.out.println("************** all data *********************");
		    List<WebElement> all_data = driver.findElements(By.xpath("//table//tr/td"));
			for(WebElement webElement : all_data){
			String text = webElement.getText();
			System.out.println(text);
			System.out.println(" ");
			}
			System.out.println("************** row data *********************");
			List<WebElement> row_data = driver.findElements(By.xpath("//table//tr[4]/td"));
			for(WebElement webElement : row_data){
			String row_text = webElement.getText();
			System.out.print(row_text +" ");
			System.out.println(" ");
			}
			System.out.println("************* column data *******************");
			List<WebElement> column_data = driver.findElements(By.xpath("//table//tr/td[2]"));
			for(WebElement webElement : column_data){
			String column_text = webElement.getText();
			System.out.print(column_text +" ");
			System.out.println(" ");
			}
			System.out.println("**************** particular *******************");
			WebElement particular = driver.findElement(By.xpath("//table//tr[10]/td[1]"));
			System.out.println(particular.getText());
				
			
				
	}
		

	}


