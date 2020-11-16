package Practise;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;

public class base {

  public static AndroidDriver<AndroidElement> driver;

    //auto start the appium server
    public static AppiumDriverLocalService service;

    public AppiumDriverLocalService start_server(){

        boolean flag= checkIfServerIsRunnning(4723);
        if (!flag){
        service=AppiumDriverLocalService.buildDefaultService();
        service.start();
        }
        return service;
    }


    public static boolean checkIfServerIsRunnning(int port) {

        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(port);

            serverSocket.close();
        } catch (IOException e) {
            //If control comes here, then it means that the port is in use
            isServerRunning = true;
        } finally {
            serverSocket = null;
        }
        return isServerRunning;
    }

    public static void StartEmulator() throws IOException {
        Runtime.getRuntime().exec(System.getProperty("user.dir")+"/src/main/java/resources/startEmulator");
    }



    public static AndroidDriver<AndroidElement> capabilities(String App_name) throws IOException, InterruptedException {


        FileInputStream fileread=new FileInputStream( System.getProperty("user.dir")+"/src/main/java/Practise/global.properties");
        Properties prop=new Properties();
        prop.load(fileread);



        File f = new File("src");
        File fs = new File(f, (String) prop.get(App_name));
        DesiredCapabilities cap = new DesiredCapabilities();


       // String device= (String) prop.get("device");
        String device=System.getProperty("deviceName");
        if (device.contains("emulator")){
            StartEmulator();
        }

      cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
      Thread.sleep(6000);

       cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
       cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,7);
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;

       }
       public static void getScreenShot(String failed) throws IOException {
      File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           FileUtils.copyFile(screenshot,new File(System.getProperty("user.dir")+"\\"+failed+".png"));

       }
}
