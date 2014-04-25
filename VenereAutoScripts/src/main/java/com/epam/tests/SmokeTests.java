package com.epam.tests;

import com.epam.main.BaseTest;
import com.epam.main.ExpectedResultsInterface;
import com.epam.ui.credit_notes.CreditNotesMenuPage;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/23/14
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class SmokeTests extends BaseTest{
    @Test
    public void invokeMainPage(){
        ExpectedResultsInterface[] pages = new ExpectedResultsInterface[1];

        //CreditNotes
        CreditNotesMenuPage page = new CreditNotesMenuPage();

        pages[0] =   page;

        for (int i = 0; i<pages.length; i++){
            testPage(pages[i]);
        }
    }

    private void testPage(ExpectedResultsInterface page) {
        page.invoke();
        page.verifyExpectedControls();

    }

}
