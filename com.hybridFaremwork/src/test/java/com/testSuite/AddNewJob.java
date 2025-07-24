package com.testSuite;

import org.testng.annotations.Test;

import com.Base.Base;
import com.Pages.AddJob;
import com.testSuite.login;
public class AddNewJob extends Base{

	@Test(dependsOnMethods = logintest)
	public void addNewJobDetails()
	{
		
		AddJob add = new AddJob(driver);
		
	}
}
