package org.model.Util;
import org.model.std.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.model.college.collegeInfo;
import org.model.college.degree;

public class Solution {
	public static void main(String[] args) throws IOException {  
			int ch;
			Session session=null;
			Transaction t=null;
		    System.out.println("1.TEACHER \n 2.STUDENT\n");
			System.out.println("Enter your choice:");
			BufferedReader brc = new BufferedReader(new InputStreamReader(System.in));
			ch=Integer.parseInt(brc.readLine());
			
			switch(ch)
			{
			case 1:
				System.out.println("1.collegeinfo\t2.degree\t3.department\4.texam\t5.section\t6.teacher\t7.tlogin\t\n");
				int choice;
				choice=Integer.parseInt(brc.readLine());
				switch(choice){
				case 1:
					try{
					SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
					session=sf.openSession();
					int cSno,courseId;
					String collegeName,startYear,endYear,studNumber,degreeId;
					System.out.println("Enter collegeinfo:");
					cSno=Integer.parseInt(brc.readLine());
					System.out.println("Enter CourseId:");
					courseId=Integer.parseInt(brc.readLine());
					System.out.println("Enter collegename:");
					collegeName=brc.readLine();
					System.out.println("Enter Startyear:");
					startYear=brc.readLine();
					System.out.println("Enter Endyear:");
					endYear=brc.readLine();
					System.out.println("Enter studnumber:");
					studNumber=brc.readLine();
					System.out.println("Enter degreeid:");
					degreeId=brc.readLine();
					collegeInfo ci= new collegeInfo();
					ci.setcSno(cSno);
					ci.setCourseId(courseId);
					ci.setCollegeName(collegeName);
					ci.setStartYear(startYear);
					ci.setEndYear(endYear);
					ci.setStudNumber(studNumber);
					ci.setDegreeId(degreeId);
					session.save(ci);
					t=session.beginTransaction();
					System.out.println("COLLEGE INFO INSERTED ");
					
					}
					catch(Exception e){
						e.printStackTrace();  
						t.rollback();
					}
					finally{
					session.close();
					}
				
				}break;
				
			case 2: 
				System.out.println("1.Student\t\n2:Permanent Address\n3:Student Course\n");
				int choice1;
				choice1=Integer.parseInt(brc.readLine());
				switch(choice1){
					case 1:
						try{
							SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
							session=sf.openSession();
							String studentNumber,password,DOB,email,firstName,lastName,sex,currentAddress,permanentAddress,status;
							int currentPhone;
							int permanentPhone;
							String DOJ;
							System.out.println("Enter the Student Number");
							studentNumber=brc.readLine();
							System.out.println("Enter the Student Password");
							password=brc.readLine();
							System.out.println("Enter the Student Dob");
							DOB=brc.readLine();
							System.out.println("Enter the Student Email");
							email=brc.readLine();
							System.out.println("Enter the Student Firstname");
							firstName=brc.readLine();
							System.out.println("Enter the Student Lsstname");
							lastName=brc.readLine();
							System.out.println("Enter the Student Sex");
							sex=brc.readLine();
							System.out.println("Enter the Student Current Address");
							currentAddress=brc.readLine();
							System.out.println("Enter the Student status");
							status=brc.readLine();
							System.out.println("Enter the Student Permanent Address");
							permanentAddress=brc.readLine();
							System.out.println("Enter the Student Current Phone Number");
							currentPhone=Integer.parseInt(brc.readLine());
							System.out.println("Enter the Student Permanent Phone Number");
							permanentPhone=Integer.parseInt(brc.readLine());
							System.out.println("Enter the Student Date Of Join");
							DOJ=brc.readLine();
						Student s1=new Student();
							s1.setStudentNumber(studentNumber);
							s1.setPassword(password);
							s1.setCurrentAddress(currentAddress);
							s1.setCurrentPhone(currentPhone);
							s1.setDOB(DOB);
							s1.setDOJ(DOJ);
							s1.setEmail(email);
							s1.setFirstName(firstName);
							s1.setLastName(lastName);
							s1.setPermanentAddress(permanentAddress);
							s1.setPermanentPhone(permanentPhone);
							s1.setStatus(status);
							s1.setSex(sex);
							session.save(s1);
							t=session.beginTransaction();
							System.out.println("COLLEGE INFO INSERTED ");
							
				}			
						catch(Exception e){
							e.printStackTrace();  
							t.rollback();
						}
						finally{
						session.close();
						}break;
					case 2:
						try{
							SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
							session=sf.openSession();
							 String studentNumber;
							 String firstName;
						     String lastName;
							 String city;
							 String state;
							 String zipcode;
							 	System.out.println("Enter the Student Number");
								studentNumber=brc.readLine();
								System.out.println("Enter the Student Firstname");
								firstName=brc.readLine();
								System.out.println("Enter the Student LastName");
								lastName=brc.readLine();
								System.out.println("Enter the Student city");
								city=brc.readLine();
								System.out.println("Enter the Student state");
								state=brc.readLine();
								System.out.println("Enter the Student Current zipcode");
								zipcode=brc.readLine();
							permanentAddress pa1=new permanentAddress();
								pa1.setCity(city);
								pa1.setStudentNumber(studentNumber);
								pa1.setLastName(lastName);
								pa1.setZipcode(zipcode);
								pa1.setState(state);
								pa1.setFirstName(firstName);
								session.save(pa1);
								t=session.beginTransaction();
								System.out.println("COLLEGE INFO INSERTED ");
							}
						catch(Exception e){
							e.printStackTrace();  
							t.rollback();
						}
						finally{
						session.close();
						}break;
					case 3:
						try{
							SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
							session=sf.openSession();
							int courseId;
							String courseName;
							String grade;
							int hours;
							String studentNumber;
							String courseNumber;
							String offeringDepartment;
							System.out.println("Enter the CourseId");
							courseId=Integer.parseInt(brc.readLine());
							System.out.println("Enter the CourseName");
							courseName=brc.readLine();
							System.out.println("Enter the CourseNumber");
							courseName=brc.readLine();
							System.out.println("Enter the grade");
							grade=brc.readLine();
							System.out.println("Enter the hours");
							hours=Integer.parseInt(brc.readLine());
							System.out.println("Enter the studentNumber");
							studentNumber=brc.readLine();
							System.out.println("Enter the courseNumber");
							courseNumber=brc.readLine();
							System.out.println("Enter the offeringDepartment");
							offeringDepartment=brc.readLine();
						studentCourses sc1=new studentCourses();
							sc1.setCourseId(courseId);
							sc1.setCourseName(courseName);
							sc1.setCourseNumber(courseNumber);
							sc1.setGrade(grade);
							sc1.setHours(hours);
							sc1.setOfferingDepartment(offeringDepartment);
							sc1.setStudentNumber(studentNumber);
							session.save(sc1);
							t=session.beginTransaction();
							System.out.println("COLLEGE INFO INSERTED ");
						}
						catch(Exception e){
							e.printStackTrace();  
							t.rollback();
						}
						finally{
						session.close();
						}break;
					default:
						System.out.println("saghjsjk");
						break;	
				}}}}
			
			  
			
