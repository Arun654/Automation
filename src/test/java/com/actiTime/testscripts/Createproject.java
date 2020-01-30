package com.actiTime.testscripts;

import org.testng.annotations.Test;

import com.actiTime.generics.Baseclass;
import com.actiTime.webpages.Activeprojectsandcustomers;
import com.actiTime.webpages.Addnewprojectpage;
import com.actiTime.webpages.Opentaskpage;

public class Createproject extends Baseclass
{
	
	@Test
	public void newproject()
	{
		Opentaskpage otp=new Opentaskpage();
		otp.projectsandcustomerslink();
		Activeprojectsandcustomers apcp=new Activeprojectsandcustomers();
		apcp.Addnewprojectbutton();
		Addnewprojectpage anp=new Addnewprojectpage();
		anp.Selectcustomerfromdropdown("Iyer");
		anp.Projectnametextfild("dejavu");
		anp.addNewprojectButton();
		String s=apcp.Retrievesuccessmessage();
		System.out.println(s);
	}

}
