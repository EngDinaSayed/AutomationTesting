package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC25_Login_Invalid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp2016/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/library-master/library-master/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("test");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("00000");
        
        driver.findElement(By.name("submit")).click();
        
        String title=driver.getTitle();
        System.out.println("title is "+title);
        String expected_title="Online Library System";
        
        if(title.equals(expected_title))
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Faild");
        }

	}

}
