package com.epam.ui.reconciliations;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/8/14
 * Time: 3:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReconciliationMenuPage {

    @FindBy(xpath = "//a[contains(@href,'property_reconciliations')]")
    WebElement propertyReconciliationLing;

    public ReconciliationMenuPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public PropertyReconciliationPage clickToPropertyReconciliationsLink() {
        propertyReconciliationLing.click();
        return new PropertyReconciliationPage();
    }
}
