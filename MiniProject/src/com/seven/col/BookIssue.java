	package com.seven.col;
	import java.util.ArrayList;
	import java.util.Date;
	
	public class BookIssue {
			
		int studentId;
		Date dateOfIssue;					//method variables
		
		int bookid;
		public int getBookid() {	
		return bookid;
		}
		public void setBookid(int bookid) {
		this.bookid = bookid;
		}
		public int getStudentId() {
		return studentId;
		}
		public void setStudentId(int studentId) {
		this.studentId = studentId;
		}
		public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
		}	
		public Date getDateOfIssue() {
		return dateOfIssue;
		}
		
			//Creating Arraylist for students submit books are stored in BookIssueLedger
			static ArrayList<BookIssue> BookIssueLedger=new ArrayList<BookIssue>();
				
		public static void printBookIssueLedger(){
				
			System.out.println("in book issue ledger print method ...............");
			for (int ai3=0;ai3<BookIssueLedger.size();ai3++)
				{	
				BookIssue IBk = BookIssueLedger.get(ai3);  
				System.out.println("book issued StudentID  :  " +   IBk.getBookid()+ "   book id issued :  " +   IBk.getStudentId() + " issue date : " + IBk.getDateOfIssue()) ;  				 	     
				}		//for
		}//method
	
		public static void issueBook(Student s,Book b)
		{
			System.out.println("in issue book method ...........................");
			BookIssue bis=new BookIssue();
			bis.setStudentId(s.getId());
			bis.setBookid(b.getBooknumber());
			bis.setDateOfIssue(new Date());
			BookIssueLedger.add(bis);           //adding Books to Ledger
		}//method
	
		public void returnBook(Student s,Book b)
		{
			BookIssue bis=new BookIssue();
			int sid,bid;
			sid=s.getId();
			bid=b.getBooknumber();       
			
			for (int ai=0;ai<BookIssueLedger.size();ai++)
			{
				bis= BookIssueLedger.get(ai);
		    	 
				if((bis.getBookid()==bid)&&(bis.getStudentId()==sid))     //compare the books for Issuebook and ReturnBook
		    {
					BookIssueLedger.remove(ai);		    		//removing return book entry from ledger
    	} //if
     }//for
	}//method
		public void returnBook(int sid,int bid)
		{
			BookIssue bis=new BookIssue();
	
			for (int ai=0;ai<BookIssueLedger.size();ai++)
			{
				bis= BookIssueLedger.get(ai);
		    	 
				if((bis.getBookid()==bid)&&(bis.getStudentId()==sid))     //compare the books for Issuebook and ReturnBook
		    {
					BookIssueLedger.remove(ai);		    		//removing return book entry from ledger
    	} //if
     }//for
	}//method
}//class

