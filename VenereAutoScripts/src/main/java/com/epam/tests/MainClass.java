package com.epam.tests;

import com.epam.main.BaseTest;
import com.epam.ui.AdmPage;
import com.epam.ui.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 19.03.14
 * Time: 12:11
 * To change this template use File | Settings | File Templates.
 */
public class MainClass extends BaseTest {
    @Test //Simple test for login
    public static void authorisationTest() {
        LoginPage page = LoginPage.open();
        page.enterCredentials(System.getProperty("login"),System.getProperty("password"));
        AdmPage pageAdm = page.clickEnterToAdm();
        Assert.assertTrue(pageAdm.getValue().getText().equalsIgnoreCase("LOGOUT"),
                "Logout message wasn't found");
        //Reporter.log("Done", 2, true);
    }
}