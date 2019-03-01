package rough;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.Page;
import pages.HomePage;
import pages.LandingPage;
import pages.MyProfilePage;

public class TestLogin {

	public static void main(String[] args) {

		// driver.manage.window.maximize();
		HomePage home = new HomePage();
		LandingPage lp = home.doLogin("prafulgupta84@yahoo.in", "Selenium@123");
		MyProfilePage mp = lp.gotoProfile();
		mp.uploadImage();
		Page.topNav.logOut();

		//new HomePage().doLogin("prafulgupta84@yahoo.in", "Selenium@123").gotoProfile().uploadImage();

	}

}
