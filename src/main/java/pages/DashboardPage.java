package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DashboardPage {
    private EventFiringWebDriver driver;
    private By categoryMenuLocator = By.id("subtab-AdminCatalog");
    private By categoriesSubMenuLocator = By.id("subtab-AdminCategories");

    public DashboardPage(EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCategoriesSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(categoryMenuLocator));

        WebElement categoryMenuItem = driver.findElement(categoryMenuLocator);
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryMenuItem).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(categoriesSubMenuLocator));

        categoryMenuItem.findElements(By.cssSelector("li")).get(1).click();
    }

}
