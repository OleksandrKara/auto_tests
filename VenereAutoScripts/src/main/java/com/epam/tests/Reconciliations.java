package com.epam.tests;

import com.epam.main.BaseTest;
import com.epam.main.BasicSteps;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/2/14
 * Time: 11:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class Reconciliations extends BaseTest {

    @Test //Create single reconciliation
    public void CreateSingleReconciliation(){
        BasicSteps.clickToMenuPoint("reconciliations/");

    }
}
