package test4;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowed;
	
	public Book(String title, String author, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowed = isBorrowed = true;
	}
	
	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public void borrowBook() {
		
		if (this.isBorrowed == false) {
			this.isBorrowed = true;
			System.out.println("대출: " +this.isBorrowed);
		} else {
			System.out.println("이미 대출됨.");
		}
		System.out.println("--------------------");
		
	}
	
	public void returnBook() {
		
		if (this.isBorrowed == true) {
			this.isBorrowed = false;
			System.out.println("도서 반납: " +this.isBorrowed);
		} else {
			System.out.println("우리도서관 책 아닌데요?");
		}
		System.out.println("--------------------");
		
	}
	
	public void getBookInfo() {
		System.out.println("도서명: " + this.title);
		System.out.println("저자: " + this.author);
		System.out.println("ISBN: " + this.isbn);
		System.out.println("대출여부: " + (this.isBorrowed? "가능" : "불가능"));
		System.out.println("--------------------");
		
	}



	public boolean isBorrowed() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
