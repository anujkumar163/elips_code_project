package practice;

public class TicketCounter {
	private int availableSeats = 3;
	
	public synchronized void bookTicket(String pname, int numberOfSeats) {
		if((availableSeats>=numberOfSeats)&&(numberOfSeats>0)) {
			System.out.println("hi"+pname+":"+numberOfSeats+"booked sucessfully");
			availableSeats = availableSeats-numberOfSeats;
		}else {
			System.out.println("hi"+pname+" seat not Available");
		}
	}
}
