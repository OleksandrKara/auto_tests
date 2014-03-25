package com.epam.ui;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/24/14
 * Time: 6:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class EligibleCountriesPage {
    @FindBy(xpath = "//form/select[@name = 'paymentmethod_reference']/option[3]")
    WebElement method;

    public EligibleCountriesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public EligibleCountriesSecondPage selectTheMethod() {
        method.click();
        return new EligibleCountriesSecondPage();
    }
}
