package WebTest.Pages;


import org.openqa.selenium.By;

import static WebTest.helper.Utility.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebPage {

    String username, pass;

    By login = By.id("login2");
    By signin = By.id("signin2");
    By username_signin = By.id("sign-username");
    By username_login = By.id("loginusername");
    By password_signin = By.id("sign-password");
    By password_login = By.id("loginpassword");
    By btn_signin = By.xpath("/html/body/div[2]/div/div/div[3]/button[2]");
    By btn_login = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    By modal_login = By.id("logInModalLabel");
    By modal_signin = By.id("signInModalLabel");
    By cancel_login = By.xpath("/html/body/div[3]/div/div/div[3]/button[1]");
    By cancel_signin = By.xpath("/html/body/div[2]/div/div/div[3]/button[1]");
    By welcome = By.id("nameofuser");

    By phonecategories = By.xpath("//a[text()='Phones']");
    By laptopscategories = By.xpath("//a[text()='Laptops']");
    By monitorcategories = By.xpath("//a[text()='Monitors']");
    By phone = By.xpath("//a[text()='Samsung galaxy s6']");
    By laptop = By.xpath("//a[text()='Sony vaio i5']");
    By monitor = By.xpath(  "//a[text()='Apple monitor 24']");
    By addtocart = By.xpath("//a[text()='Add to cart']");
    By cart = By.id("cartur");
    By cartpage = By.xpath("//h2[.='Products']");
    By delete = By.xpath("//a[text()='Delete']");

    By btn_placeorder = By.xpath("//button[.='Place Order']");
    By formorder = By.xpath("//h5[text()='Place order']");
    By namefield = By.id("name");
    By country = By.id("country");
    By cityfield = By.id("city");
    By cardfield = By.id("card");
    By monthfield = By.id("month");
    By yearfield = By.id("year");
    By btn_purchase = By.xpath("    //button[.='Purchase']");

    public void openWebHomepage(){
        driver.get("https://www.demoblaze.com/index.html");
    }

    public void userClickLogin(){
        driver.findElement(login).click();
    }

    public void userSeeDialogLogin(){
        driver.findElement(modal_login).isDisplayed();
    }

    public void userSeeModalSignUp(){
        driver.findElement(modal_signin).isDisplayed();
    }

    public void userFieldUsername(String usrnm){
        driver.findElement(username_signin).sendKeys(usrnm);
    }

    public void userFieldPassword(String password){
        driver.findElement(password_signin).sendKeys(password);
    }

    public void userClickButtonLogin(){
        driver.findElement(btn_login).click();
    }

    public void userClickButtonSignUp(){
        driver.findElement(btn_signin).click();
    }

    public void userClickSignUp(){
        driver.findElement(signin).click();
    }

    public void assertErrormsg(String alert) {
        String textAlert = driver.switchTo().alert().getText();
        assertEquals(alert, textAlert);
    }

    public void userClickOkeInModal() throws InterruptedException {
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
    }

    public void userFieldUsernameWithGeneratorUsername(){
        username =generateRandomUsername();
        driver.findElement(username_signin).sendKeys(username);
    }

    public void userFieldPasswordWithGeneratorPassword(){
        pass = generateRandomPassword();
        driver.findElement(password_signin).sendKeys(pass);
    }

    public void userWillSeeHomepageWelcome(){
        driver.findElement(welcome).isDisplayed();
    }

    public void userFieldUsernameLogin(String usernamelogin){
        driver.findElement(username_login).sendKeys(usernamelogin);
    }

    public void userFieldPasswordLogin(String passwordlogin){
        driver.findElement(password_login).sendKeys(passwordlogin);
    }

    public void userClickButtonCancel(){
        driver.findElement(cancel_login).click();
    }

    public void userSeeHomepage(){
        driver.findElement(login).isDisplayed();
    }

    public void userClickButtonCancelSignUp(){
        driver.findElement(cancel_signin).click();
    }

    public void userClickPhoneCategories(){
        driver.findElement(phonecategories).click();
    }

    public void userClickLaptopsCategories(){
        driver.findElement(laptopscategories).click();
    }

    public void userClickMonitorCategories(){
        driver.findElement(monitorcategories).click();
    }

    public void userSeePhone(){
        driver.findElement(phone).isDisplayed();
    }

    public void userSeeLaptop(){
        driver.findElement(laptop).isDisplayed();
    }

    public void userSeeMonitor(){
        driver.findElement(monitor).isDisplayed();
    }

    public void userClickProduct(){
        driver.findElement(phone).click();
    }

    public void userSeeDetailProduct(){
        driver.findElement(addtocart).isDisplayed();
    }

    public void userClickAddToCart(){
        driver.findElement(addtocart).click();
    }

    public void userClickChart(){
        driver.findElement(cart).click();
    }

    public void userSeeCartPage(){
        driver.findElement(cartpage).isDisplayed();
    }

    public void userDeletItem(){
        driver.findElement(delete).click();
    }

    public void userClickPlaceOrder(){
        driver.findElement(btn_placeorder).click();
    }

    public void userSeeModalForm(){
        driver.findElement(formorder).isDisplayed();
    }

    public void userFillNameFieldWith (String name){
        driver.findElement(namefield).sendKeys(name);
    }

    public void userFillCountryFieldWith(String coun){
        driver.findElement(country).sendKeys(coun);
    }

    public void userFillCityFieldWith(String city){
        driver.findElement(cityfield).sendKeys(city);
    }

    public void userFillCreditCardFieldWith(String card){
        driver.findElement(cardfield).sendKeys(card);
    }

    public void userFillMonthFieldWith(String month){
        driver.findElement(monthfield).sendKeys(month);
    }

    public void userFillYearFieldWith(String year){
        driver.findElement(yearfield).sendKeys(year);
    }

    public void userClickPurchase(){
        driver.findElement(btn_purchase).click();
    }
}
