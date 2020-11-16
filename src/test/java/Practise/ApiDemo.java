package Practise;

import PageObjects.HomePage;
import PageObjects.Preferrences;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApiDemo extends base{

    @Test(dataProvider ="getData",dataProviderClass =TestData.class)
    public void apidemo(String input) throws IOException, InterruptedException {

       service=start_server();

        AndroidDriver<AndroidElement> driver=capabilities("DemoApi");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        HomePage h=new HomePage(driver);
        h.Preferrences.click();
       // driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        Preferrences p=new Preferrences(driver);
        p.dependencies.click();
      //  driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        p.check.click();
       // driver.findElementById("android:id/checkbox").click();
       // driver.findElementByXPath("(//android.widget.LinearLayout)[2]").click();
        p.wifi.click();
      //  driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
        p.edit.sendKeys(input);
       // driver.findElementByClassName("android.widget.EditText").sendKeys("4n3y43b348134y1eb");
        p.buttons.get(1).click();
       // driver.findElementsByClassName("android.widget.Button").get(1).click();
        service.stop();
    }


}
