package com.epam.main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/23/14
 * Time: 11:31 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Page {

    protected boolean isElementPresent(By locator) {
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        List<WebElement> elements = Driver.getDriver().findElements(locator);
        Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return elements.size() > 0 && elements.get(0).isDisplayed();
    }

    protected void type(WebElement webElement, String text){
        webElement.clear();
        webElement.sendKeys(text);
    }

    protected void acceptConfirmationMessage() {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    protected void selectElementByTheText(String locator, String text){
        Select select = new Select(Driver.getDriver().findElement(By.xpath(locator)));
        select.selectByVisibleText(text);
        select.getFirstSelectedOption();
    }

    protected void deselectAllAndSelectElementByTheText(String locator, String text){
        Select select = new Select(Driver.getDriver().findElement(By.xpath(locator)));
        select.deselectAll();
        select.selectByVisibleText(text);
        select.getFirstSelectedOption();
    }

    protected void javaScriptCodeExecutor(String javaScriptCode){
        ((JavascriptExecutor) Driver.getDriver()).executeScript(javaScriptCode);
    }

    protected void javaScriptClick(String locator){
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].click();", locator);
    }

    //protected abstract void open();
}
