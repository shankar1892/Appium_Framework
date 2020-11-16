package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PLP_Page {


    public PLP_Page(AndroidDriver<AndroidElement> driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath="//*[@text='ADD TO CART']")
    public List<WebElement> add_to_cart1;

    @AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
    public  WebElement Add_to_cart_bttn;
}
