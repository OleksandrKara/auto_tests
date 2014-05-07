package com.epam.smoke_tests.smoke_test_pages.ui_tests.invoice_emission;

import com.epam.smoke_tests.interfaces.ExpectedResultsInterface;
import com.epam.smoke_tests.smoke_test_pages.ExpectedControlsTestBase;
import com.epam.ui.invoice_emission.ManualInvoicePage;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/4/14
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class ManualInvoicePage_ExpectedControls extends ExpectedControlsTestBase {
    @Override
    public ExpectedResultsInterface getCurrentPage() {
        return new ManualInvoicePage();
    }
}
