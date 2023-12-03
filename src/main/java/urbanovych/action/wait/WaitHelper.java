package urbanovych.action.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static urbanovych.BaseTest.getWait;

public class WaitHelper {

    public static WebElement getVisibleElementById(String idLocator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id(idLocator)));
    }

    public static WebElement getVisibleElementByXpath(String xpathLocator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));
    }
}
