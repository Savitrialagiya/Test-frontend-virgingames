package com.virgingames.cucumber.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.OnlineBingoPage;
import com.virgingames.pages.OnlineSlotPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class VirginStepdef {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I accept cookies$")
    public void iAcceptCookies() throws InterruptedException {
        Thread.sleep(2000);
        new HomePage().acceptCookies();
    }

    @And("^I click on online slots tab from top tab menu$")
    public void iClickOnOnlineSlotsTabFromTopTabMenu() {
        new HomePage().clickOnOnLineSlot();
    }

    @Then("^I verify 'Play Online Slots at Virgin Games' text$")
    public void iVerifyPlayOnlineSlotsAtVirginGamesText() {
        Assert.assertEquals("Message not displayed","Play Online Slots at Virgin Games",
                new OnlineSlotPage().getOnlineSlotText() );
    }

    @And("^I click on online Bingo tab from top tab menu$")
    public void iClickOnOnlineBingoTabFromTopTabMenu() {
        new HomePage().clickOnOnlineBingo();
    }

    @Then("^I verify 'What is the best online bingo site\\?' text$")
    public void iVerifyWhatIsTheBestOnlineBingoSiteText() {
        Assert.assertEquals("Message not displayed","What is the best online bingo site?",
                new OnlineBingoPage().getOnlineSlotText());
    }
}
