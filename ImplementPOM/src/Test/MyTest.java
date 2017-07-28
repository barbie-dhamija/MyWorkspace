package Test;

import javax.xml.ws.Holder;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.HomeBaseWarning;

import Pages.AfterLoginPage;
import Pages.BeforeLoginPage;
import Pages.LoginWindow;


public class MyTest {

	public static void main(String[] args) throws InterruptedException {
    
     System.setProperty("webdriver.gecko.driver", "C:\\Users\\rahul.choudhary\\Downloads\\geckodriver.exe");
     WebDriver dr = new FirefoxDriver();
     dr.get("https://www.flipkart.com");
     Thread.sleep(10000);
     dr.findElement(By.xpath("(//ul[@class='_3Ji-EC']/li)[9]")).click();
     System.out.println("welcome");
  
     Thread.sleep(10000);
   
 for(String winHandle : dr.getWindowHandles()){
     dr.switchTo().window(winHandle);
     dr.findElement(By.xpath("(//div[@class='_39M2dM'])[1]/input")).sendKeys("9466230705");
 	Thread.sleep(10000);
 	dr.findElement(By.xpath("(//div[@class='_39M2dM'])[2]/input")).sendKeys("Mummypapa@251184");
 	Thread.sleep(10000);
 	dr.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
 	System.out.println("hello welcome");
 	Thread.sleep(10000);
     
     System.out.println("On new window");
     WebElement Ft = dr.findElement(By.xpath("(//ul[@class='_114Zhd']/li)[6]"));
     WebElement co = dr.findElement(By.xpath("//span[text()='Curtains']"));
     Actions ac = new Actions(dr);
     System.out.println("on homepage");
     Thread.sleep(10000);
 	ac.moveToElement(Ft).click().perform();
 	Thread.sleep(10000);
 	ac.moveToElement(co).click().perform();
 	Thread.sleep(10000);

int i = dr.findElements(By.xpath("//div[text()='Discount']")).size();
int j= dr.findElements(By.xpath("(//div[@class='_1p7h2j'])[9]")).size();
	
int count=0;	
while(i==0)
 	 {
 		
 		JavascriptExecutor jse = (JavascriptExecutor)dr;
 	 	jse.executeScript("scroll(0, 550)");
 	count= 	dr.findElements(By.xpath("//div[text()='Discount']")).size();
 	 	i=count;
 	 }
WebElement wb = dr.findElement(By.xpath("//div[text()='Discount']"));
 		wb.click(); 
 	
 		
     System.out.println("Done");
 	Thread.sleep(30000);
 	count=0;
 	while(j==0)
	 {
		
		JavascriptExecutor jse = (JavascriptExecutor)dr;
	 	jse.executeScript("scroll(0, 550)");
	count= 	dr.findElements(By.xpath("(//div[@class='_1p7h2j'])[9]")).size();
	 	j=count;
	 }
WebElement wb1 = dr.findElement(By.xpath("(//div[@class='_1p7h2j'])[9]"));
		wb1.click(); 
	Thread.sleep(10000);
 	System.out.println("finished");
	}
 
 

	}}
