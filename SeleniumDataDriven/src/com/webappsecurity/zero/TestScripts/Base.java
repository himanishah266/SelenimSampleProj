package com.webappsecurity.zero.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
    WebDriver driver;
    @BeforeTest
    public void openApplication() {

        //put the path of chromedriver.exe file..
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //using WebDriver, we are going to open web browser
         ChromeOptions capability = new ChromeOptions();
         capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
         capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

         driver = new ChromeDriver(capability);
         
         driver.get("http://zero.webappsecurity.com/login.html");
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.manage().window().maximize();       
        
    }
    
    @AfterTest
    public void closeApplication() {
        driver.close();
    }

    
    

}
