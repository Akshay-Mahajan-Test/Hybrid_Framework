package com.mobile.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Base.MobileBase;

public class ProductPage extends MobileBase{
	
	@FindBy(id = "productTV")
	private WebElement titlePage;

	public String getTitle(String title)
	{
		return getAttribute(titlePage, "text");
	}
}
