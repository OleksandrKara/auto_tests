package com.epam.smoke_tests.smoke_test_pages.ui_tests.credit_notes;

import com.epam.smoke_tests.interfaces.ExpectedResultsInterface;
import com.epam.smoke_tests.smoke_test_pages.ExpectedControlsTestBase;
import com.epam.ui.credit_notes.CreateCreditNoteStep2Page;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 5/7/14
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateCreditNoteStep2Page_ExpectedControls extends ExpectedControlsTestBase {
    @Override
    public ExpectedResultsInterface getCurrentPage() {
        return new CreateCreditNoteStep2Page();
    }
}
