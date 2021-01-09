import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
public class DatePickers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement datefield = driver.findElement(By.id("datepicker"));

        datefield.sendKeys("12/25/2020");
        datefield.sendKeys(Keys.RETURN);
//helloworld
	}

}
