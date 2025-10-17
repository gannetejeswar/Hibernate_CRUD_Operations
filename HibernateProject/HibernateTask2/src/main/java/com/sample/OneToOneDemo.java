package com.sample;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        
        
        //1st person object
        
        Person p1=new Person();
        p1.setPid(1001);
        p1.setPname("teja");
        
        BloodGroup b1=new BloodGroup();
        b1.setBgid(1);
        b1.setBgname("A+");
        
        p1.setBg(b1);
        
        //2st person object
        
        Person p2=new Person();
        p2.setPid(1002);
        p2.setPname("raju");
        
        BloodGroup b2=new BloodGroup();
        b2.setBgid(2);
        b2.setBgname("A-");
        
        p2.setBg(b2);
        
        session.save(p1);
        session.save(p2);
        session.save(b1);
        session.save(b2);
        
        transaction.commit();
        
        session.close();
        factory.close();
        
        
        
	}

}
