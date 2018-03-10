package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utils.Properties;


public class LoginPage {
    EventFiringWebDriver driver;
    private By emailFieldLocator = By.id("email");
    private By passwordFieldLocator = By.id("passwd");
    private By loginButtonLocator = By.name("submitLogin");
    private String email = "webinar.test@gmail.com";
    private String pwd = "Xcg7299bnSmMuRLp9ITw";

    public LoginPage( EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(Properties.getBaseAdminUrl());
    }

    public void enterEmail() {
        driver.findElement(emailFieldLocator).sendKeys(email);
    }

    public void enterPwd() {
        driver.findElement(passwordFieldLocator).sendKeys(pwd);
    }

    public void clickLoginBtn() {
        driver.findElement(loginButtonLocator).click();
    }
}
