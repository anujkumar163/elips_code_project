package reservation_test_booking;

import reservation_project.TicketBookingThread;
import reservation_project.TicketCounter;

public class Test {
	public static void main(String[] args) {
		TicketCounter ticketcounter = new TicketCounter();
		TicketBookingThread t1 = new TicketBookingThread(ticketcounter,"anuj",2);
		TicketBookingThread t2 = new TicketBookingThread(ticketcounter,"abhay",2);
		
		t1.start();
		t2.start();
	}
}
