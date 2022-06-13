package reservation_project;

public class TicketBookingThread extends Thread{
	private TicketCounter ticketcounter;
	
	private String passengerName;
	private int noOfSeatsBook;
	
	public TicketBookingThread(TicketCounter ticketcounter, String passengerName, int noOfSeatsBook) {
		this.ticketcounter=ticketcounter;
		this.passengerName=passengerName;
		this.noOfSeatsBook=noOfSeatsBook;
		
	}
	public void run() {
		ticketcounter.bookTicket(passengerName, noOfSeatsBook);
	}
}
