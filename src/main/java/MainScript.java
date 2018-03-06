import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;


public class MainScript extends BaseScript {
    public static void main(String[] args) {

        WebDriver driver = getConfiguredDriver();
        // login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.enterEmail();
        loginPage.enterPwd();
        loginPage.clickLoginBtn();

        // create category
        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.clickOnCategorySubMenu();

        // check that new category appears in Categories table


        // finish script
       // quiteDriver(driver);
    }
}
