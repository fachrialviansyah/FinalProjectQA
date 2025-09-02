package stepdef.web;

import helper.Utility;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.web.*;

import java.time.Duration;

public class WebStep {

    public WebStep() {
        this.register = new Register();
        this.login = new Login();
        this.homepage = new HomePage();
        this.contact = new Contact();
        this.aboutUs = new AboutUs();
        this.cart = new Cart();
    }

    Register register;
    Login login;
    HomePage homepage;
    Contact contact;
    AboutUs aboutUs;
    Cart cart;

    @Given("user is on web home page")
    public void userIsOnWebHomePage() throws InterruptedException {
        homepage.goToStorePage();
        Thread.sleep(2000);
    }

    @And("user click menu sign up")
    public void userClickMenuSignUp() {
        homepage.ClickMenuSignUp();
    }

    @And("showing verify pop-up sign up user")
    public void showingVerifyPopUpSignUpUser() throws InterruptedException {
        register.verifySignUpPopUp();
        Thread.sleep(2000);
    }

    @When("user input sign up username unregistered")
    public void userInputSignUpUsernameUnregistered() throws InterruptedException {
        String username = Utility.generateRandomData();
        register.inputUnregisUsername(username);
        Thread.sleep(2000);
    }

    @And("user input sign up password unregistered")
    public void userInputSignUpPasswordUnregistered() throws InterruptedException {
        String password = Utility.generateRandomData();
        register.inputUnregisPassword(password);
        Thread.sleep(2000);
    }

    @And("user click sign up button")
    public void userClickSignUpButton() throws InterruptedException {
        register.clickSignUpButton();
        Thread.sleep(2000);
    }

    @Then("verify display alert message {string}")
    public void verifyDisplayAlertMessage(String alertMessage) throws InterruptedException {
        homepage.verifyAlertMessage(alertMessage);
        Thread.sleep(2000);
    }

    @When("user input sign up username {string}")
    public void userInputSignUpUsername(String username) throws InterruptedException {
        register.inputRegisterUsername(username);
        Thread.sleep(1000);
    }

    @And("user input sign up password {string}")
    public void userInputSignUpPassword(String Password) throws InterruptedException {
        register.inputRegisterPassword(Password);
        Thread.sleep(1000);
    }

    @When("user click close register button")
    public void userClickCloseButton() throws InterruptedException {
        Thread.sleep(1000);
        register.closeRegisButton();
    }

