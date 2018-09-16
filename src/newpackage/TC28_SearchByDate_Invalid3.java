package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC28_SearchByDate_Invalid3 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/hp2016/Downloads/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://localhost/library-master/library-master/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.findElement(By.name("username")).clear();
	        driver.findElement(By.name("username")).sendKeys("jahidd26");
	        driver.findElement(By.name("password")).clear();
	        driver.findElement(By.name("password")).sendKeys("123456");

	        driver.findElement(By.name("submit")).click();

	        driver.findElement(By.xpath(" //a[@href='#myModal2']")).click();

	        driver.findElement(By.name("from")).sendKeys("1/1/1883");
	        driver.findElement(By.name("to")).sendKeys("1/1/2016");
	        driver.findElement(By.cssSelector(" //html//div[@id='myModal2']//div[3]/div[1] ")).click();


	}

}
