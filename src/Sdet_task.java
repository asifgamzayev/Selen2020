import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Sdet_task {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asifg\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

        driver.get("https://www.dice.com/");

        driver.findElement(By.id("typeaheadInput")). sendKeys("SDET" + Keys.ENTER);

        Thread.sleep(2000);

        driver.findElement(By.id("google-location-search")). sendKeys("Washington DC");

        Thread.sleep(2000);

        driver.findElement(By.id("google-location-search")).click();

        List<WebElement> elements =  driver.findElements(By.xpath ("// a[@data-cy='card-title-link']"));

        Assert.assertEquals(20, elements.size());

        List<String>newList = new ArrayList<>();
        for (WebElement element : elements) {

           Assert.assertTrue(element.getText().contains("SDET"));
            
        }

        elements.get(elements.size()-1).click();


    }
}
