package com.actiTime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.actiTime.generics.Baseclass;

public class Addnewprojectpage 
{
	@FindBy(name="customerId")
	private WebElement Selectcustomerfromdropdown;
	@FindBy(name="name")
	private WebElement Projectnametextfild;
	@FindBy(name="createProjectSubmit")
	private  WebElement AddNewProjectButton;
	public static Logger log;
	public Addnewprojectpage()
	{
		PageFactory.initElements(Baseclass.driver, this);
		log=Logger.getLogger(Addnewprojectpage.class);
		PropertyConfigurator.configure("Log4j.properties");
	}
	public void Selectcustomerfromdropdown(String customer)
	{
		Select s=new Select(Selectcustomerfromdropdown);
		s.selectByVisibleText(customer);
		log.info(".........successmessage.......");
	}
	public void Projectnametextfild(String Projectname)
	{
		Projectnametextfild.sendKeys(Projectname);
		log.info(".......projectname......");
	}
	public void addNewprojectButton()
	{
		AddNewProjectButton.click();
		log.info(".....clicked on button.......");
	}
}
