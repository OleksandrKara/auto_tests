package com.epam.ui.credit_notes;

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
 * Date: 4/8/14
 * Time: 4:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreditNotesMenuPage extends Page implements ExpectedResultsInterface {

    @FindBy(xpath="//a[@href = 'index.php?action=cn_create_form']")
    WebElement creditNoteLink;

    public CreateCreditNoteStep1Page clickCreateNoteLink() {
        creditNoteLink.click();
        return new CreateCreditNoteStep1Page();
    }

    public void invoke() {
        AdmPage adminPage = new AdmPage();
        adminPage.invoke();
        adminPage.clickToMenuPoint(AppLinks.CREDIT_NOTES_URL);
    }

    public List<WebElement> getExpectedControls() {
        return new ArrayList<WebElement>(){
            {
                add(creditNoteLink);
            }
        };
    }

}
