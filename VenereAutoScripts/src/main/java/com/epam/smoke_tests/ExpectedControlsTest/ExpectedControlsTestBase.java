package com.epam.smoke_tests.ExpectedControlsTest;

import com.epam.main.BaseTest;
import com.epam.smoke_tests.Roles.ExpectedResultsInterface;
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
               // System.out.println("Testing: " + expectedControls.toString());

              //  Reporter.log("Testing: " + expectedControls.toString());
                Assert.assertTrue(expectedControl.isDisplayed(),"for " + expectedControl.toString());
            }
        }
}
