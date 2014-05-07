package com.epam.ui.invoice_collection;

import com.epam.data.AppLinks;
import com.epam.main.Page;
import com.epam.smoke_tests.interfaces.ExpectedResultsInterface;
import com.epam.ui.AdmPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/10/14
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class InvoiceCollectionMenuPage extends Page implements ExpectedResultsInterface {

    @FindBy(xpath = "//a[contains(@href,'invoice_collection_search_invoices')]")
    WebElement invoicesFaxEmailButton;

    public void clickToSearchInvoices() {
        invoicesFaxEmailButton.click();
    }

    @Override
    public void invoke() {
        AdmPage admPage = new AdmPage();
        admPage.invoke();
        admPage.clickToMenuPoint(AppLinks.INVOICES_COLLECTION_URL);
    }

    @Override
    public List<WebElement> getExpectedControls() {
        return new ArrayList<WebElement>(){
            {
                add(invoicesFaxEmailButton);
            }
        };
    }
}
