package com.testSuite;

import com.Base.Base;
import com.web.Pages.AddNewAdmin;
import com.web.Pages.HomePage;

public class AddnewUser extends Base{
	
	public void Addnew()
	{
		HomePage hm = new HomePage(driver);
		hm.clickAdmin();
		
//		if (){
//			
//		}
		AddNewAdmin add = new AddNewAdmin(driver);
		add.clickAdd();
	}

}
