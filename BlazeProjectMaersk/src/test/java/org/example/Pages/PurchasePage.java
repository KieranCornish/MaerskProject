package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage {
    private WebDriver driver;
    private String blazeURL = "http://blazedemo.com/index.php";
    private By nameBox = By.xpath("/html/body/div[2]/form/div[1]/div/input");
    private By addressBox = By.xpath("/html/body/div[2]/form/div[2]/div/input");
    private By cityBox = By.xpath("/html/body/div[2]/form/div[3]/div/input");
    private By stateBox = By.xpath("/html/body/div[2]/form/div[4]/div/input");
    private By zipCodeBox = By.xpath("/html/body/div[2]/form/div[5]/div/input");
    private By cardBox = By.xpath("/html/body/div[2]/form/div[6]/div/select/option[1]");
    private By cardNumberBox = By.xpath("/html/body/div[2]/form/div[7]/div/input");
    private By cardMonthBox = By.xpath("/html/body/div[2]/form/div[8]/div/input");
    private By cardYearBox = By.xpath("/html/body/div[2]/form/div[9]/div/input");
    private By nameOnCardBox = By.xpath("/html/body/div[2]/form/div[10]/div/input");
    private By selectRememberMeBox =By.xpath("/html/body/div[2]/form/div[11]/div/label/input");
    private By sumbmitButton = By.xpath("/html/body/div[2]/form/div[11]/div/input");

    public PurchasePage (WebDriver driver) {
        this.driver = driver;
    }

    public PurchasePage fillInName(String name){
        driver.findElement(nameBox).sendKeys(name);
        return this;
    }
    public PurchasePage fillInAddress(String address){
        driver.findElement(addressBox).sendKeys(address);
        return this;
    }
    public PurchasePage fillInCity(String city){
        driver.findElement(cityBox).sendKeys(city);
        return this;
    }
    public PurchasePage fillInState(String state){
        driver.findElement(stateBox).sendKeys(state);
        return this;
    }
    public PurchasePage fillInZipcode(String zip){
        driver.findElement(zipCodeBox).sendKeys(zip);
        return this;
    }
    public PurchasePage selectCard(){
        driver.findElement(cardBox).click();
        return this;
    }
    public PurchasePage fillInCardNumber(String number){
        driver.findElement(cardNumberBox).sendKeys(number);
        return this;
    }
    public PurchasePage fillInCardMonth(String number){
        driver.findElement(cardMonthBox).sendKeys(number);
        return this;
    }
    public PurchasePage fillInCardYear(String number){
        driver.findElement(cardYearBox).sendKeys(number);
        return this;
    }
    public PurchasePage fillInCardName(String name){
        driver.findElement(nameOnCardBox).sendKeys(name);
        return this;
    }
    public PurchasePage tickRememberMe(){
        driver.findElement(selectRememberMeBox).click();
        return this;
    }
    public PurchasePage submitForm(){
        driver.findElement(sumbmitButton).click();
        return this;
    }

}

