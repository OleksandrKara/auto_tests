package com.epam.smoke_tests.smoke_test_pages.ui_tests.invoice_emission;

import com.epam.smoke_tests.interfaces.ExpectedResultsInterface;
import com.epam.smoke_tests.smoke_test_pages.ExpectedControlsTestBase;
import com.epam.ui.invoice_emission.QuarterInvoicesEmissionPage;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/1/14
 * Time: 12:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class QuarterInvoicesEmissionPage_ExpectedControls extends ExpectedControlsTestBase {
    @Override
    public ExpectedResultsInterface getCurrentPage() {
        return new QuarterInvoicesEmissionPage();
    }
}
