package com.epam.ui.invoice_collection;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/10/14
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class InvoiceCollectionMenuPage {

    @FindBy(xpath = "//a[contains(@href,'invoice_collection_search_invoices')]")
    WebElement invoicesFaxEmailButton;

    public InvoiceCollectionMenuPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickToSearchInvoices() {
        invoicesFaxEmailButton.click();
    }
}
