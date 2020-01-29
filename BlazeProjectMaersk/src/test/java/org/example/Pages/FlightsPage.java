package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {
    private WebDriver driver;
    private String blazeURL = "http://blazedemo.com/index.php";
    private By ChooseFlightButton = By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input");

    public FlightsPage (WebDriver driver){
        this.driver = driver;
    }
    public FlightsPage clickChooseThisFlightButton(){
        driver.findElement(ChooseFlightButton).click();
        return this;
    }
}
