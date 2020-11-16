package Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Scroll {

    AndroidDriver driver;

    public Scroll(AndroidDriver<AndroidElement> driver){

        this.driver=driver;
    }

    public void scroll_to_text(String text){

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");

    }
}
