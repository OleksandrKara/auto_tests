package com.epam.tests;

import com.epam.data.AppLinks;
import com.epam.main.BaseTest;
import com.epam.ui.invoices_configuration.*;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/24/14
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class InvoicesConfiguration extends BaseTest {
    final String TESTING_COUNTRY = "Australia";

    @AfterMethod
    public void rollbackNetgiroEligibilityAbility() {
        EligibleCountriesSecondPage page = new EligibleCountriesSecondPage();
        page.checkThatCountryIsNotAddedToTheMainList(TESTING_COUNTRY);
    }

    @Test //1. Change netgiro eligibility and ability
    public void netgiroEligibilityAbility(){

        loginSteps(AppLinks.ELIGIBLE_COUNTRIES_MANAGEMENT);

        EligibleCountriesPage firstPage = new EligibleCountriesPage();
        EligibleCountriesSecondPage secondPage = firstPage.selectTheMethod();
        secondPage.selectTheCountry(TESTING_COUNTRY); // Method will update the country list if the TESTING_COUNTRY wasn't found
        secondPage.clickAddTheCountry();
        secondPage.acceptConfirmation();
        Assert.assertTrue(secondPage.listOfCountriesContainsCountry(TESTING_COUNTRY), "The list of countries doesn't contain the country that has been added before.");
        Reporter.log("Done", 2, true);
    }

    @Test//(enabled=false) //Change hotel invoice configuration                     FAILED!!!!!!!!!!!!!!!!!!!!!
    public void changeHotelInvoiceConfiguration(){
        String currency = "JPY";
        String additionalCurrency = "USD";
        String company = "Expedia Brazil";
        String additionalCompany = "Venere UK Limited";

        loginSteps(AppLinks.INVOICES_CONFIGURATION_URL);

        InvoicesConfigurationPage invoicesConfigurationPage = new InvoicesConfigurationPage();
        SearchPropertyBillingConfigurationPage searchPropertyBillingConfigurationPage = invoicesConfigurationPage.clickSearchLink();
        searchPropertyBillingConfigurationPage.enterHotelId("968");
        searchPropertyBillingConfigurationPage.enterClientId("14244");
        PropertyConfigurationListPage propertyConfigurationListPage = searchPropertyBillingConfigurationPage.clickToSearchButton();
        PropertyConfigurationModifyPage propertyConfigurationModifyPage = propertyConfigurationListPage.clickToModifyButton();
        company = propertyConfigurationModifyPage.selectVenereCompany(company, additionalCompany); //in ase if 'Expedia Brazil' already checked will use additional
        currency = propertyConfigurationModifyPage.selectCurrency(currency, additionalCurrency); //in case if 'JPY' already checked will use additional
        propertyConfigurationModifyPage.clickModify();
        propertyConfigurationModifyPage.acceptConfirmation();
        Assert.assertEquals(propertyConfigurationModifyPage.ifElementIsChecked(currency),true,"Currency haven't switched");
        Assert.assertEquals(propertyConfigurationModifyPage.ifElementIsChecked(company),true,"Company haven't switched");
        Reporter.log("Done", 2, true);
    }
}
