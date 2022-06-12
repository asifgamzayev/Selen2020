import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Facebook_task {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asifg\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

//
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("adam@gmail.com" + Keys.ENTER);

        driver.findElement(By.id("pass")).sendKeys("123456789" + Keys.ENTER);

        driver.findElement(By.name("login")).click();

        Thread.sleep(2000);

        String actual = driver.findElement(By.className("_9ay7")).getText();

        String expected = "The password you’ve entered is incorrect. Forgot Password?";

        Assert.assertEquals(actual, expected);


    }
}