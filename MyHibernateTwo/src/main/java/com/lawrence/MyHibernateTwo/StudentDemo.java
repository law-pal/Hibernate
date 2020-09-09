package com.lawrence.MyHibernateTwo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class StudentDemo {
 public static void main(String[] args) {
	
	 Student student1 = new Student();
	 Student student2 = new Student();
	 
	 student1.setId(4);
	 student1.setEmail("lawrence@fake.com");
	 student1.setFirstName("Lawrence");
	 student1.setLastName("Palacios");
	 
	 student2.setId(5);
	 student2.setEmail("John@fake.com");
	 student2.setFirstName("John");
	 student2.setLastName("Secada");
	 
	
	 Configuration con= new Configuration().configure().addAnnotatedClass(Student.class);
	
	 SessionFactory sf = con.buildSessionFactory();
	
	 Session session = sf.openSession();
	
	 Transaction ts = session.beginTransaction();
	
	 session.save(student1);
	 session.save(student2);
	
	 ts.commit();
 }
}

