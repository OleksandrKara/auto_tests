package com.epam.smoke_tests.smoke_test_pages.ui_tests.invoices_configuration;

import com.epam.main.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/24/14
 * Time: 6:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class EligibleCountriesPage extends Page {
    @FindBy(xpath = "//form/select[@name = 'paymentmethod_reference']/option[3]")
    WebElement method;

    public EligibleCountriesSecondPage selectTheMethod() {
        method.click();
        return new EligibleCountriesSecondPage();
    }
}
