package com.seven.col;
	
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

	public class Student {
		
		//student class variables Declaration
			String Name;
			int id;
			String Address;		
			String Course;
			int Cellno;
			
			String mailID;
			Date dob;
			
		
					public String getName() {
						return Name;
					}
					
					public void setName(String name) {
						Name = name;
					}
					
					public int getId() {
						return id;
					}
					
					public void setId(int id) {
						this.id = id;
					}
					
					public String getAddress() {
						return Address;
					}
					
					public void setAddress(String address) {
						Address = address;
					}
					
					public String getCourse() {
						return Course;
					}
					
					public void setCourse(String course) {
						Course = course;
					}
					public int getCellno() {
						return Cellno;
					}
					
					public void setCellno(int cellno) {
						Cellno = cellno;
					}
						// TODO Auto-generated method stub
		
					//studentCreate is a static function which is taking studentobj as input argument and returns student as output argument
					public static Student studentCreate(Student StudentObj)throws IOException{
					
						//creating an student arraylist and adding student data in the while loop
			
							String name;
							int id;
							String course;
							String Address;
							int cellno;	
						
								//Student menu details	 
								System.out.println("Enter student details as mentioned in below order:");
								  System.out.println("1. Enter Name " + "\n" + "2. Enter IDNumber" + "\n" + "3. Enter Course " + "\n" + "4. Enter Cellno ");
								    System.out.println("Enter your choice :   " );
						
								Scanner scan=new Scanner(System.in);
								 System.out.print("Enter Name: ");
								  name = scan.nextLine();
								   StudentObj.setName(name);
										
								System.out.print("ID Number: ");
								 String tid = scan.nextLine();
								  id=Integer.parseInt(tid);
								   StudentObj.setId(id);
								
								System.out.println("Enter Course:  ");
								  course = scan.nextLine();
								    StudentObj.setCourse(course);
												
								System.out.println("Enter Cellno:  ");
								   String tcellno = scan.nextLine();
								    cellno=Integer.parseInt(tcellno);
								      StudentObj.setCellno(cellno);
											
								System.out.println("Enter Address:  ");
								   Address = scan.nextLine();
								    StudentObj.setAddress(Address);
								
								return StudentObj;			
								
								
								
								
					}	//method
	}	//class	
	
	