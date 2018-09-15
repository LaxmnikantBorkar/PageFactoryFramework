package Steps;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.xpath.operations.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.beust.jcommander.Parameter;
import com.jayway.jsonpath.JsonPath;

public class BaseClass {
	private static final String TestData = null;
	WebDriver driver;
	String envFileName;

	@BeforeTest
	@Parameters({ "Browser", "envName" })
	public void beforeTest(String Browser, String envName)
			throws InterruptedException {
		envFileName = envName;
		String url = getProperties("url");
		System.out.println(url);

		switch (Browser) {
		case "chrome":
			System.setProperty(
					"webdriver.chrome.driver",
					"C:\\ejagruti\\mm\\DRIVERS\\chromedriver_from_32 and 64 bit_worked for version_v64-66.exe");
			driver = new ChromeDriver();
			System.out.println("Browser Opened");
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(4000);

			/*
			 * case "mozilla": System.setProperty( "webdriver.gecko.driver",
			 * "C:\\ejagruti\\mm\\DRIVERS\\geckodriver64bit_worked_for_v46-48.exe"
			 * ); driver = new FirefoxDriver();
			 * System.out.println("Browser Opened");
			 * driver.manage().window().maximize(); driver.get(url);
			 * Thread.sleep(4000);
			 */
		}
	}

	public String getProperties(String key) {
		Properties prop = new Properties();
		String value = null;
		try {

			String path = System.getProperty("user.dir") + "\\Enviourments\\"
					+ envFileName + ".properties";
			System.out.println(path);
			File f = new File(path);
			FileReader reader = new FileReader(f);
			prop.load(reader);
			System.out.println(prop.getProperty(key));
			value = prop.getProperty(key);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return value;

	}

	public void userType(WebElement wb, String text) {

		wb.sendKeys(text);
	}
	public void userType(Select sc, int date) {

		sc.selectByIndex(date);
	}


	public void userClick(WebElement wb) {
		wb.click();
	}

	public static String getJsonValue(String jsonPath) throws IOException {
		String path = System.getProperty("user.dir")
				+ "\\TestData\\TestData.JSON";
		String jsonString = new String(Files.readAllBytes(Paths.get(path)));
		String value = JsonPath.read(jsonString, jsonPath);
		return value;

	}

	public void sleep(int seconds) {
		
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Waiting for " + seconds);
	}
}
