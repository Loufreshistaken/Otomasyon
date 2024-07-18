package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test2 {

    @Test (priority = 1)
    public void testYoutube() {
        System.setProperty("wbbdriver.chrome.driver", "drivers/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.youtube.com/?app=desktop&hl=tr");
        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[3]/a/tp-yt-paper-item/yt-formatted-string")).click();

        driver.quit();
    }

    @Test (priority = 2)
    public void testYoutube2() {
        System.setProperty("wbbdriver.chrome.driver", "drivers/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.youtube.com/?app=desktop&hl=tr");
        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[3]/a/tp-yt-paper-item/yt-formatted-string")).click();

        driver.quit();
    }


}
