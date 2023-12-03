package urbanovych;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import urbanovych.pageObjects.*;

import java.io.IOException;
import java.util.Properties;

import static urbanovych.properties.PropertiesHelper.getPropertiesFromPath;

public class MainNovaPoshtaTests extends BaseTest {

    private static String number;
    private static String password;

    @BeforeAll
    public static void getAuthInfo() throws IOException {
        Properties androidDriverProperties = getPropertiesFromPath("src/main/resources/appAuthorization.properties");
        number = androidDriverProperties.getProperty("number");
        password = androidDriverProperties.getProperty("password");
    }

    @Description("Auth + Open barcode")
    @Test
    public void authPositiveTest() {
        AuthPhoneNumberPage.sendPhoneNumber(number);
        AuthPhoneNumberPage.clickAcceptButton();

        AuthSmsMessagePage.clickAcceptButton();

        AuthPasswordPage.sendPassword(password);
        AuthPasswordPage.clickAcceptButton();

        MainPage.clickBarcode();

        Assertions.assertEquals(
                "+380 00 000 00 00",
                CustomerBarcodePage.getPhoneNumber(),
                "Number is not correct");
    }

}