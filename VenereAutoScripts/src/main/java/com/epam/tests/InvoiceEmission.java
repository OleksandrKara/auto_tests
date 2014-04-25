package com.epam.tests;

import com.epam.data.AppLinks;
import com.epam.main.BaseTest;
import com.epam.ui.invoice_emission.*;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/1/14
 * Time: 12:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class InvoiceEmission extends BaseTest {

    @Test //1. Creation of a quarter invoice
    public void quarterInvoiceCreation(){
        String company = "Venere UK Ltd (dba Venere France)";
        String startDate = "January";
        String endDate = "February";
        String country = "Ukraine";
        String billingGroup = "Second & Monthly";

        loginSteps(AppLinks.INVOICES_EMISSION_URL);

        InvoiceEmissionPage invoiceEmissionPage = new InvoiceEmissionPage();
        QuarterInvoicesEmissionPage quarterInvoicesEmissionPage = invoiceEmissionPage.clickToEmission();
        quarterInvoicesEmissionPage.selectTheCompany(company);
        //quarterInvoicesEmissionPage.setInvoiceDate();
        quarterInvoicesEmissionPage.setExaminedInterval(startDate, endDate);
        quarterInvoicesEmissionPage.setBillingGroup(billingGroup);
        quarterInvoicesEmissionPage.setCountry(country);
        quarterInvoicesEmissionPage.setCreateInvoice();
        quarterInvoicesEmissionPage.createAndInsertInvoices();
        quarterInvoicesEmissionPage.acceptConfirmation();
        BackgroundTasksPage backgroundTasksPage = new BackgroundTasksPage();
        backgroundTasksPage.getStartBgTask();
        backgroundTasksPage.getToBgTasks();
        backgroundTasksPage.clickToShowForm();//Think need to add specific waiter
        Assert.assertEquals(quarterInvoicesEmissionPage.doesTheCompanyIsTheSame(company), true, "The company didn't switched");
        Assert.assertEquals(quarterInvoicesEmissionPage.doesTheBillingGroupIsTheSame(billingGroup), true, "The company didn't switched");
        Assert.assertEquals(quarterInvoicesEmissionPage.doesTheCountryIsTheSame(country), true, "The country didn't switched");
        Reporter.log("Done", 2, true);
        //Need to investigate deeply because after bg task invoice should be able to find due to ADM->Invoices->Type number of new invoice
    }

    @Test //2.1 Issue manual invoice for property
    public void manualInvoice(){
        String hotelId = "968";
        String invoiceDate[] = {"22","June","2021"};
        String reservationIncluded = "Until last check-out";
        String firstCheckOutDate[] = {"04","August","2013"};

        loginSteps(AppLinks.INVOICES_EMISSION_URL);

        InvoiceEmissionPage invoiceEmissionPage = new InvoiceEmissionPage();
        ManualInvoicePage manualInvoicePage = invoiceEmissionPage.clickToManualInvoicesEmission();
        manualInvoicePage.setHotelId(hotelId);
        ManualInvoiceEmissionPage manualInvoiceEmissionPage = manualInvoicePage.clickToContinuePropertyIdButton();
        manualInvoiceEmissionPage.setInvoiceDate(invoiceDate);
        manualInvoiceEmissionPage.setInvoiceForReservation();
        manualInvoiceEmissionPage.setReservationIncluded(reservationIncluded);
        manualInvoiceEmissionPage.setFirstCheckOut(firstCheckOutDate);
        manualInvoiceEmissionPage.clickToButton();
        //not finished because no invoices found between dates
    }

    @Test //2.2 Issue manual invoice for property
    public void manualInvoice2(){
        String hotelId = "968";
        String invoiceDate[] = {"22","June","2023"};
        String text = "It is a string for testing";
        String amountOfMoney = "500";

        loginSteps(AppLinks.INVOICES_EMISSION_URL);

        InvoiceEmissionPage invoiceEmissionPage = new InvoiceEmissionPage();
        ManualInvoicePage manualInvoicePage = invoiceEmissionPage.clickToManualInvoicesEmission();
        manualInvoicePage.setHotelId(hotelId);
        ManualInvoiceEmissionPage manualInvoiceEmissionPage = manualInvoicePage.clickToContinuePropertyIdButton();
        manualInvoiceEmissionPage.setInvoiceDate(invoiceDate);
        manualInvoiceEmissionPage.fillTextArea(text);
        manualInvoiceEmissionPage.setAmountOfMoney(amountOfMoney);
        CreateNewInvoicePage newInvoicePage = manualInvoiceEmissionPage.clickToButton();
        newInvoicePage.clickCreateInvoiceButton();
        newInvoicePage.acceptConfirmation();
        CreatedManualInvoicesPage createdManualInvoicesPage = new CreatedManualInvoicesPage();
        createdManualInvoicesPage.clickViewInvoice();
    }
}
