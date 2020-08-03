package com.dev.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleSelTest {


	WebDriver driver;
	String URL = "https://www.google.com/";

	@Test(priority=1)
	public void LaunchBrowser()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Personal\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("Browser is launched");
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized");


	}
	@Test(priority=2)
	public void Urlhit()
	{


		driver.get(URL);
		Reporter.log("Url is hit");
	}
	@Test(priority=3)
	public void CloseBrowser()
	{
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		Reporter.log(expectedTitle);

		driver.close();
		Reporter.log("Browser is closed");

	}
}
