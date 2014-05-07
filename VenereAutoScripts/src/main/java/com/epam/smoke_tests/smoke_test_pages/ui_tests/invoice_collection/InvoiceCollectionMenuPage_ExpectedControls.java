package com.epam.smoke_tests.smoke_test_pages.ui_tests.invoice_collection;

import com.epam.smoke_tests.interfaces.ExpectedResultsInterface;
import com.epam.smoke_tests.smoke_test_pages.ExpectedControlsTestBase;
import com.epam.ui.invoice_collection.InvoiceCollectionMenuPage;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/10/14
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class InvoiceCollectionMenuPage_ExpectedControls extends ExpectedControlsTestBase {
    @Override
    public ExpectedResultsInterface getCurrentPage() {
        return new InvoiceCollectionMenuPage();
    }
}
