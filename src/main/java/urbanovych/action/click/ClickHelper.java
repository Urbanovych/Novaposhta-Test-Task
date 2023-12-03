package urbanovych.action.click;

import urbanovych.action.wait.WaitHelper;

public class ClickHelper {

    public static void makeClickById(String idLocator) {
        WaitHelper.getVisibleElementById(idLocator).click();
    }

    public static void makeClickByXpath(String xpathLocator) {
        WaitHelper.getVisibleElementByXpath(xpathLocator).click();
    }
}
