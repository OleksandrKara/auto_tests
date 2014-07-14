package com.epam.smoke_tests.smoke_test_pages;

import com.epam.main.BaseTest;
import com.epam.smoke_tests.interfaces.ExpectedResultsInterface;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/30/14
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */

public abstract class ExpectedControlsTestBase extends BaseTest {
        private ExpectedResultsInterface currentPage;
        public abstract ExpectedResultsInterface getCurrentPage();

        @Test
        public void TestExpectedControls() {
            currentPage = getCurrentPage();
            currentPage.invoke();

            List<WebElement> expectedControls = currentPage.getExpectedControls();
            for (WebElement expectedControl:expectedControls)  {
                System.out.println("Testing: " + expectedControl.toString());
                //Reporter.log("Testing: " + expectedControl.toString(), 2, true);
                Assert.assertTrue(expectedControl.isDisplayed()," for " + expectedControl.toString());
            }
        }
}
