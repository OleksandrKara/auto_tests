package com.epam.ui.credit_notes;

import com.epam.main.Driver;
import com.epam.main.Page;
import com.epam.smoke_tests.Roles.ExpectedResultsInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/8/14
 * Time: 4:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateCreditNoteStep1Page extends Page implements ExpectedResultsInterface {

    String creditNoteLink = "//select[@name = 'venere_company']";
    String creditNoteTypeElement;

    @FindBy (xpath = "//input[@type='Submit']")
    WebElement continueButton;

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

    @Override
    public void invoke() {
        CreditNotesMenuPage creditNotesMenuPage = new CreditNotesMenuPage();
        creditNotesMenuPage.clickCreateNoteLink();
    }

    @Override
    public List<WebElement> getExpectedControls() {
        return new ArrayList<WebElement>(){
            {
                add(continueButton);
            }
        };
        //Assert.assertTrue("Button locator is broken", continueButton.isDisplayed());
    }
}
