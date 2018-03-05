import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utils.Properties;

import java.io.File;

public class BaseScript {
    /**
     *
     * @return New instance of {@link WebDriver} object. Driver type is based on passed parameters
     * to the automation project, returns {@link ChromeDriver} instance by default.
     */
    public static WebDriver getDriver() {
        String browser = Properties.getBrowser();
        switch (browser) {
            // TODO prepare required WebDriver instance according to browser type
            default:
                System.setProperty(
                        "webdriver.chrome.driver",
                        new File(BaseScript.class.getResource("/chromedriver.exe").getFile()).getPath());
                return new ChromeDriver();
        }
    }

    /**
     * Creates {@link WebDriver} instance with timeout and browser window configurations.
     *
     * @return New instance of {@link EventFiringWebDriver} object. Driver type is based on passed parameters
     * to the automation project, returns {@link ChromeDriver} instance by default.
     */
    public static WebDriver getConfiguredDriver() {
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        return driver;
        // TODO configure browser window (set timeouts, browser pindow position) and connect loggers.
        //throw new UnsupportedOperationException("Method doesn't return configured WebDriver instance");
    }

    public static void quiteDriver(WebDriver driver) { driver.quit(); }
}
