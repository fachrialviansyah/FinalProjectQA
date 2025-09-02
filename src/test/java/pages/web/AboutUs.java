package pages.web;

import org.openqa.selenium.By;

import static helper.Utility.driver;
import static org.junit.Assert.assertFalse;

public class AboutUs {
    By aboutus_popup = By.xpath("//div[@id='videoModal'] /child::div[@class='modal-dialog'] /child:: div[@class='modal-content']");
    By button_not_play_video = By.xpath("//div[@id='videoModal']//div[@id='example-video']");
    By button_x_aboutus = By.xpath("//div[@id='videoModal']//span[@aria-hidden='true']");
    By button_close_video = By.xpath("//div[@id='videoModal']//button[@class='btn btn-secondary'][normalize-space()='Close']");


    public void verifyAboutUsPopUp() {
        driver.findElement(aboutus_popup).isDisplayed();
    }

    public void canNotButtonPlayInVideo() {
        driver.findElement(button_not_play_video).isDisplayed();
    }

    public void verifyAboutusPopUpNotDisplayed() {
        assertFalse(driver.findElement(aboutus_popup).isDisplayed());
    }

    public void clickCloseAboutUsButton() {
        driver.findElement(button_close_video).click();
    }

    public void clickXAboutUsButton() {
        driver.findElement(button_x_aboutus).click();
    }
}
