package com.epam.tests;

import com.epam.main.BaseTest;
import com.epam.ui.AdmPage;
import com.epam.ui.EligibleCountriesPage;
import com.epam.ui.EligibleCountriesSecondPage;
import com.epam.ui.LoginPage;
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
        LoginPage page = LoginPage.open();
        page.enterCredentials(System.getProperty("login"),System.getProperty("password"));
        AdmPage pageAdm = page.clickEnterToAdm();
        pageAdm.clickToAdmLink("payment/index.php?action=list_country_eligibility");

        EligibleCountriesPage firstPage = new EligibleCountriesPage();
        EligibleCountriesSecondPage secondPage = firstPage.selectTheMethod();
        secondPage.selectTheCountry(TESTING_COUNTRY); // Method will update the country list if the TESTING_COUNTRY wasn't found
        secondPage.clickAddTheCountry();
        secondPage.acceptConfirmationMessage();
        Assert.assertTrue(secondPage.listOfCountriesContainsCountry(TESTING_COUNTRY), "The list of countries doesn't contain the country that has been added before.");
        Reporter.log("Done", 2, true);
    }

}
