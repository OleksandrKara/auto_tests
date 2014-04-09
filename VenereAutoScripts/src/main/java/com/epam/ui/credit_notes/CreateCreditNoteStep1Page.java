package com.epam.ui.credit_notes;

import com.epam.main.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.epam.main.BasicSteps.selectElementByTheText;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/8/14
 * Time: 4:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateCreditNoteStep1Page {

    String creditNoteLink = "//select[@name = 'venere_company']";
    String creditNoteTypeElement;

    @FindBy (xpath = "//input[@type='Submit']")
    WebElement continueButton;

    public CreateCreditNoteStep1Page () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void selectVenereCompany(String company) {
        selectElementByTheText(creditNoteLink, company);
    }

    public void selectType(String creditNoteType) {
        creditNoteTypeElement = "//input[@value=\'"+creditNoteType+"\']";
        Driver.getDriver().findElement(By.xpath(creditNoteTypeElement)).click();
    }

    public CreateCreditNoteStep2Page clickContinue() {
        continueButton.click();
        return new CreateCreditNoteStep2Page();
    }

    public ReconciliationListPage clickContinueMr() {
        continueButton.click();
        return new ReconciliationListPage();
    }
}
