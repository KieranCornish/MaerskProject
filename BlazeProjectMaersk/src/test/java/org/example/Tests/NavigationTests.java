package org.example.Tests;

import org.example.Pages.NavBar;
import org.example.SeleniumConfig.SeleniumConfig;
import org.example.Site.BlazeSite;
import org.junit.BeforeClass;
import org.junit.Test;

    public class NavigationTests {
        private static SeleniumConfig seleniumConfig;
        private static BlazeSite blazeSite;
        private static NavBar navBar;

        @BeforeClass
        public static void setup(){
            seleniumConfig = new SeleniumConfig("chrome","/Users/tech-a40/Downloads/chromedriver");
            blazeSite = new BlazeSite(seleniumConfig.getDriver());
            navBar = new NavBar(seleniumConfig.getDriver());
        }

        @Test
        public void OpenWebpage(){
            blazeSite.goToBlazeURL();
        }

        @Test
        public void goToHomePageViaNavBar(){
            blazeSite.goToBlazeURL();
            navBar.clickHomeLinkNavBar();
        }
        @Test
        public void goToTravelTheWorldPage(){
            blazeSite.goToBlazeURL();
            navBar.clickTravelTheWorldLinkNavBar();
        }
    }

