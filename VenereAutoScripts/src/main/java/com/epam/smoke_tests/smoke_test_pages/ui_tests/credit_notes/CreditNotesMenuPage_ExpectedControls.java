package com.epam.smoke_tests.smoke_test_pages.ui_tests.credit_notes;

import com.epam.smoke_tests.interfaces.ExpectedResultsInterface;
import com.epam.smoke_tests.smoke_test_pages.ExpectedControlsTestBase;
import com.epam.ui.credit_notes.CreditNotesMenuPage;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 5/7/14
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreditNotesMenuPage_ExpectedControls extends ExpectedControlsTestBase {

    @Override
    public ExpectedResultsInterface getCurrentPage() {
        return new CreditNotesMenuPage();
    }
}
