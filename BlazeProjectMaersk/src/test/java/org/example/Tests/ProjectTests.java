package org.example.Tests;

import org.example.SeleniumConfig.SeleniumConfig;
import org.example.Site.BlazeSite;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProjectTests {
    private static SeleniumConfig seleniumConfig;
    private static BlazeSite blazeSite;

    @BeforeClass
    public static void setup(){
        seleniumConfig = new SeleniumConfig("chrome","/Users/tech-a40/Downloads/chromedriver");
        blazeSite = new BlazeSite(seleniumConfig.getDriver());
    }

    @Test
    public void OpenWebpage(){
        blazeSite.goToBlazeURL();
    }
}
