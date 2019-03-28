package ru.test.selenium.addressbook;

import javafx.application.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CreateNewContactTest {
    private static WebDriver driver;
    private static Properties prop = new Properties();

    @BeforeClass
    public void before() throws Exception {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("config.properties"), "windows-1251")) {
            prop.load(inputStreamReader);
        }
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/addressbook/addressbook/");
    }

    @Test
    public void main() throws InterruptedException {
        addLogin();
        Contact contact = new Contact("Kitten","Vitalii","Piggy",null);
        createNewUser(contact);

    }

    public void addLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        WebElement userName = loginPage.getUserName();
        userName.sendKeys(prop.getProperty("login"));
        WebElement pass = loginPage.getPass();
        pass.sendKeys(prop.getProperty("pass"));
        WebElement enter = loginPage.getEnter();
        enter.click();
        //  WebElement pass = loginPage.getPass();
        // pass.click();
        Thread.sleep(2000);
        driver.get("http://localhost/addressbook/addressbook/edit.php");
    }
    public void createNewUser(Contact contact) throws InterruptedException {
        CreateContactPage createContactPage = new CreateContactPage(driver);
        WebElement firstName = createContactPage.getFirstName();
        firstName.click();
        firstName.sendKeys(contact.getFirstName());
        WebElement middleName = createContactPage.getMiddleName();
        middleName.sendKeys(contact.getMiddleName());
        WebElement lastName = createContactPage.getLastName();
        lastName.sendKeys(contact.getLastName());
        WebElement enter = createContactPage.getEnter();
        enter.click();
//        WebElement openFile = createContactPage.getOpenFile();
//        openFile.click();
//        driver.switchTo().activeElement().sendKeys(
//        "C:\\Users\\lilyi\\Desktop\\Стек автотестирования.png");
    }



}
