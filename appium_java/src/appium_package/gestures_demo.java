package appium_package;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//importing tap options libraries
import static io.appium.java_client.touch.TapOptions.tapOptions;
//importing element libraries
import static io.appium.java_client.touch.offset.ElementOption.element;
//importing long press libraries
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
//importing of seconds JAVA liraries
import static java.time.Duration.ofSeconds;

public class gestures_demo extends first_program
{
	public static void main(String[] args) throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver =  capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//tapping on the views
		@SuppressWarnings("rawtypes")
		TouchAction touch = new TouchAction(driver);
		
		AndroidElement view = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		touch.tap(tapOptions().withElement(element(view))).perform();
		
		//long press
		AndroidElement gallery = driver.findElementByAndroidUIAutomator("text(\"Gallery\")");
		gallery.click();
		
		AndroidElement photos = driver.findElementByAndroidUIAutomator("text(\"1. Photos\")");
		photos.click();
		
		AndroidElement long_press_photos = driver.findElementByXPath("//android.widget.ImageView[@index='0']");
		touch.longPress(longPressOptions().withElement(element(long_press_photos)).withDuration(ofSeconds(2))).perform();
		
		AndroidElement content = driver.findElementById("android:id/content");
		String content_text = content.getText();
		System.out.println(content_text);
		
	}
}
