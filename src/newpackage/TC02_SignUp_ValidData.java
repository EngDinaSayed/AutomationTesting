package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC02_SignUp_ValidData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/hp2016/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/library-master/student_form.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("susan");
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("waak");
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("soso50");
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@name='gender']")));
		sel1.selectByVisibleText("Male");
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("mohandessen");
		driver.findElement(By.name("roll")).clear();
		driver.findElement(By.name("roll")).sendKeys("1205587");
		driver.findElement(By.name("contact")).clear();
		driver.findElement(By.name("contact")).sendKeys("012584545256");
		Select sel2 = new Select(driver.findElement(By.xpath("//select[@name='type']")));
		sel2.selectByVisibleText("Student");
		Select sel3 = new Select(driver.findElement(By.xpath("//select[@name='year_level']")));
		sel3.selectByVisibleText("First Year");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("25902107");
		driver.findElement(By.name("submit")).click();

	}

}
