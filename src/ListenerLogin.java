import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListenerLogin {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://eatluvnpray.org");
		driver.findElement(By.id("login-nav-dropdown")).click();
		driver.findElement(By.xpath("//div[@aria-labelledby='login-nav-dropdown'] //a[@href='#']")).click();
		driver.findElement(By.name("email")).sendKeys("adidaslis@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.cssSelector("button.btnTyp4.mb-4.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("a.nav-link")).click();
	
	}
	}


