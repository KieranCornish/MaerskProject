package org.example.Tests;

import org.example.Pages.NavBar;
import org.example.Pages.TravelTheWorldPage;
import org.example.SeleniumConfig.SeleniumConfig;
import org.example.Site.BlazeSite;
import org.junit.BeforeClass;
import org.junit.Test;

public class TravelTheWorldPageTests {
    private static SeleniumConfig seleniumConfig;
    private static BlazeSite blazeSite;
    private static NavBar navBar;
    private static TravelTheWorldPage travelTheWorldPage;

    @BeforeClass
    public static void setup(){
        seleniumConfig = new SeleniumConfig("chrome","/Users/tech-a40/Downloads/chromedriver");
        blazeSite = new BlazeSite(seleniumConfig.getDriver());
        navBar = new NavBar(seleniumConfig.getDriver());
        travelTheWorldPage = new TravelTheWorldPage(seleniumConfig.getDriver());
    }
    @Test
    public void destinationOfTheWeekLink(){
        blazeSite.goToBlazeURL();
        navBar.clickTravelTheWorldLinkNavBar();
        travelTheWorldPage.clickDestinationOfTheWeekLink();
    }
    @Test
    public void depatureCity(){
        blazeSite.goToBlazeURL();
        navBar.clickTravelTheWorldLinkNavBar();
        travelTheWorldPage.clickDepartureCity();
    }
    @Test
    public void destinationCity(){
        blazeSite.goToBlazeURL();
        navBar.clickTravelTheWorldLinkNavBar();
        travelTheWorldPage.clickDestinationCity();
    }
    @Test
    public void submitButton(){
        blazeSite.goToBlazeURL();
        navBar.clickTravelTheWorldLinkNavBar();
        travelTheWorldPage.clickSubmitButton();
    }
    @Test
    public void fillOutDestination(){
        blazeSite.goToBlazeURL();
        navBar.clickTravelTheWorldLinkNavBar();
        travelTheWorldPage.clickDestinationCity().clickDepartureCity().clickSubmitButton();
    }
}
