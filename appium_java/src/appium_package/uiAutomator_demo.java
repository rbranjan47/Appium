package appium_package;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiAutomator_demo extends first_program {
	public static void main(String[] args) throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver =  capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//getting the clickable items in the view page
		List<AndroidElement> elements = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)");
		System.out.println(elements.size());
		
	}
}
