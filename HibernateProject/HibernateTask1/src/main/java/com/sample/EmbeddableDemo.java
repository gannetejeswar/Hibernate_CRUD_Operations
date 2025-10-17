package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		Student st1=new Student(1001,"Raju",9676136994L);
		
		Course c1=new Course(2001,"hibernate","15Days");
		st1.setCourse(c1);
		
		Student st2=new Student(1002,"Raju",9676136994L);
		Course c2=new Course(2002,"SpringBoot","30Days");
		st2.setCourse(c2);
		

		session.save(st1);
		session.save(st2);

		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		/*
		
		
		Student s1=(Student)session.get(Student.class, 1001);
		System.out.println(s1.getStid());
		System.out.println(s1.getStname());
		System.out.println(s1.getStcontact());
		System.out.println(s1.getCourse().getCid());
		System.out.println(s1.getCourse().getCname());
		System.out.println(s1.getCourse().getCduration());
		*/
		session.close();
		factory.close();
	}

}
