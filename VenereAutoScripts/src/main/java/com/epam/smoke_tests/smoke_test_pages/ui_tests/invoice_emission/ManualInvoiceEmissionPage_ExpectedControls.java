package com.epam.smoke_tests.smoke_test_pages.ui_tests.invoice_emission;

import com.epam.smoke_tests.interfaces.ExpectedResultsInterface;
import com.epam.smoke_tests.smoke_test_pages.ExpectedControlsTestBase;
import com.epam.ui.invoice_emission.ManualInvoiceEmissionPage;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/4/14
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class ManualInvoiceEmissionPage_ExpectedControls extends ExpectedControlsTestBase {
    @Override
    public ExpectedResultsInterface getCurrentPage() {
        return new ManualInvoiceEmissionPage();
    }
}
