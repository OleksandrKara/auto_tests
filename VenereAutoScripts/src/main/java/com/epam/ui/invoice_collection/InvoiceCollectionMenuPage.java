package com.epam.ui.invoice_collection;

import com.epam.main.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/10/14
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class InvoiceCollectionMenuPage extends Page {

    @FindBy(xpath = "//a[contains(@href,'invoice_collection_search_invoices')]")
    WebElement invoicesFaxEmailButton;

    public void clickToSearchInvoices() {
        invoicesFaxEmailButton.click();
    }
}
