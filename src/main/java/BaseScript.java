import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utils.Properties;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseScript {

    public static WebDriver getDriver() {
        String browser = Properties.getBrowser();
        switch (browser) {
            case "firefox":
                System.setProperty(
                        "webdriver.gecko.driver",
                        new File(BaseScript.class.getResource("/geckodriver.exe").getFile()).getPath());
                return new FirefoxDriver();
            case "ie":
            case "internet explorer":
                System.setProperty(
                        "webdriver.ie.driver",
                        new File(BaseScript.class.getResource("/IEDriverServer.exe").getFile()).getPath());
                return new InternetExplorerDriver();
            case "chrome":
            default:
                System.setProperty(
                        "webdriver.chrome.driver",
                        new File(BaseScript.class.getResource("/chromedriver.exe").getFile()).getPath());
                return new ChromeDriver();
        }
    }

    public static EventFiringWebDriver getConfiguredDriver() {
        //WebDriver driver = getDriver();
        EventFiringWebDriver driver = new EventFiringWebDriver(getDriver());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.register(new EventHandler());
        return driver;
    }

    public static void quiteDriver(WebDriver driver) { driver.quit(); }
}
