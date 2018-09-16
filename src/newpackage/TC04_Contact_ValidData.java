package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC04_Contact_ValidData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/hp2016/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/library-master/contact_form.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("first_name")).sendKeys("susan");
		driver.findElement(By.name("last_name")).clear();
		driver.findElement(By.name("last_name")).sendKeys("waak");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("mohandessen@gmail.com");
		driver.findElement(By.name("message")).clear();
		driver.findElement(By.name("message")).sendKeys("i have question");
		driver.findElement(By.name("submit")).click();

	}

}
