package test.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop;

	public BaseTest() {

		prop = new Properties();
		FileInputStream ip = null;
		try {
			ip = new FileInputStream(
					"/Users/narah/eclipse-workspace/AutomationTest/src/main/java/test/config/config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialisation() {
		String browsertype = prop.getProperty("browser");
		int pageloadtimeout = Integer.parseInt(prop.getProperty("pageloadtimeout"));
		int implicittimeout = Integer.parseInt(prop.getProperty("timeout"));

		if (browsertype.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsertype.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsertype.equalsIgnoreCase("ie"))
		{
		System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		} else if (browsertype.equalsIgnoreCase("safari"))
		{		
		System.setProperty("webdriver.safari.driver", "C:\\Selenium\\Safari");
		driver = new SafariDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(pageloadtimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(implicittimeout, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

}
