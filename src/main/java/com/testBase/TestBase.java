package com.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	public WebDriver driver;
	public void setup() 
	{
		String br = "browser";
		if(br.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		}
		 else if(br.equalsIgnoreCase("firefox"))
		{
			 WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		 else if (br.equalsIgnoreCase("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		 }
	}
	
}
