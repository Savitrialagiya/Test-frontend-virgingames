package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineSlotPage extends Utility {
    private static final Logger log = LogManager.getLogger(OnlineSlotPage.class.getName());

    public OnlineSlotPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Play Online Slots at Virgin Games')]")
    WebElement getOnlineSlot;

    public String  getOnlineSlotText(){
        log.info("verify Online Slot text" + getOnlineSlot.getText());
        return getTextFromElement(getOnlineSlot);
    }

}
