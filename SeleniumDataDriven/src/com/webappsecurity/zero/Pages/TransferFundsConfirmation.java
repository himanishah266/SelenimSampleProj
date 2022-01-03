package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirmation {
    
    
    public TransferFundsConfirmation(WebDriver driver){
        //locate all these web elements of this class on the driver 
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#transfer_funds_content > div > div > div.alert.alert-success")
    private WebElement verifyMsg;
    
    @FindBy(css = "#settingsBox > ul > li:nth-child(3) > a")
    private WebElement userNameIcon;
    
    @FindBy(linkText = "Logout")
    private WebElement logout;
    
    @FindBy(id = "signin_button")
    private WebElement signIn;
    
    public String getText() {
        String actualMsg = verifyMsg.getText();
        return actualMsg;
        
    }
    
    public void appLogOut() {
        userNameIcon.click();
        logout.click();
        signIn.click();
        
    }

}
