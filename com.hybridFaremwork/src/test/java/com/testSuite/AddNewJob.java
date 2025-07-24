package com.testSuite;

import com.Base.Base;
import com.Pages.AddJob;

public class AddNewJob extends Base{

	@Test(depends)
	public void addNewJobDetails()
	{
		
		AddJob add = new AddJob(driver);
		
	}
}
