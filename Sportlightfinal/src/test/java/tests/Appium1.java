package tests;

import static org.junit.Assert.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Appium1 extends BaseClass {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("platformVersion", "10");
    desiredCapabilities.setCapability("deviceName", "SamsungM20");
    desiredCapabilities.setCapability("udid", "3201e6985a0e6625");
    desiredCapabilities.setCapability("app", "C:\\Users\\User\\Downloads\\app-debug.apk");
    desiredCapabilities.setCapability("appPackage", "com.roninaks.sportlight");
    desiredCapabilities.setCapability("appActivity", ".activities.TutorialActivity");
    desiredCapabilities.setCapability("automationName", "UiAutomator2");
    desiredCapabilities.setCapability("appWaitActivity", "*");

    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
	  
//	   // creates a toggle for the given test, adds all log events under it    
//      ExtentTest test1 =extent.createTest("MyFirstTest", "Sample description for demo");
//  
//      // log(Status, details)
//      test1.log(Status.INFO, "Test One started");
      
    MobileElement el1 = (MobileElement) driver.findElementById("com.roninaks.sportlight:id/edt_username");
    el1.click();
//    // log(Status, details)
//    test1.log(Status.PASS, "el1");
    el1.sendKeys("glory@gmail.com");
    MobileElement el2 = (MobileElement) driver.findElementById("com.roninaks.sportlight:id/edt_password");
    el2.click();
    el2.sendKeys("Glory@123");
    MobileElement el3 = (MobileElement) driver.findElementById("com.roninaks.sportlight:id/btn_log_in");
    el3.click();
//    // log(Status, details)
//    test1.log(Status.INFO, "Test One Completed");
  }

//  @After
//  public void tearDown() {
//    driver.quit();
//  }
}
