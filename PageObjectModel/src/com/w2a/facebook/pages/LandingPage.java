package com.w2a.facebook.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.facebook.core.Page;

public class LandingPage extends Page {
	

	
	
	

	public MyProfilePage goToProfile(){
		
	driver.findElement(By.xpath("//*[@id='pagelet_welcome_box']/div/div/div/div[2]/a[1]")).click();
		
	return new MyProfilePage();
	
	}
	
	public void updateStatus(){
		
		Page.topNav.logOut();
		
	}
	
	public void gotoPage(){
		
		
		
	}
	

}
