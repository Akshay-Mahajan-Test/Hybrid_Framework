package com.mobile;

import org.testng.annotations.Test;

import com.Base.MobileBase;
import com.mobile.Pages.HomePage;

public class launch_App extends MobileBase{
	
	@Test
	public void launchApp()
	{
		
		HomePage hm = new HomePage(driver);
	}
	
	
	
	
}
