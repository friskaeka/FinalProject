package WebTest.helper;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Utility {
    public static WebDriver driver;

    public static void startDriver() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public static void quitDriver(){
        driver.quit();
    }

    public static String generateRandomUsername() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        String username = "";
        String temp = RandomStringUtils.randomAlphanumeric(10);
        username = temp + "@testdata.com";
        return username;
    }

    public static String generateRandomPassword() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        String password = "";
        String temp = RandomStringUtils.randomAlphanumeric(10);
        password = temp;
        return password;
    }
}
