package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;

import static pages.BasePage.*;
import static utils.FunctionLibrary.*;

public class SampleTest extends BaseTest {

    @BeforeClass
    public void pageInitialisation(){
        BasePage page = new BasePage();
    }

    @Test(description = "Create wallet successfully", priority = 2)
    public void createWalletSuccess() {
        verifyPresenceOfElement(createWalletButton, 10);
        createWalletButton.click();

        verifyPresenceOfElement(createPasscodeHeader, 10);
        enterPasscode("123456");

        verifyPresenceOfElement(confirmPasscodeHeader, 10);
        enterPasscode("123456");

        verifyPresenceOfElement(notificationPageHeader, 10);
        verifyPresenceOfElement(enableNotificationButton, 10);
        verifyPresenceOfElement(skipButtonInNotificationPage, 10);
        skipButtonInNotificationPage.click();

        verifyPresenceOfElement(walletReadyPageHeader, 30);
        verifyPresenceOfElement(buyCryptoButtonInWalletPage, 10);
        verifyPresenceOfElement(depositCryptoButtonInWalletPage, 10);
        verifyPresenceOfElement(skipButtonInWalletReadyPage, 10);
        skipButtonInWalletReadyPage.click();

        verifyPresenceOfElement(mainWalletHeader, 10);
        verifyText(mainWalletHeader, "Main Wallet 1", 10);
        verifyPresenceOfElement(emptyWalletText, 10);
        verifyPresenceOfElement(buyCryptoButtonInMainPage, 10);
        verifyPresenceOfElement(depositCryptoButtonInMainPage, 10);
        verifyPresenceOfElement(manageCryptoButtonInMainPage, 10);
    }

    @Test(description = "Passcode not matching", priority = 1)
    public void testWrongPasscodes() {
        verifyPresenceOfElement(createWalletButton, 10);
        createWalletButton.click();

        verifyPresenceOfElement(createPasscodeHeader, 10);
        enterPasscode("123456");

        verifyPresenceOfElement(confirmPasscodeHeader, 10);
        enterPasscode("123455");

        verifyPresenceOfElement(passCodesNotMatchedError, 10);
        backArrow.click();
    }

}