package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC29_SearchByDate_in_bowrrow {

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

        driver.findElement(By.xpath("//html//div[@class='navbar navbar-fixed-top navbar-inverse']//li[3]/a[1]")).click();
        driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//a[@href='view_borrow.php']")).click();
        driver.findElement(By.xpath("//a[@href='#myModal3']")).click();

        driver.findElement(By.name("from")).sendKeys("1/1/1992");
        driver.findElement(By.name("to")).sendKeys("1/1/2015");
        driver.findElement(By.cssSelector("//div[@id='myModal3']//div[@class='modal-body']//form[@class='form-horizontal']//div[@class='control-group']//div[@class='controls']//button[@type='submit']")).click();


	}

}
