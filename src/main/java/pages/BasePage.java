package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class BasePage {

    protected AppiumDriver driver;

    @FindBy(xpath = "//android.view.View[@resource-id='CreateNewWalletButton']")
    public static WebElement createWalletButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Create passcode']")
    public static WebElement createPasscodeHeader;

    @FindBy(xpath = "//android.widget.TextView[@text='Confirm passcode']")
    public static WebElement confirmPasscodeHeader;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Those passwords didn’t match!\"]")
    public static WebElement passCodesNotMatchedError;

    @FindBy(xpath = "//android.view.View[@content-desc='Back']")
    public static WebElement backArrow;

    @FindBy(xpath = "//android.widget.TextView[@text='Keep up with the market!']")
    public static WebElement notificationPageHeader;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='buttonTitle']")
    public static WebElement enableNotificationButton;
    @FindBy(xpath = "//android.widget.TextView[@resource-id='secondaryAction']")
    public static WebElement skipButtonInNotificationPage;

    @FindBy(xpath = "//android.widget.TextView[@text='Brilliant, your wallet is ready!']")
    public static WebElement walletReadyPageHeader;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='buttonTitle' and @text='Buy Crypto']")
    public static WebElement buyCryptoButtonInWalletPage;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='buttonTitle' and @text='Deposit Crypto']")
    public static WebElement depositCryptoButtonInWalletPage;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Skip, I'll do it later\"]")
    public static WebElement skipButtonInWalletReadyPage;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='topBarWalletName']")
    public static WebElement mainWalletHeader;

    @FindBy(xpath = "//android.widget.TextView[@text='Your wallet is empty.']")
    public static WebElement emptyWalletText;

    @FindBy(xpath = "//android.widget.TextView[@text='Buy Crypto']")
    public static WebElement buyCryptoButtonInMainPage;

    @FindBy(xpath = "//android.widget.TextView[@text='Deposit Crypto']")
    public static WebElement depositCryptoButtonInMainPage;

    @FindBy(xpath = "//android.widget.TextView[@text='Manage crypto']")
    public static WebElement manageCryptoButtonInMainPage;

    public BasePage() {
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



//android.widget.TextView[@text="Skip, I'll do it later"]






}
