package com.w2a.facebook.rough;

import org.testng.annotations.Test;

import com.w2a.facebook.core.Page;
import com.w2a.facebook.pages.LandingPage;
import com.w2a.facebook.pages.MyProfilePage;

public class UploadPicTest {
	
	
	@Test
	public void uploadMyPic(){
		
		LandingPage lp = Page.topNav.goToLandingPage();
		MyProfilePage mp = lp.goToProfile();
		mp.updatePic();
		
		
	}

}
