package urbanovych.pageObjects;

import urbanovych.action.click.ClickHelper;
import urbanovych.action.text.TextHelper;

public class AuthPhoneNumberPage {

    private static final String phoneNumberPlaceholderId = "ua.novaposhtaa:id/write_email";
    private static final String acceptButtonId = "ua.novaposhtaa:id/oauth_button_login";

    public static void sendPhoneNumber(String number) {
        TextHelper.sendKeysById(phoneNumberPlaceholderId, number);
    }

    public static void clickAcceptButton() {
        ClickHelper.makeClickById(acceptButtonId);
    }

}
