package urbanovych.pageObjects;

import urbanovych.action.click.ClickHelper;
import urbanovych.action.text.TextHelper;

public class CustomerBarcodePage {

    private static final String phoneNumberId = "ua.novaposhtaa:id/txt_loyalty_card_phone";

    public static String getPhoneNumber() {
        return TextHelper.getTextById(phoneNumberId);
    }
}
