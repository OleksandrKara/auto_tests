package com.epam.smoke_tests;

import com.epam.main.BaseTest;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/23/14
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class SmokeTests extends BaseTest{
   /* @Test
    public void invokeMainPage(){

        ArrayList<ExpectedResultsInterface> pages = new ArrayList();

        //LoginPage
        LoginPage loginPage = new LoginPage();

        //AdmPage
        AdmPage admPage = new AdmPage();

        //CreditNotes
        CreditNotesMenuPage creditNotesMenuPage = new CreditNotesMenuPage();
        CreateCreditNoteStep1Page createCreditNoteStep1Page = new CreateCreditNoteStep1Page();
        CreateCreditNoteStep2Page createCreditNoteStep2Page = new CreateCreditNoteStep2Page();
        CreateCreditNoteReservationPage createCreditNoteReservationPage = new CreateCreditNoteReservationPage();
        EmittedCreditNotePage emittedCreditNotePage = new EmittedCreditNotePage();
        //ReconciliationListPage reconciliationListPage = new ReconciliationListPage();

        pages.add(loginPage);
        pages.add(admPage);
        pages.add(creditNotesMenuPage);
        pages.add(createCreditNoteStep1Page);
        pages.add(createCreditNoteStep2Page);
        pages.add(createCreditNoteReservationPage);
        pages.add(emittedCreditNotePage);
        //pages.add(reconciliationListPage);

        for(ExpectedResultsInterface page:pages){
            page.invoke();
            page.getExpectedControls();
        }
    }*/

















   /* @Test
    public class AllPagesTest {

        public void TestThatPageExists(Invokable page)
        {
            page.invoke();


            Assert.assertTrue(page.exists(), "Page should exist: " + page.getClass().toString());

            *//*Console.WriteLine(pageClassName + "Done. Current title is: "
                    + WebBrowser.Driver.Title);*//*
        }

        @Test
        public void testLoginPage()  {
            TestThatPageExists(MyPages.getLoginPage());
        }

        @Test
        public void testAdmPage()  {
            TestThatPageExists(MyPages.getAdmPage());
        }


    }*/
}
