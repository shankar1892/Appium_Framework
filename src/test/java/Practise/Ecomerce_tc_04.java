package Practise;

import PageObjects.Checkout_Page;
import PageObjects.FormPage;
import PageObjects.PLP_Page;
import Utilities.Scroll;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class Ecomerce_tc_04 extends base {

  @BeforeTest
  public void killAllNodes() throws IOException {
    Runtime.getRuntime().exec("sudo killall node");

  }


    @Test
    public void totalvalidation() throws IOException, InterruptedException {

      service=start_server();

        AndroidDriver<AndroidElement> driver = capabilities("GeneralStoreApp");
        driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);

        FormPage formPage = new FormPage(driver);
        formPage.name.sendKeys("shankar");
        //driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
        driver.hideKeyboard();


        formPage.radiobutton.click();
        //driver.findElement(By.xpath("//*[@text='Female']")).click()


        formPage.dropdown.click();
        //driver.findElement(By.id("android:id/text1")).click();
        Scroll scroll=new Scroll(driver);
        scroll.scroll_to_text("Argentina");
      //  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
        //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));


        formPage.countryselection.click();
        //driver.findElement(By.xpath("//*[@text='Argentina']")).click();

        formPage.lets_shop.click();
        // driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        PLP_Page plp_page = new PLP_Page(driver);
        plp_page.add_to_cart1.get(0).click();
        //driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

        plp_page.add_to_cart1.get(0).click();
        //driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

        plp_page.Add_to_cart_bttn.click();
        // driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Thread.sleep(4000);
        service.stop();

        //Mobile Gestures


//        WebElement checkbox = driver.findElement(By.className("android.widget.CheckBox"));
//        TouchAction t = new TouchAction(driver);
//        t.tap(tapOptions().withElement(element(checkbox))).perform();
//
//        Checkout_Page  checkout_page=new Checkout_Page(driver);
//        checkout_page.proceed_buttn.click();
//        //driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
//        Thread.sleep(3000);
//        Set<String> contexts = driver.getContextHandles();
//        for (String contextName : contexts) {
//
//            System.out.println(contextName);}
//            driver.context("WEBVIEW_com.androidsample.generalstore");
//            // driver.findElement(By.name("q")).sendKeys("hello");
//            driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[1]/input")).sendKeys("hello");
//            driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER);
//            driver.pressKey(new KeyEvent(AndroidKey.BACK));
//            driver.context("NATIVE_APP");


        }


    }



