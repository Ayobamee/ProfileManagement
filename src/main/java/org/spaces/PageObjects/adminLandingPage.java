package org.spaces.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.PageComponents.*;

public class adminLandingPage {

    By continueElement = By.xpath("//button[contains(text(),'Continue with phone number')]");
    By dashboard = By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[1]/a[1]");





    WebDriver driver;

    public adminLandingPage(WebDriver driver) {

        this.driver = driver;


    }

    public void goTo()
    {
        driver.get("https://admin-staging.spaceso2o.com/");
    }



    public StartUpBar getStartUpBar()
    {

        return new StartUpBar(driver, continueElement);
    }




    public dashboard getdashboard()

    {
        return new dashboard(driver, dashboard);
    }
}