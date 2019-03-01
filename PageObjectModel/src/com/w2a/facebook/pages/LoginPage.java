package com.w2a.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.facebook.core.Page;

public class LoginPage extends Page {
	
	
	
	public LandingPage doLogin(String username,String password){
		

		input("username", username);
		input("password", password);
		click("login");
		
		return new LandingPage();
		
	}
	
	
	public void signUp(){
		
		
		
		
	}
	
	
	
	public void validateLoginPage(){
		
		
		
		
	}
	

}
