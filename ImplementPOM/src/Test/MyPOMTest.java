package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import Pages.AfterLoginPage;
import Pages.BeforeLoginPage;
import Pages.LoginWindow;

public class MyPOMTest {

	public static void main(String[] args) throws Exception {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\rahul.choudhary\\Downloads\\geckodriver.exe");
		     WebDriver dr = new FirefoxDriver();
		     dr.get("https://www.flipkart.com");
		     Thread.sleep(10000);
		     BeforeLoginPage bf = new BeforeLoginPage(dr);
		     bf.forLoginClick();
		     Thread.sleep(20000);
        LoginWindow lv = new LoginWindow(dr);
         lv.SearchTextWrite("9466230705", "Mummypapa@251184");
         Thread.sleep(10000);
         System.out.println("logged in");
          AfterLoginPage alp = new AfterLoginPage(dr);
         alp.TabClick();
         Thread.sleep(20000);
	}

}
