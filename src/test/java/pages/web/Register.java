package pages.web;

import org.openqa.selenium.By;
import static helper.Utility.driver;
import static org.junit.Assert.assertFalse;

public class Register {
    By input_userName_signUp = By.id("sign-username");
    By input_password_signUp = By.id("sign-password");
    By button_signup = By.xpath("//button[@onclick='register()'][normalize-space()='Sign up']");
    By sign_up_popup = By.xpath("//div[@id='signInModal'] /child::div[@class='modal-dialog'] /child:: div[@class='modal-content']");
    By button_close_signup = By.xpath("//div[@id='signInModal']//button[@class='btn btn-secondary'][normalize-space()='Close']");
    By button_x_signup = By.xpath("//div[@id='signInModal']//span[@aria-hidden='true']");

    public void verifySignUpPopUp() {
        driver.findElement(sign_up_popup).isDisplayed();
    }

    public void inputUnregisUsername(String username) {
        driver.findElement(input_userName_signUp).sendKeys(username);
    }

    public void inputUnregisPassword(String password) {
        driver.findElement(input_password_signUp).sendKeys(password);
    }

    public void clickSignUpButton() {
        driver.findElement(button_signup).click();
    }

    public void inputRegisterUsername(String username) {
        driver.findElement(input_userName_signUp).sendKeys(username);
    }

    public void inputRegisterPassword(String password) {
        driver.findElement(input_password_signUp).sendKeys(password);
    }

    public void verifySignUpPopUpNotDisplayed() {
        assertFalse(driver.findElement(sign_up_popup).isDisplayed());
    }

    public void closeRegisButton() {
        driver.findElement(button_close_signup).click();
    }

    public void closeRegisClickXButton() {
        driver.findElement(button_x_signup).click();
    }
}
