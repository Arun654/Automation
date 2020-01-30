package com.actiTime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.generics.Baseclass;

public class Opentaskpage
{
	@FindBy(linkText="Projects & Customers")
	private WebElement projectsandcustomerslink;
	public static Logger log;
	public Opentaskpage()
	{
		PageFactory.initElements(Baseclass.driver, this);
		log=Logger.getLogger(Opentaskpage.class);
		PropertyConfigurator.configure("Log4j.properties");
	}
	public void projectsandcustomerslink()
	{
		projectsandcustomerslink.click();
		log.info("........projectsandcustomers..........");
	}
	
	

}
