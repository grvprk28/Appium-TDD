package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.DriverUtils;

public class BaseTest {

    @BeforeSuite
    public void setUp() {
        DriverUtils.initializeDriver();
    }

    @AfterSuite
    public void tearDown() {
        DriverUtils.quitDriver();
    }

}
