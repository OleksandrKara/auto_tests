package com.epam.ui.invoice_emission;

import com.epam.main.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/1/14
 * Time: 12:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class InvoiceEmissionPage extends Page {

    @FindBy(xpath="//ul[@class='menu']/li/a[contains(@href,'invoice_emission_quarter_form')]")
    WebElement emissionLink;

    @FindBy(xpath="//ul[@class='menu']/li/a[contains(@href,'/adm/invoice_emission/index.php?action=invoice_emission_manual_search_form')]")
    WebElement emissionManualLink;

    public QuarterInvoicesEmissionPage clickToEmission(){
        emissionLink.click();
        return new QuarterInvoicesEmissionPage();
    }

    public ManualInvoicePage clickToManualInvoicesEmission() {
        emissionManualLink.click();
        return new ManualInvoicePage();
    }
}
