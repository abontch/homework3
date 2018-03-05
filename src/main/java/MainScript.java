import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class MainScript  extends BaseScript {
    public static void main(String[] args) {
        // TODO prepare driver object
        // WebDriver driver = getConfiguredDriver();
        // ...
        WebDriver driver = getConfiguredDriver();
        // login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.enterEmail();
        loginPage.enterPwd();
        loginPage.clickLoginBtn();
        // create category

        // check that new category appears in Categories table
        quiteDriver(driver);
        // finish script
    }
}
