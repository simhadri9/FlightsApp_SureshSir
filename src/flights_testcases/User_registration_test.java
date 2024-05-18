package flights_testcases;

import filghts_libraries.Registraion;
import utils.Apputils;

public class User_registration_test {

	public static void main(String[] args) {
		Apputils.lunchApp("http://flights.qedgetech.com");
		
		Registraion res = new Registraion();
		res.userRegistration("ravan","cmhadrismd@gmail.com","cmhasmd@143.","Male","11-Jun-2007");
		
		Apputils.closaApp();
		
	}

}
