package WebTest.StepDef;

import WebTest.Pages.WebPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class WebStepdef {
    WebPage webPage;

    public WebStepdef(){
        this.webPage = new WebPage();
    }

    @Given("open web homepage")
    public void openWebHomepage() {
        webPage.openWebHomepage();
    }

    @And("user click login")
    public void userClickLogin() {
        webPage.userClickLogin();
    }

    @And("user see modal login")
    public void userSeeModalLogin() {
        webPage.userSeeDialogLogin();
    }

    @And("user click button login")
    public void userClickButtonLogin() {
        webPage.userClickButtonLogin();
    }

    @And("user will see error massage {string}")
    public void userWillSeeErrorMassage(String alert) {
        webPage.assertErrormsg(alert);
    }

    @And("user will see massage {string}")
    public void userWillSeeMassage(String alert) {
        webPage.assertErrormsg(alert);
    }

    @And("user click oke in modal")
    public void userClickOkeInModal() throws InterruptedException{
        webPage.userClickOkeInModal();
    }

    @And("user click sign up")
    public void userClickSignUp() {
        webPage.userClickSignUp();
    }

    @And("user see modal sign up")
    public void userSeeModalSignUp() {
        webPage.userSeeModalSignUp();
    }

    @And("user click button sign up")
    public void userClickButtonSignUp() {
        webPage.userClickButtonSignUp();
    }

    @And("user field username login {string}")
    public void userFieldUsernameLogin(String usernamelogin) {
        webPage.userFieldUsernameLogin(usernamelogin);
    }

    @And("user field password login {string}")
    public void userFieldPasswordLogin(String passwordlogin) {
        webPage.userFieldPasswordLogin(passwordlogin);
    }

    @And("user will see homepage welcome")
    public void userWillSeeHomepageWelcome() {
        webPage.userWillSeeHomepageWelcome();
    }

    @And("user field username with generator username")
    public void userFieldUsernameWithGeneratorUsername() {
        webPage.userFieldUsernameWithGeneratorUsername();
    }

    @And("user field password with generator password")
    public void userFieldPasswordWithGeneratorPassword() {
        webPage.userFieldPasswordWithGeneratorPassword();
    }


    @And("user field username {string}")
    public void userFieldUsername(String usrnm) {
        webPage.userFieldUsername(usrnm);
    }

    @And("user field password {string}")
    public void userFieldPassword(String password) {
        webPage.userFieldPassword(password);
    }

    @And("user click button cancel")
    public void userClickButtonCancel() {
        webPage.userClickButtonCancel();
    }

    @And("user see homepage")
    public void userSeeHomepage() {
        webPage.userSeeHomepage();
    }

    @And("user click button cancel sign up")
    public void userClickButtonCancelSignUp() {
        webPage.userClickButtonCancelSignUp();
    }

    @And("user click phone categories")
    public void userClickPhoneCategories() {
        webPage.userClickPhoneCategories();
    }

    @And("user click laptops categories")
    public void userClickLaptopsCategories() {
        webPage.userClickLaptopsCategories();
    }

    @And("User click monitor categories")
    public void userClickMonitorCategories() {
        webPage.userClickMonitorCategories();
    }

    @And("user see phone")
    public void userSeePhone() throws InterruptedException {
        Thread.sleep(5000);
        webPage.userSeePhone();
    }

    @And("user see laptop")
    public void userSeeLaptop() {
        webPage.userSeeLaptop();
    }

    @And("user see monitor")
    public void userSeeMonitor() {
        webPage.userSeeMonitor();
    }

    @And("user click product")
    public void userClickProduct() {
        webPage.userClickProduct();
    }

    @And("user see detail product")
    public void userSeeDetailProduct() {
        webPage.userSeeDetailProduct();
    }

    @And("user click add to cart")
    public void userClickAddToCart() {
        webPage.userClickAddToCart();
    }

    @And("user click chart")
    public void userClickChart() throws InterruptedException {
        Thread.sleep(5000);
        webPage.userClickChart();
    }

    @And("user see cart page")
    public void userSeeCartPage() {
        webPage.userSeeCartPage();
    }

    @And("user delet item")
    public void userDeletItem() throws InterruptedException {
        Thread.sleep(5000);
        webPage.userDeletItem();
    }

    @And("user click place order")
    public void userClickPlaceOrder() {
        webPage.userClickPlaceOrder();
    }

    @And("user see modal form")
    public void userSeeModalForm() {
        webPage.userSeeModalForm();
    }

    @And("user fill name field with {string}")
    public void userFillNameFieldWith(String name) {
        webPage.userFillNameFieldWith(name);
    }

    @And("user fill country field with {string}")
    public void userFillCountryFieldWith(String coun) {
        webPage.userFillCountryFieldWith(coun);
    }

    @And("user fill city field with {string}")
    public void userFillCityFieldWith(String city) {
        webPage.userFillCityFieldWith(city);
    }

    @And("user fill credit card field with {string}")
    public void userFillCreditCardFieldWith(String card) {
        webPage.userFillCreditCardFieldWith(card);
    }

    @And("user fill month field with {string}")
    public void userFillMonthFieldWith(String month) {
        webPage.userFillMonthFieldWith(month);
    }

    @And("user fill year field with {string}")
    public void userFillYearFieldWith(String year) {
        webPage.userFillYearFieldWith(year);
    }

    @And("user click purchase")
    public void userClickPurchase() {
        webPage.userClickPurchase();
    }
}
