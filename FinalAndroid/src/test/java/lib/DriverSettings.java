package lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverSettings {

    protected AppiumDriver driver;
    private static final String APPIUM_URL = "http://0.0.0.0:4723/wd/hub";
    private static DriverSettings instance;
    private static final String PLATFORM_ANDROID = "android";

    @Before
    public void setUp() {
        try {
            URL url = new URL(APPIUM_URL);
            driver = new AndroidDriver(url, this.getAndroidDesiredCapabilities());
            //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }

    protected void backgroundApp(int seconds)
    {
        driver.runAppInBackground(Duration.ofSeconds(seconds));
    }

    private DesiredCapabilities getAndroidDesiredCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("avd","Android10");
        capabilities.setCapability("deviceName","AndroidTestDevice");
        capabilities.setCapability("platformVersion","10.0");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","org.wikipedia");
        capabilities.setCapability("appActivity",".main.MainActivity");
        capabilities.setCapability("app","D:\\Education\\Testing\\FinalAndroid\\apps\\org.wikipedia.apk");
        return capabilities;
    }

    public static DriverSettings getInstance()
    {
        if (instance == null) {
            instance = new DriverSettings();
        }
        return instance;
    }

}
