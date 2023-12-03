package urbanovych.pageObjects;

import urbanovych.action.click.ClickHelper;
import urbanovych.action.text.TextHelper;

public class AuthPasswordPage {

    private static final String passwordPlaceholderXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText";
    private static final String acceptButtonXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.Button[1]";

    public static void sendPassword(String password) {
        TextHelper.sendKeysByXpath(passwordPlaceholderXpath, password);
    }

    public static void clickAcceptButton() {
        ClickHelper.makeClickByXpath(acceptButtonXpath);
    }

}
