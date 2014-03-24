package com.epam.tests;

import com.epam.main.BaseTest;
import com.epam.main.Driver;
import com.epam.ui.AdmPage;
import com.epam.ui.LoginPage;
import com.epam.ui.PropertiesAdminPage;
import com.epam.ui.PropertiesAdminSecondPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 19.03.14
 * Time: 12:11
 * To change this template use File | Settings | File Templates.
 */
public class MainClass extends BaseTest {



    @Test
    public static void authorisationTest() {
        LoginPage page = LoginPage.open();
        page.enterCredentials(System.getProperty("login"),System.getProperty("password"));
        page.clickEnterToAdm();
        AdmPage pageAdm = new AdmPage();
        Assert.assertTrue(pageAdm.getValue().getText().equalsIgnoreCase("LOGOUT"),
                "Logout message wasn't found");
        Reporter.log("Done", 2, true);
    }


    @Test
    public static void searchHotelIdInPropertiesAdmin() {
        final String HOTEL_ID = "705";

        LoginPage page = LoginPage.open();
        page.enterCredentials(System.getProperty("login"),System.getProperty("password"));

        AdmPage pageAdm = page.clickEnterToAdm();

        PropertiesAdminPage pagePropertiesAdmin = pageAdm.clickToLinkPropertiesAdminLink();
        pagePropertiesAdmin.enterHotelId(HOTEL_ID);

        PropertiesAdminSecondPage adminSecondPage = pagePropertiesAdmin.clickSearch();
        adminSecondPage.clickToHotelName();

        String pageTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(pageTitle, "Property Administration - Record N. "+ HOTEL_ID, "Title of the page was not expected");

        Reporter.log("Done", 2, true);
    }
}