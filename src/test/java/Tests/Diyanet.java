package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;


public class Diyanet {
    public static void main(String[] args){
        for (int i = 0; i < 1; i++) {
            System.setProperty("wbbdriver.chrome.driver", "drivers/chromedriver");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");

            WebDriver driver = new ChromeDriver(options);

            driver.get("https://diyanet.qulak.com/application/guest-form/864a92e6-1ec1-4c95-bd59-b49f2310ba11");

            String kimlikNum = generateRandomNumber(11);

            String randomemail = "batuham" + generateRandomNumber(4) + "@qulak.com.tr";

            WebElement kimnumField = driver.findElement(By.cssSelector("#form_id_number"));
            kimnumField.click();
            kimnumField.sendKeys(kimlikNum);

            WebElement adField = driver.findElement(By.cssSelector("#form_name"));
            adField.click();
            adField.sendKeys("Batuhan");

            WebElement soyadField = driver.findElement(By.cssSelector("#form_surname"));
            soyadField.click();
            soyadField.sendKeys("Urus");

            WebElement cinsiyetField = driver.findElement(By.cssSelector("#form_gender"));
            cinsiyetField.click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

            WebElement maleOption = driver.findElement(By.xpath("//option[@value='male']"));
            maleOption.click();

            WebElement birthdayField = driver.findElement(By.cssSelector("#form_birth_date"));
            birthdayField.click();
            birthdayField.sendKeys("24201999");

            WebElement mailField = driver.findElement(By.cssSelector("#form_email"));
            mailField.click();
            mailField.sendKeys("batuhan" + generateRandomNumber(4) + "@qulak.com");

            WebElement phoneFeild = driver.findElement(By.cssSelector("#form_phone_number"));
            phoneFeild.click();
            phoneFeild.sendKeys("55555555555");

            WebElement SigninField = driver.findElement(By.cssSelector("#educator_signup_form > div.col-md-12 > button"));
            SigninField.click();

            // driver.quit();
        }
    }

    private static String generateRandomNumber(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
