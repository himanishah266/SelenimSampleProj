package KeywordDriven;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {

    @Test
    public void verifyInvalidLogin() throws IOException {
        String[][] data = GenericMethods.getData("C:\\20f-cst8277-eclipse\\20f-workspace\\SeleniumDataDriven\\keywordDrivenFileNew1.xlsx", "Sheet1");
        Methods mthd = new Methods();
        for(int i=1 ; i< data.length ; i++) {
            
            switch(data[i][3]){
            
            case "openBrowser":
                mthd.openBrowser();
                break;
             
            case "maxBrowser":
                mthd.maxBrowser();
                break;
                
            case "impWait":
                mthd.implementImplicitWait();
                break;
                
            case "navigateToApp" :
                mthd.navigateToApplication(data[i][6]);
                break;
                
            case "enterInTextBox":
                mthd.enterInTextBox(data[i][5], data[i][6]);
                break;
                
            case "clickButton":
                mthd.clickSignInButton(data[i][4], data[i][5]);
                break;
                
            case "verifyMsg":
                String actualMsg = mthd.getMessage(data[i][5]);
                Assert.assertEquals(actualMsg, data[i][6] );
                break;
                
            case "closeApp":
                mthd.closeApplication();
                break;
                
                
            }
            
            
        }
        
    }
    
}
