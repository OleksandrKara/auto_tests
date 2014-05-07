package com.epam.smoke_tests.smoke_test_pages.ui_tests;

import com.epam.smoke_tests.smoke_test_pages.ExpectedControlsTestBase;
import com.epam.smoke_tests.interfaces.ExpectedResultsInterface;
import com.epam.ui.AdmPage;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/30/14
 * Time: 6:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class AdmPage_ExpectedControls extends ExpectedControlsTestBase {

    @Override
    public ExpectedResultsInterface getCurrentPage() {
        return new AdmPage();
    }
}
