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
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReconciliationListPage extends Page implements ExpectedResultsInterface {

    @FindBy(xpath = "//table[@id='table_mr']/tbody/tr[3]/td[15]/input")
    WebElement selCheckBox;

    @FindBy (id = "create_button_mr")
    WebElement createButton;

    String dayElement = "//select[@name = 'e_dd']";
    String monthElement = "//select[@name = 'e_mm']";
    String yearElement = "//select[@name = 'e_yy']";
    String bankElement = "//select[@name = 'venere_bank_id']";

    public void clickSelOptionCheckBox() {
        selCheckBox.click();
    }

    public void setTheDate(String[] date) {
        selectElementByTheText(dayElement, date[0]);
        selectElementByTheText(monthElement, date[1]);
        selectElementByTheText(yearElement, date[2]);
    }

    public void setBank(String bank) {
        selectElementByTheText(bankElement, bank);
    }

    public EmittedCreditNotePage clickCreateButton() {
        createButton.click();

        return new EmittedCreditNotePage();
    }

    @Override
    public void invoke() {
        String venere_company = "Venere UK";
        String creditNoteType = "MR";
        CreateCreditNoteStep1Page createCreditNoteStep1Page = new CreateCreditNoteStep1Page();
        //createCreditNoteStep1Page.invoke();
        createCreditNoteStep1Page.selectVenereCompany(venere_company);
        createCreditNoteStep1Page.selectType(creditNoteType);
        createCreditNoteStep1Page.clickContinueMr();
    }

    @Override
    public List<WebElement> getExpectedControls() {
        return new ArrayList<WebElement>(){
            {
                add(selCheckBox);
                add(createButton);
            }
        };
        //Assert.assertTrue("selCheckBox locator is broken", selCheckBox.isDisplayed());
        //Assert.assertTrue("Button locator is broken", createButton.isDisplayed());
    }
}