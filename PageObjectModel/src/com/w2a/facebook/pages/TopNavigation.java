package com.w2a.facebook.pages;

import org.openqa.selenium.By;

import com.w2a.facebook.core.Page;

public class TopNavigation{
	
	
	public void logOut(){
		
		Page.click("accountlink");
		Page.click("logout");
	}
	
	
	
	public void doSearch(){
		
		
		
	}
	
	public LandingPage goToLandingPage(){
		
		Page.click("landingpage");
		return new LandingPage();
	}

	
	public void goToHome(){
		
		
		
	}
}
