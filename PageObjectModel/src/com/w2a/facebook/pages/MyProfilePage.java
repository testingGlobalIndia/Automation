package com.w2a.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.facebook.core.Page;

public class MyProfilePage extends Page {
	
	

	
	
	public void goToFriends(){
		
		driver.findElement(By.linkText("Friends")).click();
		Page.topNav.logOut();
		
	}
	
	public void updatePic(){
		
		System.out.println("Pic uploaded");
		
	}
	
	
	public void goToPhotos(){
		
		
		
		
	}

}
