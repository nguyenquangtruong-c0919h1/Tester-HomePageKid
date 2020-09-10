package testPackage;
import pagePackage.PageHomeKid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class TestHomePageKid {
	String driverPath = "C:\\Users\\blhoaison\\Downloads\\Selenium\\geckodriver.exe";
	WebDriver driver;
	PageHomeKid objPageHomeKid;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get("https://www.adidas.com.vn/en/kids-boys-4_8-clothing");
	}
	@Test(priority=0)
	public void testPageHomeKid() {
		//create object Page Home Kid
		objPageHomeKid = new PageHomeKid(driver);
		//Url Home Page Adidas
		String urlHome = "https://www.adidas.com.vn/en";
		String urlOriginal = "https://www.adidas.com.vn/en/men-originals-shoes";
		//CASE 1
		//Click logo Adidas
		objPageHomeKid.clickLogoAdidas();
		//Take Url after click
		String getCurrentUlrHome = objPageHomeKid.getCurrentUrl();
		//Use "if else" for check 
		if(getCurrentUlrHome.equals(urlHome)){
			System.out.println("Ok, Click logo Adidas Success");
		}else {
			System.out.println("No, Click logo Adidas Failse");
		}	
		//Back page
		objPageHomeKid.backPage();	
		//CASE 2
        Actions actions = new Actions(driver);
    	WebElement buttonMen = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div[3]/div/div[1]/div[1]/a"));
        //Move mouse button Men
    	actions.moveToElement(buttonMen).perform();
    	//click original
		objPageHomeKid.clickOriginal();
		//get current Url
		String getCurrentUrlOriginal = objPageHomeKid.getCurrentUrl();
		//Check success or failse
		if(getCurrentUrlOriginal.equals(urlOriginal)){
			System.out.println("Ok, go to Original Success");}
		else {
			System.out.println("No, go to Original Failse");
		}	
		//return page
		objPageHomeKid.backPage();	
		//CASE 3
		WebElement sendKeySearch = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div[3]/div/div[2]/div[1]/div/form/input[1]"));
		// write text in input Search
		sendKeySearch.sendKeys("hats");
		//Enter
		objPageHomeKid.clickSearch();
		System.out.println("Success");
	}
}
