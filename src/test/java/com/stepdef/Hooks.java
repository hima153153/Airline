package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BinduJagan\\eclipse-workspace\\AirlineProject\\driver\\chromedriver79.exe");
		 driver=new ChromeDriver();
		}

	@After
	public void afterScenario() {
	driver.quit();
	}
}


