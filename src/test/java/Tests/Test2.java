package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test2 {

    @Test (priority = 1)
    public void testWikiPedia() {
        System.setProperty("wbbdriver.chrome.driver", "drivers/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.cssSelector(".other-project:nth-child(1)")).click();

        driver.quit();
    }

    @Test (priority = 2)
    public void testWikiPedia2() {
        System.setProperty("wbbdriver.chrome.driver", "drivers/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.cssSelector(".other-project:nth-child(2)")).click();

        driver.quit();
    }


}
