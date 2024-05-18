package flights_testcases;

import filghts_libraries.loginpage;
import utils.Apputils;

public class user_login_test {

	public static void main(String[] args) {
	Apputils.lunchApp("http://flights.qedgetech.com");
	
	loginpage lp = new loginpage();
	lp.login("cmhadrismd@gmail.com","cmhasmd@143.");
	
	lp.logout();
	Apputils.closaApp();

	}

}
