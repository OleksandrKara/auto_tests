package com.epam.tests;

import com.epam.main.BaseTest;
import com.epam.main.BasicSteps;
import com.epam.ui.reconciliations.PropertyReconciliationPage;
import com.epam.ui.reconciliations.ReconciliationMenuPage;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/2/14
 * Time: 11:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class Reconciliations extends BaseTest {

    @Test //4. Searching for a reconciliation
    public void CreateSingleReconciliation(){
        BasicSteps.clickToMenuPoint("reconciliations/");

        ReconciliationMenuPage reconciliationMenuPage = new ReconciliationMenuPage();
        PropertyReconciliationPage propertyReconciliationPage  = reconciliationMenuPage.clickToPropertyReconciliationsLink();
        propertyReconciliationPage.clickSearch();
    }
}
