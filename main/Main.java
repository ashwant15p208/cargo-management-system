package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.order.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) throws IOException {  
		 int ProdId;
		 String ProdName;
		 String ProdPrice;
		 String ProdDesc;
		 String ProdSeller;
	
	SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=sf.openSession();
	    Transaction t=session.beginTransaction();
	BufferedReader brc = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the Name:");
	ProdName=brc.readLine();
	System.out.println("Enter the ID:");
	ProdId=Integer.parseInt(brc.readLine());
	System.out.println("Enter the Price:");
	ProdPrice=brc.readLine();
	System.out.println("Enter the Description:");
	ProdDesc=brc.readLine();
	System.out.println("Enter the Seller Name:");
	ProdSeller=brc.readLine();
	 
	
	  
	    Product p1=new Product();
	    p1.setProdId(ProdId);
	    p1.setProdName(ProdName);
	    p1.setProdPrice(ProdPrice);
	    p1.setProdDesc(ProdDesc);
	    p1.setProdSeller(ProdSeller);
	    session.save(p1);  
	  
	      
	    t.commit();  
	    session.close();  
	    System.out.println("success");  

	}  

}