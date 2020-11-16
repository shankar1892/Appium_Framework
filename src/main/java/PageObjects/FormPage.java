package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class FormPage {

    public FormPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }
    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    public WebElement name;

    @AndroidFindBy(xpath = "//*[@text='Female']")
    public WebElement radiobutton;

    @AndroidFindBy(id="android:id/text1")
    public WebElement dropdown;

    @AndroidFindBy(xpath = "//*[@text='Argentina']")
    public WebElement countryselection;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
     public WebElement lets_shop;







}
