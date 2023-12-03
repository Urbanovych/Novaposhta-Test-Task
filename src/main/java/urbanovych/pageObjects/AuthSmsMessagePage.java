package urbanovych.pageObjects;

import urbanovych.action.click.ClickHelper;

public class AuthSmsMessagePage {

    private static final String acceptSmsMessageId = "com.google.android.gms:id/positive_button";

    public static void clickAcceptButton() {
        ClickHelper.makeClickById(acceptSmsMessageId);
    }

}
