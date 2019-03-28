package ru.test.selenium.addressbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {

    @FindBy(css= "#content > form > input[type=\"text\"]:nth-child(6)")
    private WebElement FirstName;
    @FindBy(css = "#content > form > input[type=\"text\"]:nth-child(9)")
    private WebElement MiddleName;
    @FindBy(css= "#content > form > input[type=\"text\"]:nth-child(13)")
    private WebElement LastName;
    @FindBy(css= "#content > form > input[type=\"file\"]:nth-child(19)")
    private WebElement OpenFile;
    @FindBy(css= " #content > form > input[type=\"submit\"]:nth-child(1)")
    private WebElement Enter;

    public CreateContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getFirstName() {
        return FirstName;
    }

    public WebElement getMiddleName() {
        return MiddleName;
    }
    public WebElement getLastName(){
        return LastName;
    }
    public WebElement getOpenFile(){
        return OpenFile;
    }
    public WebElement getEnter() {
        return Enter;
    }
}