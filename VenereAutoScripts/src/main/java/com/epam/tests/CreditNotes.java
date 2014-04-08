package com.epam.tests;

import com.epam.main.BaseTest;
import com.epam.main.BasicSteps;
import com.epam.ui.credit_notes.CreateCreditNoteReservationPage;
import com.epam.ui.credit_notes.CreateCreditNoteStep1Page;
import com.epam.ui.credit_notes.CreateCreditNoteStep2Page;
import com.epam.ui.credit_notes.CreditNotesMenuPage;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/8/14
 * Time: 4:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreditNotes extends BaseTest {
    @Test //Credit Note creation (ER, AD, PD)
    public void createCreditNote(){
        String venereCompany = "Venere UK";
        String creditNoteType = "AD";
        String year = "2012";
        String invoiceNumber = "20106365";/* select top 1 num_fat from fatture where year(emission_date) = 2012 and payment_date is null and company_id = 2  */
        String testString = "This is text for testing";
        String amount = "500";
        String partialOrTotal = "Total";

        BasicSteps.clickToMenuPoint("credit_notes/");

        CreditNotesMenuPage creditNotesMenuPage = new CreditNotesMenuPage();
        CreateCreditNoteStep1Page createCreditNoteStep1Page = creditNotesMenuPage.clickCreateNoteLink();
        createCreditNoteStep1Page.selectVenereCompany(venereCompany);
        createCreditNoteStep1Page.selectType(creditNoteType);
        CreateCreditNoteStep2Page createCreditNoteStep2Page = createCreditNoteStep1Page.clickContinue();
        createCreditNoteStep2Page.setYear(year);
        createCreditNoteStep2Page.setInvoiceNumber(invoiceNumber);
        CreateCreditNoteReservationPage createCreditNoteReservationPage =  createCreditNoteStep2Page.clickContinue();
        createCreditNoteReservationPage.fillIn(testString);
        createCreditNoteReservationPage.setAmount(amount);
        createCreditNoteReservationPage.setAmountType(partialOrTotal);
    }

}
