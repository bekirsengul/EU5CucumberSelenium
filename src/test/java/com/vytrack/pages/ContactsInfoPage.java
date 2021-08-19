package com.vytrack.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsInfoPage extends BasePage {

    @FindBy(xpath = "(//*[@class='user-name'])[1]")
    public WebElement fullname;

    @FindBy(xpath = "//*[@class='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@class='phone']")
    public WebElement phoneNumber;

}