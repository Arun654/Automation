package com.actiTime.testscripts;

import org.testng.annotations.Test;

import com.actiTime.generics.Baseclass;
import com.actiTime.webpages.Activeprojectsandcustomers;
import com.actiTime.webpages.AddnewcustomerPage;
import com.actiTime.webpages.Opentaskpage;

public class Createcustomer extends Baseclass
{
	@Test
	public void Addnewcustomer()
	{
		Opentaskpage otp=new Opentaskpage();
		otp.projectsandcustomerslink();
		Activeprojectsandcustomers apcp=new Activeprojectsandcustomers();
		apcp.Addnewcustomerbutton();
	    AddnewcustomerPage acp=new AddnewcustomerPage();
	    acp.customernametextfield("Iyer");
	    acp.Createcustomerbutton();
	    String s=apcp.Retrievesuccessmessage();
	    System.out.println(s);
	}

}
