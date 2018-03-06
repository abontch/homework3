package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
    private WebDriver driver;
    private By categoryMenuItemLocator = By.id("subtab-AdminCategories");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCategorySubMenu() {
        //WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(categoryMenuItemLocator));
        WebElement subMenu = driver.findElement(categoryMenuItemLocator);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", subMenu);
    }

}
