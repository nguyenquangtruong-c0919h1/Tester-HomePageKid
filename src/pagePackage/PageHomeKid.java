package pagePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class PageHomeKid {
	WebDriver driver;
	By logoAdidas = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div[1]/div/div[3]/div/a");
	By buttonOriginal = By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div[3]/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[1]/div/a");
	By inputSearch = By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div[3]/div/div[2]/div[1]/div/form/input[1]");
	public PageHomeKid(WebDriver driver) {
		this.driver = driver;
	}
	//Method Click on logo Adidas
	public void clickLogoAdidas() {
		driver.findElement(logoAdidas).click();
	}
	// Method take Url Current
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	//Method back Page
	public void backPage() {
		driver.navigate().back();
	}
	//method click Original
	public void clickOriginal() {
		driver.findElement(buttonOriginal).click();
	}
	//method input Search
	public void clickInputSearch() {
		driver.findElement(inputSearch).click();
	}
	public void clickSearch() {
		driver.findElement(inputSearch).sendKeys(Keys.ENTER);;
	}
}
