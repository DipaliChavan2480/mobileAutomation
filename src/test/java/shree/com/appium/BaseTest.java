package shree.com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class BaseTest {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@BeforeClass
	
		public void configureAppium() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("emulator-5554");
		options.setApp("C:\\Users\\Admin\\OneDrive\\Appium\\Eclipse\\appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
//		service.stop();
	}
}
