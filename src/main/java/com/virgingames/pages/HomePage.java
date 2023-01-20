package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[@data-qa='accept-cookie-policy']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Online Slots')]")
    WebElement onlineSlot;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Online Bingo')]")
    WebElement onlineBingo;


    public void acceptCookies(){
        log.info("Accept cookies" + acceptCookies.toString());
        clickOnElement(acceptCookies);
    }

    public void clickOnOnLineSlot(){
        log.info("Click on Online Slot" + onlineSlot.toString());
        clickOnElement(onlineSlot);
    }

    public void clickOnOnlineBingo(){
        log.info("Click on onlineBingo " + onlineBingo.toString());
        clickOnElement(onlineBingo);
    }


}
