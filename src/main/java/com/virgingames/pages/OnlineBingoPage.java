package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineBingoPage extends Utility {
    private static final Logger log = LogManager.getLogger(OnlineBingoPage.class.getName());

    public OnlineBingoPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h3[contains(text(),'What is the best online bingo site?')]")
    WebElement getOnlineBingo;

    public String  getOnlineSlotText(){
        log.info("verify Online Slot text" + getOnlineBingo.getText());
        return getTextFromElement(getOnlineBingo);
    }

}
