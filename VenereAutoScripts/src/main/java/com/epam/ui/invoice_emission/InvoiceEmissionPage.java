package com.epam.ui.invoice_emission;

import com.epam.main.Page;
import com.epam.smoke_tests.interfaces.ExpectedResultsInterface;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/1/14
 * Time: 12:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class InvoiceEmissionPage extends Page implements ExpectedResultsInterface {

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

    @Override
    public void invoke() {

    }

    @Override
    public List<WebElement> getExpectedControls() {
        return new ArrayList<WebElement>(){
            {
                add(emissionLink);
                add(emissionManualLink);
            }
        };
    }
}
