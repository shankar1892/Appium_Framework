package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Preferrences {

    public Preferrences(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
    public WebElement dependencies;

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement check;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
    public WebElement wifi;

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement edit;



    @AndroidFindBy(className="android.widget.Button")
    public List<WebElement> buttons;



}
