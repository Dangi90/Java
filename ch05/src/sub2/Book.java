package sub2;

public class Book {
	
	//속성
	private String title;
	private String author;
	private String isbn; //isbn 번호
	private int availableCopies; //이용가능한 복사본 수
	
	//생성자
	public Book(
			String title,
			String author,
			String isbn,
			int availableCopies) {
		
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = availableCopies;
	}
	
	//매서드
	public boolean borrowBook() {
		if(this.availableCopies >= 1) {
			this.availableCopies --;
			return true;
		} else {
			return false;
		}	
	}
	
	public void returnBook() {
		this.availableCopies ++;
	}
	
	public void show() {
		System.out.println("------------------");
		System.out.println("책 제목: "+this.title);
		System.out.println("저자: "+this.author);
		System.out.println("책 번호: "+this.isbn);
		System.out.println("이용가능한 대출횟수: "+this.availableCopies);
	}
	
	//인스턴스 수정
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	

}
