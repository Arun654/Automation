package com.actiTime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.generics.Baseclass;

public class AddnewcustomerPage
{
	@FindBy(name="name")
	private WebElement customernametextfield;
	@FindBy(xpath="//input[@value='Create Customer']")
	private WebElement Createcustomerbutton;
	public static Logger log;
	public AddnewcustomerPage()
	{
		PageFactory.initElements(Baseclass.driver, this);
		log=Logger.getLogger(AddnewcustomerPage.class);
		PropertyConfigurator.configure("Log4j.properties");
	}
	public void customernametextfield(String customername)
	{
		customernametextfield.sendKeys(customername);
		log.info(".......customername......");
	}
	public void Createcustomerbutton() 
	{
		Createcustomerbutton.click();
		log.info(".......customerbutton.........");
		
	}
}
