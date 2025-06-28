package utils;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static utils.DriverUtils.driver;

public class FunctionLibrary {

    public static void enterPasscode(String code) {
        for (Character c : code.toCharArray()) {
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"" + c.toString() + "\")")).click();
//            driver.findElement(By.xpath("//android.widget.TextView[@text=\"" + c.toString() + "\"]")).click();
        }
    }

    public static void waitForElementToBeVisible(WebElement ele, int timeoutSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }

    public static void verifyPresenceOfElement(WebElement ele, int timeoutSeconds) {
        waitForElementToBeVisible(ele, timeoutSeconds);
        Assert.assertTrue(ele.isDisplayed(), "Element is not present");
    }

    public static void verifyText(WebElement ele, String expectedText, int timeoutSeconds) {
        waitForElementToBeVisible(ele, timeoutSeconds);
        Assert.assertEquals(ele.getText(), expectedText, "Text of element doesn't match");
    }
}
