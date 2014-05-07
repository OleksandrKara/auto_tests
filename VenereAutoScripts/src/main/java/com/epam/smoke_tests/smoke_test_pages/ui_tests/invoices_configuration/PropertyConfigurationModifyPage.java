package com.epam.smoke_tests.smoke_test_pages.ui_tests.invoices_configuration;

import com.epam.main.Driver;
import com.epam.main.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/27/14
 * Time: 7:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertyConfigurationModifyPage extends Page {

    @FindBy (xpath = "//tr/td/input[@class='submit'][@type='submit']")
    WebElement modifyButton;

    public String selectVenereCompany(String company, String additionCompany){
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='venere_company_id']")));
        if (isElementPresent(By.xpath("//select[@name='venere_company_id']/option[@label = \'"+company+"\'][@selected='selected']")) == true){
            company = additionCompany;
        }
        select.selectByVisibleText(company);
        select.getFirstSelectedOption();
        return company;
    }

    public String selectCurrency(String currency, String additionalCurrency){
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@id = 'currency']")));
        if (isElementPresent(By.xpath("//select[@name='currency']/option[@value = \'"+currency+"\'][@selected='selected']")) == true){
            currency = additionalCurrency;
        }
        select.selectByVisibleText(currency);
        select.getFirstSelectedOption();
        return currency;
    }

    public void clickModify() {
        modifyButton.click();
    }

    public boolean ifElementIsChecked(String variable) {
        return isElementPresent(By.xpath("//tbody/tr[2]/td[text() = \'"+variable+"\']"));
    }

    public void acceptConfirmation() {
        acceptConfirmationMessage();
    }
}
