package urbanovych.pageObjects;

import urbanovych.action.click.ClickHelper;

public class MainPage {

    private static final String barcodeId = "ua.novaposhtaa:id/iv_trigger_barcode";

    public static void clickBarcode() {
        ClickHelper.makeClickById(barcodeId);
    }

}
