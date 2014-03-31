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
 * User: Oleksandr_Kara
 * Date: 3/24/14
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertiesAdmin extends BaseTest {
    @Test //1. Search for hotel ID in Properties admin
    public static void searchHotelIdInPropertiesAdmin() {
        final String HOTEL_ID = "705";

        LoginPage page = LoginPage.open();
        page.enterCredentials(System.getProperty("login"),System.getProperty("password"));

        AdmPage pageAdm = page.clickEnterToAdm();
        pageAdm.clickToAdmLink("dbadm/index.php");

        PropertiesAdminPage pagePropertiesAdmin = new PropertiesAdminPage();
        pagePropertiesAdmin.enterHotelId(HOTEL_ID);

        PropertiesAdminSecondPage adminSecondPage = pagePropertiesAdmin.clickSearch();
        adminSecondPage.clickToHotelName();

        String pageTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(pageTitle, "Property Administration - Record N. " + HOTEL_ID, "Title of the page was not expected");

        Reporter.log("Done", 2, true);
    }

    @Test //1.1. Search for hotel name and city in properties admin
    public static void simpleSearchHotelIdInPropertiesAdmin(){
        LoginPage page = LoginPage.open();
        page.enterCredentials(System.getProperty("login"),System.getProperty("password"));
        AdmPage pageAdm = page.clickEnterToAdm();
        pageAdm.clickToAdmLink("dbadm/index.php");
        PropertiesAdminPage pagePropertiesAdmin = new PropertiesAdminPage();
        pagePropertiesAdmin.enterHotelName("Marconi");
        pagePropertiesAdmin.enterHotelCity("Venezia");
        PropertiesAdminSecondPage adminSecondPage = pagePropertiesAdmin.clickSearch();
        Assert.assertEquals(adminSecondPage.compareCountOfHotels(), true, "Page shows more than one hotel.");
        Reporter.log("Done", 2, true);
    }
}
