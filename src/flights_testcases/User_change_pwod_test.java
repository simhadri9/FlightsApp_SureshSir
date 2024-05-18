package flights_testcases;

import filghts_libraries.changePasswordpage;
import filghts_libraries.loginpage;
import utils.Apputils;

public class User_change_pwod_test {

	public static void main(String[] args) throws InterruptedException {
		Apputils.lunchApp("http://flights.qedgetech.com");
		
		loginpage lp = new loginpage();
		lp.login("cmhadrismd@gmail.com","cmhasmd@143.");
		
		changePasswordpage chp = new changePasswordpage();
		chp.changepassword("cmhasmd@143.","cmhasmd@786.");
		lp.logout();
		
		lp.login("cmhadrismd@gmail.com","cmhasmd@786.");
		
		lp.logout();
		Apputils.closaApp();
		

	}

}
