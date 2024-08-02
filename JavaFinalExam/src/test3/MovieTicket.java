package test3;

public class MovieTicket {

	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;

	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		super();
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}

	public void printTicketInfo() {

		System.out.println("상품ID: " + this.movieTitle);
		System.out.println("상품이름: " + this.screenTime);
		System.out.println("상품가격: " + this.seatNumber);
		System.out.println("재고수량: " + (this.isBooked ? "YES" : "NO"));
		System.out.println("--------------------");
	}

	public void bookTicket() {

		if (this.isBooked == false) {
			this.isBooked = true;
			System.out.println(this.movieTitle + ", " + this.screenTime + ", " + this.seatNumber + "예매 완료");
		} else {
			System.out.println("이미 예매됨.");
		}
		System.out.println("--------------------");

	}

	public void cancelBooking() {
		if(this.isBooked == false) {
			System.out.println("아직 예매 안됨.");
		}else {
			this.isBooked = false;
			System.out.println(this.movieTitle + ", " + this.screenTime + ", " + this.seatNumber + "취소 완료");
			
		}
		System.out.println("--------------------");


	}

}
