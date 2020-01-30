package com.actiTime.generics;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclass 
{
	public static WebDriver driver;
	@BeforeTest
	public static void openbrowser()
	{
		String browser="chrome";
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C://selenium//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C://selenium//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get("http://127.0.0.1/login.do");
		}
	@AfterTest	
	public static void closebrowser()
	{
		driver.close();
}
	@BeforeClass
	public static void login()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@AfterClass
	public static void logout()
	{
		driver.findElement(By.className("logoutImg")).click();
	}

}
