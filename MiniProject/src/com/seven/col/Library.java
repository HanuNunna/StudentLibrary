package com.seven.col;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	// creating arraylist for books are stored in LibraryBookRepository
	static ArrayList<Book> LibraryBookRepository = new ArrayList<Book>();
	static BookIssue bookIssueLibrary = new BookIssue();

	public static void studentLibrary(ArrayList<Student> studentClassDetails)
			throws IOException {

		String readvalue;
		int readStudentIdValue; // method Variables
		int readBookIdvalue;

		boolean status = true;
		Book Lbook = new Book();
		BookIssue Ibook = new BookIssue();
		// BookManager bookMngr = new BookManager();

		// Library menu Details
		System.out.println("Welcome to Library Management System");
		System.out
				.println("1. AddBook, 2. issue , 3. Return ,4.report for total books,5.report for bookissued  6. exit .........");
		System.out.println("Enter your choice :   ");
		Scanner scan = new Scanner(System.in);
		java.io.BufferedReader r = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));
		readvalue = r.readLine();

		// unlimited while repeat loop starts with Status as true value
		while (status) {
			System.out
					.println("1. AddBook, 2. issue , 3. Return ,4.report for total books,5.report for bookissued  6. exit .........");
			System.out.println("Enter your choice :   ");
			readvalue = r.readLine();

			switch (readvalue) {
			case "1":
				System.out.println("Enter book details: ");
				//Book.bookMenu();
				BookManager.bookMenu();

				// Lbook= Book.addBook(Lbook);
				Lbook = BookManager.createBook();

				LibraryBookRepository.add(Lbook);

				/*
				 * Lbook.setBooknumber(101); Lbook.setBookName("java");
				 * 
				 * System.out.println("before read......");
				 * System.out.println(Lbook.getBooknumber());
				 * System.out.println(Lbook.getBookName());
				 * 
				 * System.out.println(
				 * "adding book entry into lbrepository .....................");
				 * 
				 * Lbook.setBooknumber(102); Lbook.setBookName("oracle");
				 * System.out.println("after read....");
				 * System.out.println(Lbook.getBooknumber());
				 * System.out.println(Lbook.getBookName());
				 * 
				 * for (int i=0;i<3;i++) {
				 * LibraryBookRepository.add(Lbook("java"));
				 * LibraryBookRepository.add(Lbook("oracle")); }
				 */

				break;

			case "2":
				String sid,
				bid;
				System.out.println("issued books: ");

				Student issueStudent,
				bookIssueStudent = null;
				Book issueBook,
				bookIssue = null;

				System.out.println("Enter stuid to issue book:  ");
				sid = r.readLine(); // read id value from input
				readStudentIdValue = Integer.parseInt(sid); // readStudentIdValue=r.read();

				for (int ai1 = 0; ai1 < studentClassDetails.size(); ai1++) { // checking
																				// student
																				// id
																				// is
																				// avaialble
																				// in
																				// the
																				// class
																				// array
																				// list
																				// or
																				// not
					issueStudent = studentClassDetails.get(ai1);
					int sTempId = issueStudent.getId();

					if (sTempId == readStudentIdValue) // comparing entered id
														// with class students
														// id , one by one
					{
						bookIssueStudent = issueStudent; // if id is equal to
															// any existing
															// student, take
															// that student
															// object
					}// if
				} // for

				System.out.println("Enter bookid to issue :  ");
				bid = r.readLine();
				readBookIdvalue = Integer.parseInt(bid);

				for (int ai2 = 0; ai2 < LibraryBookRepository.size(); ai2++) {
					issueBook = LibraryBookRepository.get(ai2);
					int bTempId = issueBook.getBooknumber();

					if (bTempId == readBookIdvalue) {
						bookIssue = issueBook;
					} // if
				}// for

				bookIssueLibrary = new BookIssue();
				if ((bookIssue != null) && (bookIssueStudent != null)) {
					bookIssueLibrary.issueBook(bookIssueStudent, bookIssue);
					System.out
							.println("calling Book issue method ............................");
				}// if
				break;

			case "3":
				String sid1,
				bid1;
				System.out.println("Return Book");

				Scanner s = new Scanner(System.in);

				Book returnBook = null;

				// readvalue=r.readLine();
				System.out.println("Enter Stuid: ");
				sid1 = r.readLine();
				readStudentIdValue = Integer.parseInt(sid1);

				System.out.println("Enter BookId: ");
				bid1 = r.readLine();
				readBookIdvalue = Integer.parseInt(bid1);
				bookIssueLibrary
						.returnBook(readStudentIdValue, readBookIdvalue);
				System.out
						.println("calling Book remove method ............................");

				break;

			case "4":

				System.out.println(" Total number of books in library:");
				for (int c4 = 0; c4 < LibraryBookRepository.size(); c4++) {
					Book LBook = LibraryBookRepository.get(c4);
					System.out
							.println("in case 4 ....................... ai is + ai");
					System.out.println("No  :  " + LBook.getBooknumber()
							+ "   Name :  " + LBook.getBookName()
							+ " Book Author  :  " + LBook.getBookAuthor()
							+ "   BookCategory :  " + LBook.getBookCategory()
							+ " BookCopies  :  " + LBook.getNoofcopies()
							+ "   BookPrice :  " + LBook.getPrice()
							+ "BookISBNnumber :   " + LBook.getISBNNo());
				} // for

				// LibraryBookRepository.set(readBookIdvalue, Lbook);

				break;

			case "5":

				System.out.println("Book issued report");
				BookIssue.printBookIssueLedger();
				break;

			case "6":
				System.out.println(" exiting...");
				status = false;

			default:
				System.out.println("Invalid input");
				break;

			} // switch
		} // while
	}// method

	private static Book book(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Book Lbook(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	// method

}// class

