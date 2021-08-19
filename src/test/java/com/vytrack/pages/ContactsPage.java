package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage{

    @FindBy(css=".input-widget")
    public WebElement pageNumber;

    //since we are extending BasePage we do not need explicit constructor for this class

    public WebElement getContactEmail(String email){
        String xpath="//td[text()='"+email +"']";
        return Driver.get().findElement(By.xpath(xpath));
    }


}