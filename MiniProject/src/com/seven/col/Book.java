	package com.seven.col;
	
	import java.util.Scanner;
	
	public class Book {
		int Booknumber;
		String BookName;							//method variables
		String BookAuthor;
		String ISBNNo;
		String BookCategory;
		String Price;
		String noofcopies;

	public int getBooknumber() {
		return Booknumber;
	}
	public void setBooknumber(int booknumber) {
		Booknumber = booknumber;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public String getISBNNo() {
		return ISBNNo;
	}
	public void setISBNNo(String iSBNNo) {
		ISBNNo = iSBNNo;
	}
	public String getBookCategory() {
		return BookCategory;
	}
	public void setBookCategory(String bookCategory) {
		BookCategory = bookCategory;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getNoofcopies() {
		return noofcopies;
	}
	public void setNoofcopies(String noofcopies) {
		this.noofcopies = noofcopies;
	}
	
	/*public static void bookMenu(){
		//Display Book Details
		System.out.println("enter book details...");
		System.out.println("1. Book number " + "\n" + "2. Book name" + "\n" + "3. Book author " + "\n" + "4. Isbnno " + "\n" + "5. BookCategory " + "\n" + "6. Price" + "\n" + "7.Number of Copies");
		}
	
	//addBook method using for book details  are stored in LibraryBookRepository
	public static Book addBook(Book bk)
		{
			
		Scanner scan=new Scanner(System.in);
			
		System.out.println("Enter Book Number: ");
		bk.setBooknumber(Integer.parseInt(scan.nextLine()));
			
			
			System.out.println("Enter Book Name: ");
			bk.setBookName(scan.nextLine());
	
		
		System.out.println("book number is   :  ");
			System.out.println("Enter Book Author:  ");
				bk.setBookAuthor(scan.nextLine());
	
		System.out.println("Enter ISBNNo :  ");
			bk.setISBNNo(scan.nextLine());
		
		System.out.println("Enter BookCategory :  ");  
			bk.setBookCategory(scan.nextLine());
			
		System.out.println("Enter Book Price:  ");
			bk.setPrice(scan.nextLine());
		
		System.out.println("Enter no of copies :  ");
			bk.setNoofcopies(scan.nextLine());
		
	// add logic to add the remaining book details....
	
		return bk;
		
	}*///static method
	
}//class	
