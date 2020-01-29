package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavBar {
    private WebDriver driver;
    private String blazeURL = "http://blazedemo.com/index.php";
    private By NavHomeButton = By.xpath("/html/body/div[1]/div/div/a[3]");
    private By NavTravelTheWorldButton = By.xpath("/html/body/div[1]/div/div/a[2]");


    public NavBar(WebDriver driver) {
        this.driver = driver;
    }

    public NavBar clickHomeLinkNavBar() {
        driver.findElement(NavHomeButton).click();
        return this;
    }

    public NavBar clickTravelTheWorldLinkNavBar(){
        driver.findElement(NavTravelTheWorldButton).click();
        return this;
    }

}
