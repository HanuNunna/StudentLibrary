package com.seven.col;

import java.io.IOException;
import java.util.Scanner;

import com.seven.col.Book;
import com.seven.col.Student;

public class BookManager {

	/**
	 * 1. addBook(Book book)
	 * 
	 */
	public static Book createBook() {

		Book book = new Book();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Book Number: ");
		book.setBooknumber(Integer.parseInt(scan.nextLine()));

		System.out.println("Enter Book Name: ");
		book.setBookName(scan.nextLine());
		
		System.out.println("Enter ISBNNo :  ");
		book.setISBNNo(scan.nextLine());
	
		System.out.println("Enter BookCategory :  ");  
		book.setBookCategory(scan.nextLine());
		
		System.out.println("Enter Book Price:  ");
		book.setPrice(scan.nextLine());
	
		System.out.println("Enter no of copies :  ");
		book.setNoofcopies(scan.nextLine());
	
		return book;
	}

	/**
	 * 2. bookMenu
	 */

	public static void bookMenu() {

		System.out.println("enter book details...");
		System.out.println("1. Book number " + "\n" + "2. Book name" + "\n"
				+ "3. Book author " + "\n" + "4. Isbnno " + "\n"
				+ "5. BookCategory " + "\n" + "6. Price" + "\n"
				+ "7.Number of Copies");

	}
}
