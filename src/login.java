import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://eatluvnpray.org/login");
		driver.findElement(By.name("email")).sendKeys("adidaslis@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		//driver.findElement(By.xpath("button[@type='button']")).click();
		driver.findElement(By.cssSelector("button.btnTyp4.mb-4.btn.btn-primary")).click();
	}

}
