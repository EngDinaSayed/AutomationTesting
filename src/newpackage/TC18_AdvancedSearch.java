package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC18_AdvancedSearch {

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

        driver.findElement(By.xpath("//a[@href='#myModal']")).click();

        driver.findElement(By.name("Title")).sendKeys("Computer Graphics");
        driver.findElement(By.name("Author")).sendKeys(" Donald Hearn & Pauline Baker");

        driver.findElement(By.xpath("//div[@id='myModal']//div[@class='modal-body']//form[@class='form-horizontal']//div[@class='control-group']//div[@class='controls']//button[@type='submit']")).click();


	}

}
