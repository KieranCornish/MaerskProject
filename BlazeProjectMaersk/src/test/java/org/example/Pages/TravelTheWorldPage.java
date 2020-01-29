package org.example.Pages;

import org.example.SeleniumConfig.SeleniumConfig;
import org.example.Site.BlazeSite;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TravelTheWorldPage {

    private WebDriver driver;
    private String blazeURL = "http://blazedemo.com/index.php";
    private By destinationOfTheWeek = By.xpath("/html/body/div[2]/div/p[2]/a");
    private By departureCity = By.xpath("/html/body/div[3]/form/select[1]");
    private By destinationCity = By.xpath("/html/body/div[3]/form/select[2]");
    private By submitButton = By.xpath("/html/body/div[3]/form/div/input");

    public TravelTheWorldPage(WebDriver driver){
        this.driver = driver;
    }
    public TravelTheWorldPage clickDestinationOfTheWeekLink(){
        driver.findElement(destinationOfTheWeek).click();
        return this;
    }
    public TravelTheWorldPage clickDepartureCity(){
        driver.findElement(departureCity).click();
        return this;
    }
    public TravelTheWorldPage clickDestinationCity(){
        driver.findElement(destinationCity).click();
        return this;
    }
    public TravelTheWorldPage clickSubmitButton(){
        driver.findElement(submitButton).click();
        return this;
    }
}
