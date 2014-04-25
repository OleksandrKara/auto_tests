package com.epam.tests;

import com.epam.data.AppLinks;
import com.epam.main.BaseTest;
import com.epam.ui.credit_notes.*;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/8/14
 * Time: 4:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreditNotes extends BaseTest {
    private final String BANK = "BOA-EUR-5011-UK-SEPA (UK)";
    private final String DATE[] = {"22", "June", "2013"};
    private final String VENERE_COMPANY = "Venere UK";

    @Test //Credit Note creation (ER, AD, PD)
    public void createCreditNote(){
        String creditNoteType = "AD";
        String year = "2012";
        String invoiceNumber = "20106365";/* select top 1 num_fat from fatture where year(emission_date) = 2012 and payment_date is null and company_id = 2  */
        String testString = "This is text for testing";
        String amount = "500";
        String partialOrTotal = "Partial";

        loginSteps(AppLinks.CREDIT_NOTES_URL);

        CreditNotesMenuPage creditNotesMenuPage = new CreditNotesMenuPage();
        CreateCreditNoteStep1Page createCreditNoteStep1Page = creditNotesMenuPage.clickCreateNoteLink();
        createCreditNoteStep1Page.selectVenereCompany(VENERE_COMPANY);
        createCreditNoteStep1Page.selectType(creditNoteType);
        CreateCreditNoteStep2Page createCreditNoteStep2Page = createCreditNoteStep1Page.clickContinue();
        createCreditNoteStep2Page.setYear(year);
        createCreditNoteStep2Page.setInvoiceNumber(invoiceNumber);
        CreateCreditNoteReservationPage createCreditNoteReservationPage =  createCreditNoteStep2Page.clickContinue();
        createCreditNoteReservationPage.fillIn(testString);
        createCreditNoteReservationPage.setAmount(amount);
        createCreditNoteReservationPage.setAmountType(partialOrTotal);
        createCreditNoteReservationPage.setTheDate(DATE);
        createCreditNoteReservationPage.setBank(BANK);
        createCreditNoteReservationPage.clickCreateButton();
        createCreditNoteReservationPage.confirmation();
        EmittedCreditNotePage  emittedCreditNotePage = new EmittedCreditNotePage();
        emittedCreditNotePage.clickNext();
    }

    @Test //Credit Note creation (MR)
    public void createCreditNoteMr(){
        String creditNoteType = "MR";

        loginSteps(AppLinks.CREDIT_NOTES_URL);

        CreditNotesMenuPage creditNotesMenuPage = new CreditNotesMenuPage();
        CreateCreditNoteStep1Page createCreditNoteStep1Page = creditNotesMenuPage.clickCreateNoteLink();
        createCreditNoteStep1Page.selectVenereCompany(VENERE_COMPANY);
        createCreditNoteStep1Page.selectType(creditNoteType);
        ReconciliationListPage reconciliationListPage = createCreditNoteStep1Page.clickContinueMr();
        reconciliationListPage.clickSelOptionCheckBox();
        reconciliationListPage.setTheDate(DATE);
        reconciliationListPage.setBank(BANK);
        EmittedCreditNotePage  emittedCreditNotePage = reconciliationListPage.clickCreateButton();
        emittedCreditNotePage.clickNext();
    }

    @Test //2. Credit Note reversation
    public void creditNoteRevers(){

        loginSteps(AppLinks.CREDIT_NOTES_URL);

        CreditNotesMenuPage creditNotesMenuPage = new CreditNotesMenuPage();
        CreateCreditNoteStep1Page createCreditNoteStep1Page = creditNotesMenuPage.clickCreateNoteLink();
    }

}
