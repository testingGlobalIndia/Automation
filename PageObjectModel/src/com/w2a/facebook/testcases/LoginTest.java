package com.w2a.facebook.testcases;

import org.testng.annotations.Test;

import com.w2a.facebook.pages.LandingPage;
import com.w2a.facebook.pages.LoginPage;
import com.w2a.facebook.pages.MyProfilePage;

public class LoginTest {
	
	
	
	@Test
	public void testLogin(){
		
		LoginPage login = new LoginPage();
		LandingPage lp = login.doLogin("seleniumcoaching@gmail.com", "selenium1234");
		
	
		
		
	}
	
	
	

}
