package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.model.std.Student;

public class Solution {
	public static void main(String[] args) throws IOException {  
	String StudentNumber;
	
	SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=sf.openSession();
	    Transaction t=session.beginTransaction();
	BufferedReader brc = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the RollNumber:");
	StudentNumber=brc.readLine();
	 
	
	  
	    Student s1=new Student();
	    s1.setStudentNumber(StudentNumber);
	    session.save(s1);  
	  
	      
	    t.commit();  
	    session.close();  
	    System.out.println("success");  

	}  

}