package ru.test.selenium.addressbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(css= "#LoginForm > input:nth-child(2)")
    private WebElement userName;
    @FindBy(css = "#LoginForm > input[type=\"password\"]:nth-child(5)")
    private WebElement pass;
    @FindBy(css= "#LoginForm > input[type=\"submit\"]:nth-child(7)")
    private WebElement enter;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPass() {
        return pass;
    }
    public WebElement getEnter(){
        return enter;
    }
}
