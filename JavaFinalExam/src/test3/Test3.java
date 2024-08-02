package test3;

public class Test3 {
	public static void main(String[] args) {
		
		MovieTicket ticket = new MovieTicket("타이타닉", "19:00", "A1");
		
		ticket.printTicketInfo();
//		System.out.println("--------------------");
		
		ticket.bookTicket();
//		System.out.println("--------------------");
		
		ticket.printTicketInfo();
//		System.out.print("--------------------");
		
		ticket.bookTicket();
//		System.out.print("--------------------");
		
		ticket.cancelBooking();
//		System.out.print("--------------------");
		
		ticket.printTicketInfo();
//		System.out.print("--------------------");
		
		ticket.cancelBooking();
//		System.out.print("--------------------");
		
	}
}
