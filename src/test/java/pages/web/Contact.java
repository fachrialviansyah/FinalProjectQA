package pages.web;

import org.openqa.selenium.By;

import static helper.Utility.driver;
import static org.junit.Assert.assertFalse;

public class Contact {
    By contact_popup = By.xpath("//div[@id='exampleModal'] /child::div[@class='modal-dialog'] /child:: div[@class='modal-content']");
    By input_contact_email = By.id("recipient-email");
    By input_contact_name = By.id("recipient-name");
    By input_message = By.id("message-text");
    By button_send_message = By.xpath("//button[@onclick='send()' and text()='Send message']");
    By button_close_contact = By.xpath("//div[@id='exampleModal']//button[@class='btn btn-secondary'][normalize-space()='Close']");
    By button_x_contact = By.xpath("//div[@id='exampleModal']//span[@aria-hidden='true']");

    public void verifyContactPopUp() {
        driver.findElement(contact_popup).isDisplayed();
    }

    public void inputContactEmail(String email) {
        driver.findElement(input_contact_email).sendKeys(email);
    }

    public void inputContactName(String name) {
        driver.findElement(input_contact_name).sendKeys(name);
    }

    public void inputMessage(String message) {
        driver.findElement(input_message).sendKeys(message);
    }

    public void clickSendMessageButton() {
        driver.findElement(button_send_message).click();
    }

    public void clickCloseContactButton() {
        driver.findElement(button_close_contact).click();
    }

    public void clickXContactButton() {
        driver.findElement(button_x_contact).click();
    }

    public void verifyContactPopUpNotDisplayed() {
        assertFalse(driver.findElement(contact_popup).isDisplayed());
    }
}
