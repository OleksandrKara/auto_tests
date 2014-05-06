package com.epam.smoke_tests.ExpectedControlsTest.concrete_pages;

import com.epam.smoke_tests.ExpectedControlsTest.ExpectedControlsTestBase;
import com.epam.smoke_tests.Roles.ExpectedResultsInterface;
import com.epam.ui.LoginPage;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/30/14
 * Time: 6:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginPage_ExpectedControls extends ExpectedControlsTestBase {

    @Override
    public ExpectedResultsInterface getCurrentPage() {
        return new LoginPage();
    }


}
