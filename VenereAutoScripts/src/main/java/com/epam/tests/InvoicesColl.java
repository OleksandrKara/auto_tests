package com.epam.tests;

import com.epam.main.BaseTest;
import com.epam.main.BasicSteps;
import com.epam.ui.invoice_collection.InvoiceCollectionMenuPage;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/9/14
 * Time: 5:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class InvoicesColl extends BaseTest {
    @Test // 1.Send invoice reminder
    public void sendInvoiceReminder(){
        BasicSteps.clickToMenuPoint("invoice_collection/index.php");

        InvoiceCollectionMenuPage invoiceCollectionMenuPage = new InvoiceCollectionMenuPage();
        invoiceCollectionMenuPage.clickToSearchInvoices();

    }

}
