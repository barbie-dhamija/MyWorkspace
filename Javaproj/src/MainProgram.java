
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainProgram {

	public static void main(String...s) { 

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul.choudhary\\Desktop\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.get("https://www.google.com");
		cd.findElement(By.xpath("//div[@id='gs_lc0']")).sendKeys("Testing");
		cd.findElement(By.xpath("//input[@value='Google Search']")).click();;
		
	}

}
