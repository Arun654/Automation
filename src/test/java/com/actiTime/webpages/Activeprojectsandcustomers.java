package com.actiTime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.generics.Baseclass;

public class Activeprojectsandcustomers 
{
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement Addnewcustomerbutton;
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement Addnewprojectbutton;
	@FindBy(className="successmsg")
	private WebElement Retrievesuccessmessage;
	public static Logger log;
	public Activeprojectsandcustomers()
	{
		PageFactory.initElements(Baseclass.driver, this);
		log=Logger.getLogger("Activeprojectsandcustomers");
		PropertyConfigurator.configure("Log4j.properties");
	}
	public void Addnewcustomerbutton()
	{
		Addnewcustomerbutton.click();
		log.info(".....Addnewcustomer.....");
	}
     public void Addnewprojectbutton()
     {
    	 Addnewprojectbutton.click();
    	 log.info("........Addnewproject......");
     }
     public String Retrievesuccessmessage()
     {
    	 String s = Retrievesuccessmessage.getText();
    	 log.info(".......successmessage.........");
    	 return s;
     }
}