    @When("user click close login button")
    public void userClickCloseLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        login.clickCloseLoginButton();
    }

    @Then("verify the sign up pop-up is not displayed")
    public void verifyTheSignUpPopUpIsNotDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        register.verifySignUpPopUpNotDisplayed();
    }

    @When("user click X register button")
    public void userClickXButton() throws InterruptedException {
        Thread.sleep(1000);
        register.closeRegisClickXButton();
    }

    @When("user click X login button")
    public void userClickXLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        login.closeLoginClickXButton();
    }

    @And("showing verify pop-up log in user")
    public void showingVerifyPopUpLogInUser() throws InterruptedException {
        login.verifySignUpPopUp();
        Thread.sleep(2000);
    }

    @And("user click log in button")
    public void userClickLogInButton() throws InterruptedException {
        login.clickLoginButton();
        Thread.sleep(2000);
    }

    @Then("validation user has been logged in {string}")
    public void validationUserHasBeenLoggedIn(String name) {
        homepage.verifyUserLoggedIn(name);
    }

    @And("user click menu log in")
    public void userClickMenuLogIn() {
        homepage.clickSignInMenu();
    }

    @When("user input log in username {string}")
    public void userInputLogInUsername(String username) throws InterruptedException {
        Thread.sleep(1000);
        login.inputLoginUsername(username);
    }

    @When("user input log in password {string}")
    public void userInputLogInPassword(String password) throws InterruptedException {
        Thread.sleep(1000);
        login.inputLoginPassword(password);
    }

    @Then("verify the log in pop-up is not displayed")
    public void verifyTheLogInPopUpIsNotDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        login.verifyLoginPopUpNotDisplayed();
    }

    @And("user click menu contact")
    public void userClickMenuContact() {
        homepage.clickMenuContact();
    }

    @And("showing verify pop-up new message")
    public void showingVerifyPopUpNewMessage() throws InterruptedException {
        contact.verifyContactPopUp();
        Thread.sleep(2000);
    }

    @And("input contact email {string}")
    public void inputContactEmail(String email) throws InterruptedException {
        contact.inputContactEmail(email);
        Thread.sleep(1000);
    }

    @And("input contact name {string}")
    public void inputContactName(String name) throws InterruptedException {
        contact.inputContactName(name);
        Thread.sleep(1000);
    }

    @And("input message {string}")
    public void inputMessage(String message) throws InterruptedException {
        contact.inputMessage(message);
        Thread.sleep(1000);
    }

    @When("user click send message button")
    public void userClickSendMessageButton() {
        contact.clickSendMessageButton();
    }

    @When("user click close contact button")
    public void userClickCloseContactButton() {
        contact.clickCloseContactButton();
    }

    @When("user click X contact button")
    public void userClickXContactButton() {
        contact.clickXContactButton();
    }

    @When("user click close cart button")
    public void userClickCloseCartButton() {
        cart.clickCloseCartButton();
    }

    @When("user click X cart button")
    public void userClickXCartButton() {
        cart.clickXCartButton();
    }

    @Then("verify user has been send message {string}")
    public void verifyUserHasBeenSendMessage(String alertMessage) {
        homepage.verifyAlertMessage(alertMessage);
    }

    @Then("verify the new message pop-up is not displayed")
    public void verifyTheNewMessagePopUpIsNotDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        contact.verifyContactPopUpNotDisplayed();
    }


    @And("user click menu about us")
    public void userClickMenuAboutUs() {
        homepage.clickMenuAboutUs();
    }

    @And("showing verify pop-up about us")
    public void showingVerifyPopUpAboutUs() throws InterruptedException {
        aboutUs.verifyAboutUsPopUp();
        Thread.sleep(2000);
    }

    @When("user can not button play in video")
    public void userCanNotButtonPlayInVideo() {
        aboutUs.canNotButtonPlayInVideo();
    }

    @When("user click close about us button")
    public void userClickCloseAboutUsButton() {
        aboutUs.clickCloseAboutUsButton();
    }

    @When("user click X about us button")
    public void userClickXAboutUsButton() {
        aboutUs.clickXAboutUsButton();
    }

    @Then("verify display message {string}")
    public void verifyDisplayMessage(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("verify the menu about us pop-up is not displayed")
    public void verifyTheMenuAboutUsPopUpIsNotDisplayed() throws InterruptedException {
        Thread.sleep(500);
        aboutUs.verifyAboutusPopUpNotDisplayed();
    }

    @Then("user can see one of the products {string}")
    public void userCanSeeOneOfTheProducts(String itemName) throws InterruptedException {
        Thread.sleep(2000);
        homepage.verifyUserSeeOneOfProducts(itemName);
    }

    @When("user click phone category")
    public void userClickPhoneCategory() {
        homepage.clickPhoneCategory();
    }

    @When("user click laptops category")
    public void userClickLaptopsCategory() {
        homepage.clickLaptopsCategory();
    }

    @When("user click monitors category")
    public void userClickMonitorsCategory() {
        homepage.clickMonitorsCategory();
    }

    @When("user click phones category")
    public void userClickPhonesCategory() throws InterruptedException {
        Thread.sleep(2000);
        homepage.clickPhonesCategories();
    }

    @And("user click product {string}")
    public void userClickProduct(String nameProduct) {
        homepage.clickProduct(nameProduct);

        WebDriverWait wait = new WebDriverWait(Utility.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-success btn-lg' and text()='Add to cart']")));
    }

    @And("user click add to cart")
    public void userClickAddToCart() throws InterruptedException {
        cart.clickButtonAddCart();
        Thread.sleep(3000);
    }

    @And("user go to menu cart")
    public void userGoToMenuCart() throws InterruptedException {
        homepage.menucart();
        Thread.sleep(2000);
    }

    @Then("verify product already added the cart page {string}")
    public void verifyProductAlreadyAddedTheCartPage(String itemAddedName) throws InterruptedException {
        cart.verifyProductAddedToCart(itemAddedName);
        Thread.sleep(3000);
    }

    @And("verify user can see total price")
    public void verifyUserCanSeeTotalPrice() {
        cart.verifyTotalPrice();
    }

    @And("user back to home page")
    public void userBackToHomePage() {
        homepage.goToStorePage();
    }

    @And("user click button delete for {string}")
    public void userClickButtonDeleteFor(String productToBeDeleted) throws InterruptedException {
        cart.deleteProductButton(productToBeDeleted);
        Thread.sleep(3000);
    }

    @Then("product successfully deleted from cart")
    public void productSuccessfullyDeletedFromCart() throws InterruptedException {
        Thread.sleep(2500);
        cart.verifyProductDeleted();
    }

    @And("user click button place order")
    public void userClickButtonPlaceOrder() {
        cart.placeOrderButton();
    }

    @And("showing verify order from pop-up displayed")
    public void showingVerifyOrderFromPopUpDisplayed() throws InterruptedException {
        cart.verifyOrderFormPopUp();
        Thread.sleep(2000);
    }

    @And("user input name {string}")
    public void userInputName(String name) throws InterruptedException {
        cart.userInputName(name);
        Thread.sleep(1000);
    }

    @And("user input country {string}")
    public void userInputCountry(String country) throws InterruptedException {
        cart.userInputCountry(country);
        Thread.sleep(1000);
    }

    @And("user input city {string}")
    public void userInputCity(String city) throws InterruptedException {
        cart.userInputCity(city);
        Thread.sleep(1000);
    }

    @And("user input credit card {string}")
    public void userInputCreditCard(String cc) throws InterruptedException {
        cart.userInputCreditCard(cc);
        Thread.sleep(1000);
    }

    @And("user input month {string}")
    public void userInputMonth(String month) throws InterruptedException {
        cart.userInputMonth(month);
        Thread.sleep(1000);
    }

    @And("user input year {string}")
    public void userInputYear(String year) throws InterruptedException {
        cart.userInputYear(year);
        Thread.sleep(1000);
    }

    @And("user click purchase button")
    public void userClickPurchaseButton() {
        cart.clickPurchaseButton();
    }

    @Then("user see the pop-up successfully order")
    public void userSeeThePopUpSuccessfullyOrder() throws InterruptedException {
        cart.verifyPopUpSuccessfullyOrder();
        Thread.sleep(2000);
    }

    @And("user click OK button on the pop-up successfully order")
    public void userClickOKButtonOnThePopUpSuccessfullyOrder() {
        cart.clickOkButtonSuccessOrder();
    }

    @And("user click menu cart")
    public void userClickMenuCart() throws InterruptedException {
        homepage.menucart();
        Thread.sleep(1000);
    }

    @And("user click place order button")
    public void userClickPlaceOrderButton() {
        cart.placeOrderButton();
    }

    @And("showing verify pop-up form place order")
    public void showingVerifyPopUpFormPlaceOrder() throws InterruptedException {
        cart.verifyOrderFormPopUp();
        Thread.sleep(1000);
    }

    @Then("verify form place order pop-up is not displayed")
    public void verifyFormPlaceOrderPopUpIsNotDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        cart.verifyOrderPopUpNotDisplayed();
    }

    @And("user has been logged in")
    public void userHasBeenLoggedIn() throws InterruptedException {
        userClickMenuLogIn();
        verifyTheLogInPopUpIsNotDisplayed();
        userInputLogInUsername("fachri");
        userInputLogInPassword("fachri12345");
        userClickLogInButton();
        Thread.sleep(4000);

        System.out.println("nice");
    }

    @When("user click menu log out")
    public void userClickMenuLogOut() throws InterruptedException {
        homepage.userClickMenuLogOut();
    }

    @Then("user successfully logged out")
    public void userSuccessfullyLoggedOut() throws InterruptedException {
        Thread.sleep(2000);
        homepage.logOutSuccess();
    }

}
