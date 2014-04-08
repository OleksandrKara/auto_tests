package com.epam.ui.credit_notes;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/8/14
 * Time: 4:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreditNotesMenuPage {

    @FindBy(xpath="//a[@href = 'index.php?action=cn_create_form']")
    WebElement creditNoteLink;

    public CreditNotesMenuPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public CreateCreditNoteStep1Page clickCreateNoteLink() {
        creditNoteLink.click();
        return new CreateCreditNoteStep1Page();
    }
}
