package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC24_LogOut {

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

        driver.findElement(By.xpath("//a[@href='logout.php']")).click();
        

        String title = driver.getTitle();
        System.out.println("title is " + title);
        String expected_title = "Online Library System";

        if (title.equals(expected_title)) {
            System.out.println("you are in the home page");
        } else {
            System.out.println("refresh");
        }

	}

}
