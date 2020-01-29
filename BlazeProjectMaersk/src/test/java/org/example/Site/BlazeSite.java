package org.example.Site;


import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BlazeSite {
    private WebDriver driver;
    private String blazeURL = "http://blazedemo.com/index.php";



    public BlazeSite(WebDriver driver){
        this.driver = driver;

    }
    public void goToBlazeURL(){
        driver.navigate().to(blazeURL);
    }

    public void waitElement(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}
