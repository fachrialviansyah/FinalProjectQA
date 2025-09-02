package pages.web;

import helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.Utility.driver;
import static org.junit.Assert.assertEquals;

public class HomePage {
    By menu_signup = By.id("signin2");
    By menu_login = By.id("login2");
    By menu_signout = By.id("logout2");
    By menu_contact = By.xpath("//a[.='Contact']");
    By menu_aboutus = By.xpath("//a[.='About us']");
    By menu_cart = By.id("cartur");
    By phone_category = By.xpath("//a[.='Phones']");
    By laptop_category = By.xpath("//a[.='Laptops']");
    By monitor_category = By.xpath("//a[.='Monitors']");
    By welcome_user(String name) {
        return By.xpath("//a[@id='nameofuser' and text()='" + name + "']");
    }
    By title_item_displayed(String titleName){
        return By.xpath("//h4[@class='card-title'] /child :: a[normalize-space()='" +titleName+ "']");
    }

    public void goToStorePage() {
        driver.get("https://www.demoblaze.com/");
    }

    public void ClickMenuSignUp() {
        driver.findElement(menu_signup).click();
    }

    public void verifyAlertMessage(String alertMessage) {
        WebDriverWait wait = new WebDriverWait(Utility.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        String actualAlertMessage = driver.switchTo().alert().getText();

        driver.switchTo().alert().accept();
        assertEquals(alertMessage, actualAlertMessage);
    }

    public void clickSignInMenu() {
        driver.findElement(menu_login).click();
    }

    public void verifyUserLoggedIn(String name) {
        WebDriverWait wait = new WebDriverWait(Utility.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

        WebElement nameDisplayed;
        nameDisplayed = driver.findElement(welcome_user(name));

        assertEquals(name, nameDisplayed.getText());
    }

    public void clickMenuContact() {
        driver.findElement(menu_contact).click();
    }

    public void clickMenuAboutUs() {
        driver.findElement(menu_aboutus).click();
    }

    public void clickPhoneCategory() {
        driver.findElement(phone_category).click();
    }

    public void clickLaptopsCategory() {
        driver.findElement(laptop_category).click();
    }

    public void clickMonitorsCategory() {
        driver.findElement(monitor_category).click();
    }

    public void verifyUserSeeOneOfProducts(String itemName) {
        WebElement ItemDisplayedElement;
        ItemDisplayedElement = driver.findElement(title_item_displayed(itemName));
        assertEquals(itemName, ItemDisplayedElement.getText());
    }

    public void clickPhonesCategories() {
        driver.findElement(phone_category).click();
    }

    public void clickProduct(String nameProduct) {
        WebDriverWait wait = new WebDriverWait(Utility.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(title_item_displayed(nameProduct)));

        driver.findElement(title_item_displayed(nameProduct)).click();
    }

    public void menucart() {
        driver.findElement(menu_cart).click();
    }

    public void clickLogOutMenu() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Utility.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout2\"]")));
        Thread.sleep(2000);
        driver.findElement(menu_signout).click();
    }

    public void logOutSuccess() {
        driver.findElement(menu_signup).isDisplayed();
    }

    public void userClickMenuLogOut() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Utility.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout2\"]")));
        Thread.sleep(2000);
        driver.findElement(menu_signout).click();
    }
}
