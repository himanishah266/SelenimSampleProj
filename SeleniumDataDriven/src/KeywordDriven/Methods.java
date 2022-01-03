package KeywordDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
    
    WebDriver driver;
    
    public void openBrowser() {
        // TODO Auto-generated method stub
        driver = new ChromeDriver();
    }



    public void maxBrowser() {
        // TODO Auto-generated method stub
        driver.manage().window().maximize();
        
    }



    public void implementImplicitWait() {
        // TODO Auto-generated method stub
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



    public void navigateToApplication(String url) {
        // TODO Auto-generated method stub
        driver.get(url);
        
    }


    public void enterInTextBox(String locVal, String data) {
        // TODO Auto-generated method stub
        driver.findElement(By.id(locVal)).sendKeys(data);
        
    }



    public void clickSignInButton(String locName, String locVal) {
        // TODO Auto-generated method stub
        if(locName.equals("name")) {
            driver.findElement(By.name(locVal)).click();
        }
        else {
            driver.findElement(By.xpath(locVal)).click();
        }
        
    }



    public String getMessage(String locVal) {
        // TODO Auto-generated method stub
        String actualMsg = driver.findElement(By.cssSelector(locVal)).getText();
        return actualMsg;
    }



    public void closeApplication() {
        // TODO Auto-generated method stub
        driver.close();
    }




}
