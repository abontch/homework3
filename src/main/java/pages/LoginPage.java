package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Properties;


public class LoginPage {
    private WebDriver driver;
    private By fieldEmail = By.id("email");
    private By fieldPwd = By.id("passwd");
    private By buttonLogin = By.name("submitLogin");
    private String email = "webinar.test@gmail.com";
    private String pwd = "Xcg7299bnSmMuRLp9ITw";

    public LoginPage( WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(Properties.getBaseAdminUrl());
    }

    public void enterEmail() {
        driver.findElement(fieldEmail).sendKeys(email);
    }

    public void enterPwd() {
        driver.findElement(fieldPwd).sendKeys(pwd);
    }

    public void clickLoginBtn() {
        driver.findElement(buttonLogin).click();
    }
}
