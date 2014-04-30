package com.epam.ui.invoice_emission;

import com.epam.main.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/1/14
 * Time: 12:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class QuarterInvoicesEmissionPage extends Page {

    private String locatorOfCompany = "//td/select[@name = 'venere_company_id']";
    private String locatorOfStartDate = "//select[@name = 'from_mm']";
    private String locatorOfEndDate = "//select[@name = 'to_mm']";
    private String locatorCountry = "//select[@id='country_geo_id_array']";
    private String locatorBillingGroup = "//select[@name = 'billing_group']";

    @FindBy (xpath = "//td[2]/input[@name = 'create_check'][@value = 1]")
    WebElement radioButtonCreateInvoice;

    @FindBy (xpath = "//input[@id='create_button']")
    WebElement createButton;

    public void acceptConfirmation(){
        acceptConfirmationMessage();
    }

    public void selectTheCompany(String company) {
        selectElementByTheText(locatorOfCompany, company);
    }

    public void setExaminedInterval(String startDate, String endDate) {
        selectElementByTheText(locatorOfStartDate, startDate);
        selectElementByTheText(locatorOfEndDate, endDate);
    }

    public void setCountry(String country) {
        deselectAllAndSelectElementByTheText(locatorCountry, country);
    }

    public void setCreateInvoice() {
        radioButtonCreateInvoice.click();
    }

    public void createAndInsertInvoices() {
        createButton.click();
    }

    public void setBillingGroup(String billingGroup) {
        selectElementByTheText(locatorBillingGroup, billingGroup);
    }

    public boolean doesTheCompanyIsTheSame(String company) {
        return isElementPresent(By.xpath("//td/select[@name = 'venere_company_id']/option[@label=\'" + company + "\'][@selected='selected']"));
    }

    public boolean doesTheCountryIsTheSame(String country) {
        return isElementPresent(By.xpath("//td/select[@id = 'country_geo_id_array']/option[@label=\'" + country + "\'][@selected='selected']"));
    }

    public boolean doesTheBillingGroupIsTheSame(String billingGroup) {
        return isElementPresent(By.xpath("//td/select[@name = 'billing_group']/option[@label=\'" + billingGroup + "\'][@selected='selected']"));
    }
}
