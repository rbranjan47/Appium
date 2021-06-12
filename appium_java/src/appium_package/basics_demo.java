package appium_package;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics_demo extends first_program
{
	public static void main(String[] args) throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver =  capabilities();
		//clicking on prefrences 
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		//clicking on prefrences dependencies
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		//clicking on check box
		driver.findElementById("android:id/widget_frame").click();
		//clicking on settings
		driver.findElementByXPath("//android.widget.LinearLayout[2]").click();
		//passing values
		driver.findElementById("android:id/edit").sendKeys("my_wifi");
		//clicking on OK
		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
	}
}
