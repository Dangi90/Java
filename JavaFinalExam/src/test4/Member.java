package test4;

public class Member {
	
	private String name; 
	private String memberId;
	private Book 	borrowedBook;
	
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}
	
	 public void borrowBook(Book book) {
	        if (book != null && !book.isBorrowed()) {
	            this.borrowedBook = book;
	            book.borrowBook();
	            System.out.println(name + "님이 \"" + book.getTitle() + "\"을(를) 대출하셨습니다.");
	        } else {
	            System.out.println("책을 대출할 수 없습니다.");
	        }
	    }

	    public void returnBook(Book book) {
	        if (this.borrowedBook != null && this.borrowedBook.equals(book)) {
	            this.borrowedBook.returnBook();
	            System.out.println(name + "님이 \"" + book.getTitle() + "\"을(를) 반납하셨습니다.");
	            this.borrowedBook = null;
	        } else {
	            System.out.println("대출한 책이 아닙니다.");
	        }
	    }

	    public void getMemberInfo() {
	        System.out.println("회원명: " + this.name);
	        System.out.println("회원 ID: " + this.memberId);
	        if (this.borrowedBook != null) {
	            System.out.println("대출한 책: " + this.borrowedBook.getTitle());
	        } else {
	            System.out.println("대출한 도서: 없음");
	        }
	        System.out.println("--------------------");
	    }
	}
	
