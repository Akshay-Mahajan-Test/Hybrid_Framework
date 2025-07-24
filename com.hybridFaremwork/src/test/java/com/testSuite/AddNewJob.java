package com.testSuite;

import org.testng.annotations.Test;

import com.Base.Base;
import com.Configure.PropertiesReader;
import com.Utility.ExcelUtils;
import com.web.Pages.AddJob;
import com.web.Pages.HomePage;

public class AddNewJob extends Base{

	String jobmenu = ExcelUtils.writeToExcel(PropertiesReader.FILEPATH, "Login_Cred", 1, 7);
	String title = ExcelUtils.writeToExcel(PropertiesReader.FILEPATH, "Job_Title", 1, 1);
	String desc = ExcelUtils.writeToExcel(PropertiesReader.FILEPATH, "Job_Title", 1, 2);
	String note = ExcelUtils.writeToExcel(PropertiesReader.FILEPATH, "Job_Title", 1, 3);
	@Test
	public void addNewJobDetails()
	{		
		
		HomePage hm = new HomePage(driver);
		hm.clickAdmin();
		AddJob add = new AddJob(driver);
		add.clickonJob();
		add.clickonJobMenu(jobmenu);
		add.addjobTitle(title);
		add.jobDescription(desc);
		add.jobNoteData(note);
		add.saveTheJob();
	}
	
	@Test
	public void cancelTheJobform()
	{
		HomePage hm = new HomePage(driver);
		hm.clickAdmin();
		AddJob add = new AddJob(driver);
		add.clickonJob();
		add.clickonJobMenu(jobmenu);
		add.cancelTheJob();
	}
}
