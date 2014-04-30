package com.epam.ui.credit_notes;

import com.epam.main.Page;
import com.epam.smoke_tests.Roles.ExpectedResultsInterface;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/9/14
 * Time: 11:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class EmittedCreditNotePage extends Page implements ExpectedResultsInterface {

    @FindBy (xpath = "//input[@class='submit'][@type = 'Submit']")
    WebElement nextButton;

    public void clickNext() {
        nextButton.click();
    }

    @Override
    public void invoke() {
        String bank = "BOA-EUR-5011-UK-SEPA (UK)";
        String date[] = {"22", "June", "2013"};
        String testString = "This is text for testing";
        String amount = "500";
        String partialOrTotal = "Partial";
        CreateCreditNoteReservationPage createCreditNoteReservationPage = new CreateCreditNoteReservationPage();
        createCreditNoteReservationPage.fillIn(testString);
        createCreditNoteReservationPage.setAmount(amount);
        createCreditNoteReservationPage.setAmountType(partialOrTotal);
        createCreditNoteReservationPage.setTheDate(date);
        createCreditNoteReservationPage.setBank(bank);
        createCreditNoteReservationPage.clickCreateButton();
        createCreditNoteReservationPage.confirmation();
    }

    @Override
    public List<WebElement> getExpectedControls() {
       return new ArrayList<WebElement>(){
           {
               add(nextButton);
           }
       };
        //Assert.assertTrue("Button locator is broken", nextButton.isDisplayed());
    }
}
