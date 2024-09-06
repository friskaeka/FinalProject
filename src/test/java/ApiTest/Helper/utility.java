package ApiTest.Helper;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class utility {
    public static WebDriver driver;

    public static File getJsonSchemaFile(String JSONFile) {
        return new File("src/test/java/ApiTest/Helper/JSONSchemaData/" + JSONFile);
    }

    public static String generateRandomEmail(){
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_" + ".";
        String email = "";
        String temp = RandomStringUtils.randomAlphanumeric(10);
        email = temp + "@tesdata.com";
        return email;
    }
}
