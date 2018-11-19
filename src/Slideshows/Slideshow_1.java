package Slideshows;

import java.net.MalformedURLException;

import utils.Baseclass;
import io.appium.java_client.android.AndroidDriver;

public class Slideshow_1 extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = capabilities();
		
		System.out.println(driver.findElementByXPath("//android.widget.TextView[@index='1']").getText());
		System.out.println(driver.findElementByXPath("//android.widget.TextView[@index='2']").getText());
		driver.findElementByXPath("//android.widget.TextView[@text='Next']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Next']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Get Started']").click();
	}

}
