package Collection;

import java.util.Scanner;

public class BookArrayListTest {

	public static void main(String[] args) {
		BookArrayList bookArrayList=new BookArrayList();

		Book book1=new Book(0001,"파우스트");
		Book book2=new Book(0002,"황무지");
		Book book3=new Book(0003,"변신");
		Book book4=new Book(0004,"픽션들");
		Book book5=new Book(0005,"톨스토이");

		bookArrayList.addBook(book1);
		bookArrayList.addBook(book2);
		bookArrayList.addBook(book3);
		bookArrayList.addBook(book4);
		bookArrayList.addBook(book5);

		bookArrayList.showAllBook();

		bookArrayList.removeBook(book1.getBookId());
		Scanner sc=new Scanner(System.in);

		System.out.println("위치");
		int index=sc.nextInt();
		System.out.println("책 Id");
		int bookId=sc.nextInt();
		System.out.println("책 제목");

		String BookName=sc.next();
		Book newBook=new Book(bookId,BookName);
		bookArrayList.insertBook(index,newBook);
		bookArrayList.showAllBook();
		
		sc.close();

	}



}