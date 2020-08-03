package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.AfterMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass extends ExtentReportsDemo{
	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) {
		try {
			openSportlight();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	public static void openSportlight() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

	    cap.setCapability("app", "C:\\Users\\User\\Downloads\\app-debug.apk");
	    cap.setCapability("deviceName", "SamsungM20");
		cap.setCapability("udid", "3201e6985a0e6625");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.roninaks.sportlight");
		cap.setCapability("appActivity", ".activities.TutorialActivity");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		URL url = new URL ("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url, cap);

		System.out.println("Application Started....");
	}
//	   @AfterMethod(alwaysRun = true)
//	    public void tearDown() throws Exception {
//	        driver.quit();
//	    }
}