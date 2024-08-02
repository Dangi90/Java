package test4;

public class Main {
	public static void main(String[] args) {
		Book book = new Book("이것이 자바다.", "신용권", "101-1234-1001");
		
		Member member = new Member("홍길동", "A001"); 		
		
		book.getBookInfo();
		
		member.borrowBook(book);
		
		book.getBookInfo();
		
		member.getMemberInfo();
		
		member.borrowBook(book);
		
		member.returnBook(book);
		
		member.getMemberInfo();
		
	}
}
