package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {
    public static void main(String[] args) {
        System.setProperty("wbdriver.chrome.driver","drivers/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.cssSelector(".top-card:nth-child(1) h5")).click();
        driver.findElement(By.cssSelector(".element-group:first-child #item-0")).click();
        js.executeScript("window.scrollBy(0,150)", "");

    }
}
