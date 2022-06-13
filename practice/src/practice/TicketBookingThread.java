package practice;

public class TicketBookingThread extends Thread{
	private TicketCounter ticketcounter;
	private String passengerName;
	private int noOfSeats;
	
	public TicketBookingThread(TicketCounter ticketcounter, String passengerName, int noOfSeats) {
		this.ticketcounter= ticketcounter;
		this.passengerName = passengerName;
		this.noOfSeats = noOfSeats;
	}
	
	public void run() {
		ticketcounter.bookTicket(passengerName, noOfSeats);
	}
	
}
