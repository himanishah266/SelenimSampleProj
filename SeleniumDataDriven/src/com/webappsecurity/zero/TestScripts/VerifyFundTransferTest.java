package com.webappsecurity.zero.TestScripts;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.webappsecurity.zero.Pages.AccountSummary;
import com.webappsecurity.zero.Pages.Login;
import com.webappsecurity.zero.Pages.TransferFunds;
import com.webappsecurity.zero.Pages.TransferFundsConfirmation;
import com.webappsecurity.zero.Pages.TransferFundsVerify;

import utils.GenericMethods;

public class VerifyFundTransferTest extends Base {
    
   
    
    @Test
    public void doFundTransfer() throws InterruptedException, IOException {
        Login lp = new Login(driver);
        AccountSummary acc = new AccountSummary(driver);
        TransferFunds tf = new TransferFunds(driver);
        TransferFundsVerify vf= new TransferFundsVerify(driver);
        TransferFundsConfirmation cf= new TransferFundsConfirmation(driver);
        
        Thread.sleep(1500);
        String[][] data = GenericMethods.getData("C:\\20f-cst8277-eclipse\\20f-workspace\\SeleniumDataDriven\\Book.xlsx", "Sheet1");
        
        for(int i= 1; i < data.length ; i++) {
        lp.applicationLogin(data[i][0], data[i][1]);
        Thread.sleep(1500);
        acc.clickTransferFunds();
        tf.doFundTransfer(data[i][2], data[i][3]);
        vf.clickSubmit();
        String actual = cf.getText();
        String expected = data[i][4];
        Assert.assertEquals(actual, expected);
        cf.appLogOut();
        }
    }
    
    
 
}
