package com.seven.col;
	
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;


	public class ColAdmin 
	{
	
		public static void main(String[] args) throws IOException
		{
			
			// method variables
			Boolean loop=true;
			ArrayList<Student> CseFirstYear=new ArrayList<Student>(40);
			int i;
			String readvalue;
			// menu print for user understanding
			System.out.println("welcome to college administration project:..........");
			  System.out.println("1. student joining " + "\n" + "2. update student" + "\n" + "3. library " + "\n" + "4. report " + "\n" + "5. Exit ");
			System.out.println("Enter your choice :   " );
			// to read the input choice value from user, we are using system.in logic
		    java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		    // reads string from keyboard using system.in
		    readvalue=r.readLine();

		    // unlimited while repeat loop starts with loop as true value
			while(loop)
			{
				  System.out.println("1. student joining " + "\n" + "2. update student" + "\n" + "3. library " + "\n" + "4. report " + "\n" + "5. Exit ");
				System.out.println("Enter your choice :   " );
				 readvalue=r.readLine();
				 
				
				  switch(readvalue)
				    {
				     // if user enters choice as 1, this case logic executes
					 case "1":
						 
					   System.out.println("Student Joining ");
							Student S1=new Student();
							S1=Student.studentCreate(S1); // creates student object and returns the same with data in object
							CseFirstYear.add(S1);
							  break;
		
			 
		 case "2":
			 System.out.println("Update Student: ");
				Scanner scan=new Scanner(System.in);
				
					System.out.println("Enter IDNumber: ");
					  readvalue = scan.nextLine();

					  for (int ai=0;ai<CseFirstYear.size();ai++)
						{
						    Student S =CseFirstYear.get(ai);
						       if(S.getId()==Integer.parseInt(readvalue)){
		                         	System.out.println("which field of student you want to update: ");
		                         	System.out.println("1.Name 2. Address 3. Mobile number");
		                         	
								      readvalue=r.readLine();							   
					
						     					switch (readvalue) {
											
											        case"1":
														System.out.println("Enter Name to be updated: ");
														  readvalue = scan.nextLine();
														  S.setName(readvalue);
														  System.out.println("Name Successfull updated");
														  break;
													
											        case"2": 
														System.out.println("Enter Address to be updated: ");
														  readvalue = scan.nextLine();
														  S.setAddress(readvalue);
														  System.out.println("Address Successfull updated");
														  break ;
													
											        case"3":
														System.out.println("Enter mobile number to be updated"); 
														  readvalue = scan.nextLine();
														  S.setCellno(Integer.parseInt(readvalue));
														break;
													
											        default:
														 System.out.println("Default ");	    
												 }//switch
									 }//if
						             else 
						             {
						    	        System.out.println("StudentID not availble in List");
						             }//else
						   }//for
					 
             case "3":
							 	
 			 System.out.println("Library Book Issue"); 
     		   Library.studentLibrary(CseFirstYear); //creates Library object and returns the same data in object
				 break;
							 
							 
			 case "4":
	 		 System.out.println("Class total students Report: ");
			     for (int ai=0;ai<CseFirstYear.size();ai++)
				      {				  
				        Student sr = CseFirstYear.get(ai); 
				        System.out.println("Name  :  " +   sr.getName() + "   ID :  " +   sr.getId() + "   mobile :  "+ sr.getCellno() + "    Address :  " +  sr.getAddress()  + "   Course :  " +  sr.getCourse());  
					  }  	  
	  		     break;
			 case "5":
			 	System.out.println("Exit");
		 		loop=false;
		        break;
							 
				 default:
				 System.out.println("Default ");	    
					
				} // switch
						
		} //while
		
	} //main
	
}// class
	
