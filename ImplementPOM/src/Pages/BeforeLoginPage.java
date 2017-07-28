package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.MyTest;

public class BeforeLoginPage {
WebDriver driver;

@FindBy(xpath="(//ul[@class='_3Ji-EC']/li)[9]") WebElement LoginBtn;


public BeforeLoginPage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
   
public void forLoginClick()
{
	System.out.println("login click");
	LoginBtn.click();
}
}
