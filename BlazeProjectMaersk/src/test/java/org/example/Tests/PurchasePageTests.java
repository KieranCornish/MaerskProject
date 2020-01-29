package org.example.Tests;

import org.example.Pages.FlightsPage;
import org.example.Pages.NavBar;
import org.example.Pages.PurchasePage;
import org.example.Pages.TravelTheWorldPage;
import org.example.SeleniumConfig.SeleniumConfig;
import org.example.Site.BlazeSite;
import org.junit.BeforeClass;
import org.junit.Test;

public class PurchasePageTests {
        private static SeleniumConfig seleniumConfig;
        private static BlazeSite blazeSite;
        private static NavBar navBar;
        private static TravelTheWorldPage travelTheWorldPage;
        private static FlightsPage flightsPage;
        private static PurchasePage purchasePage;

    @BeforeClass
    public static void setup(){
        seleniumConfig = new SeleniumConfig("chrome","/Users/tech-a40/Downloads/chromedriver");
        blazeSite = new BlazeSite(seleniumConfig.getDriver());
        navBar = new NavBar(seleniumConfig.getDriver());
        travelTheWorldPage = new TravelTheWorldPage(seleniumConfig.getDriver());
        flightsPage = new FlightsPage(seleniumConfig.getDriver());
        purchasePage = new PurchasePage(seleniumConfig.getDriver());
    }

    @Test
    public void FillInForm() {
        blazeSite.goToBlazeURL();
        navBar.clickTravelTheWorldLinkNavBar();
        travelTheWorldPage.clickDestinationCity().clickDepartureCity().clickSubmitButton();
        flightsPage.clickChooseThisFlightButton();
        purchasePage.fillInName("Kieran Cornish").fillInAddress("5 spartaglobal avenue").fillInCity("london").fillInState("new york").fillInZipcode("cm123hf").selectCard().fillInCardNumber("63466346346").fillInCardMonth("07").fillInCardYear("20").fillInCardName("K J Cornish").tickRememberMe().submitForm();
    }

}
