package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    
    public Login(WebDriver driver){
        //locate all these web elements of this class on the driver 
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id= "user_login")
    private WebElement uName;
    
    @FindBy(id = "user_password")
    private WebElement uPwd;
    
    @FindBy(name ="submit")
    private WebElement submitBtn;
    
    @FindBy(css = "#login_form > div.alert.alert-error")
    private WebElement loginErrorMessage;
    
   
    public void applicationLogin(String user1, String password1) {
        System.out.println(user1+"      "+password1);
        uName.sendKeys(user1);
        uPwd.sendKeys(password1);
        submitBtn.click();

        
    }
    
    
    public String getErrorMessage() {
        String errorMessage = loginErrorMessage.getText();
        return errorMessage;
        
    }
        
    
    
    
    
    
    
    

}
