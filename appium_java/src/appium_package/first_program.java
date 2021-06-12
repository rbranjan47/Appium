package appium_package;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class first_program
{
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		//capability type
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Mi A1");
		//automation type
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		//path of app
		File fs = new File("src");
		File fsp = new File(fs, "ApiDemos-debug.apk");
		
		String file_path = fsp.getAbsolutePath();
		cap.setCapability(MobileCapabilityType.APP, file_path);
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		return driver;
	}
}
