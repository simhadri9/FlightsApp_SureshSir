package flights_testcases;

import filghts_libraries.Ticketbookingpage;
import filghts_libraries.loginpage;
import utils.Apputils;

public class booking_flight_ticket_test {

	public static void main(String[] args) throws InterruptedException  {
		Apputils.lunchApp("http://flights.qedgetech.com");
		loginpage lp = new loginpage();
		lp.login("cmhadrismd@gmail.com","cmhasmd@786.");
		Ticketbookingpage tcbook = new Ticketbookingpage();
		tcbook.tcbooking("9/27/2027","Hyderabad","Kolkatha","maharaj");
		
		lp.logout();
		Apputils.closaApp();

	}

}
