package com.w2a.facebook.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.w2a.facebook.pages.LandingPage;
import com.w2a.facebook.pages.LoginPage;
import com.w2a.facebook.pages.MyProfilePage;

public class LoginPageTest {

	
	public static void main(String[] args) {


		LoginPage login = new LoginPage();
		LandingPage lp = login.doLogin("seleniumcoaching@gmail.com", "seldfdf");
		MyProfilePage mp = lp.goToProfile();
		mp.updatePic();
		
		
		/*
		 * 
		 * Inheritance & Encapsulation
		 * 
		 * 
		 */
		
		

	}

}
