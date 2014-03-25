package com.epam.main;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 19.03.14
 * Time: 13:18
 * To change this template use File | Settings | File Templates.
 */
public class Driver {

    private Driver() {
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static boolean isElementPresent(By locator) {
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        List<WebElement> elements = getDriver().findElements(locator);
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return elements.size() > 0 && elements.get(0).isDisplayed();
    }

    public static void init() {
        //Configurations for file properties using
        Properties properties = new Properties();
        FileInputStream propFile;
        try {
            propFile = new FileInputStream("test.properties");
            properties.load(propFile);
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
        @SuppressWarnings("unchecked")
        Enumeration<String> e = (Enumeration<String>) properties.propertyNames();
        while (e.hasMoreElements()) {
            String key = e.nextElement();
            System.setProperty(key, properties.getProperty(key));
            //Reporter.log(key + " - " + properties.getProperty(key), 2, true);
        } //Configurations for file properties using




        switch (System.getProperty("test.browser")) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                throw new AssertionError("Unsupported browser: " + System.getProperty("test.browser"));
        }

        //Configurations for synchronization
        driver.manage().timeouts().implicitlyWait(
                Integer.parseInt(System.getProperty("test.timeout")),
                TimeUnit.SECONDS
        ); //Configurations for synchronization
    }

    public static void javaScript(String javaScriptCode){
        ((JavascriptExecutor) getDriver()).executeScript(javaScriptCode);
    }

    public static void tearDown() {
        Driver.getDriver().quit();
    }
}
