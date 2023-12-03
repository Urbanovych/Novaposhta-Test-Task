package urbanovych.action.text;

import urbanovych.action.wait.WaitHelper;

public class TextHelper {

    public static void sendKeysById(String idLocator, String keys) {
        WaitHelper.getVisibleElementById(idLocator).sendKeys(keys);
    }

    public static void sendKeysByXpath(String xpathLocator, String keys) {
        WaitHelper.getVisibleElementByXpath(xpathLocator).sendKeys(keys);
    }

    public static String getTextById(String idLocator) {
        return WaitHelper.getVisibleElementById(idLocator).getText();
    }
}
