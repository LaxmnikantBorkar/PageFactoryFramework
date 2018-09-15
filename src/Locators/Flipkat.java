package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkat {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\ejagruti\\mm\\DRIVERS\\chromedriver_from_32 and 64 bit_worked for version_v64-66.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Opened");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		System.out.println("Flipkat site opened");

	}

}
