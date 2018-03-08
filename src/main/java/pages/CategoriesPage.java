package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesPage {
    private WebDriver driver;
    private By addCategoryBtnLocator = By.id("page-header-desc-category-new_category");
    private By categoryNameFieldLocator = By.id("name_1");
    private By saveNewCategoryBtnLocator = By.id("category_form_submit_btn");
    private By categoryPageContentLocator = By.id("content");
    private By categoryNameFilterLocator = By.cssSelector("[name~=categoryFilter_name]");
    private By categoryNameCellLocator = By.xpath("//*[@id=\"tr_2_14_1\"]/td[3]");
    private String categoryName;

    public CategoriesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAddCategoryButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(addCategoryBtnLocator));

        WebElement addCategoryBtn = driver.findElement(addCategoryBtnLocator);
        addCategoryBtn.click();

       /* Actions actions = new Actions(driver);
        actions.moveToElement(categoryMenuItem).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(categoriesSubMenuLocator));

        categoryMenuItem.findElements(By.cssSelector("li")).get(1).click();

        //JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click()", subMenu);
        */
    }

    public void enterNewCategoryName(String name) {
        categoryName = name;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(categoryNameFieldLocator));

        WebElement categoryNameField = driver.findElement(categoryNameFieldLocator);
        categoryNameField.sendKeys(categoryName);
    }

    public void clickOnSaveNewCategoryButton() {
        WebElement saveCategoryBtn = driver.findElement(saveNewCategoryBtnLocator);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", saveCategoryBtn);
        saveCategoryBtn.click();
    }

    public void checkSavedCategory() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(categoryPageContentLocator));

        WebElement nameFilter = driver.findElement(categoryNameFilterLocator);
        nameFilter.sendKeys(categoryName);

        WebElement searchBtn = driver.findElement(By.cssSelector("button#submitFilterButtoncategory"));
        searchBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(categoryNameCellLocator));
        String categoryString = driver.findElement(categoryNameCellLocator).getText();
        if (categoryString.length() > 0 && categoryString.equals(categoryName)) {
            System.out.println("The category \"" + categoryString + "\" was created successfully");
        } else {
            System.out.println("The category \"" + categoryString + "\" was not found");
        }

    }


}
