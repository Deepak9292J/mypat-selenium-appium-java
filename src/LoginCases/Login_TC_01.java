package LoginCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import utils.Baseclass;
import io.appium.java_client.android.AndroidDriver;

public class Login_TC_01 extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Next']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Next']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Get Started']").click();
		WebElement username_placeholder= driver.findElementByXPath("//android.widget.TextView[@text='Employee Code']");
		WebElement username_input = driver.findElementByXPath("(//android.widget.EditText)[1]");
		WebElement password_placeholder = driver.findElementByXPath("//android.widget.TextView[@text='Password']");
		WebElement password_input = driver.findElementByXPath("(//android.widget.EditText)[2]");
		
		
		username_input.sendKeys("code");
		password_input.sendKeys("pass");
		driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.TextView[@text='Login']").click();	
		WebElement toastView = driver.findElementByXPath("//android.widget.Toast[1]");
		String text = toastView.getAttribute("name");
		System.out.println(text);
	}

}
