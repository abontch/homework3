import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler implements WebDriverEventListener {

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Open url: " + s);
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Search for element: " + by.toString());
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Element found successfully");
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Click on element: " + webElement.getTagName() + " "  + webElement.getAttribute("name"));
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("The element was clicked");
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Fill input " + webElement.getAttribute("id") + " with value " + charSequences.toString());
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Value successfully changed");
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
