package utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Baseclass {

	public static AndroidDriver driver;
	public static AndroidDriver capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f= new File("src");
		File fs = new File(f,"myPAT Teachers Beta Testing_v2.1.4.apk");

		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.ANDROID);
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G4");
		Cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
//		Cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),Cap);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		return driver;
	}

}
