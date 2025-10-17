package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
        /*
        Transaction transaction=session.beginTransaction();
        Developer d1=new Developer();
        d1.setDid(101);
        d1.setDname("teja");
        Developer d2=new Developer();
        d2.setDid(102);
        d2.setDname("raju");
        List<Developer> dlist=new ArrayList<Developer>();
        Project p1=new Project();
        p1.setPid(201);
        p1.setPname("Ecommerce");
        
        Project p2=new Project();
        p2.setPid(202);
        p2.setPname("Banking");
        
        Project p3=new Project();
        p3.setPid(203);
        p3.setPname("Website");
        
        Project p4=new Project();
        p4.setPid(204);
        p4.setPname("Mobile");
        
        List<Project> plist=new ArrayList<Project>();
        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
        plist.add(p4);
        
        d1.setProject(plist);
        d2.setProject(plist);
 
        p1.setDeveloper(dlist);
        p2.setDeveloper(dlist);
        p3.setDeveloper(dlist);
        p4.setDeveloper(dlist);
        
        session.save(d1);
        session.save(d2);
        session.save(p1);
        session.save(p2);
        session.save(p3);
        session.save(p4);
        
        transaction.commit();
        */
		//fetch project list for a developer
		Developer de1=(Developer)session.get(Developer.class,102);
		System.out.println(de1.getDname());
		
		for(Project p: de1.getProject()) {
			System.out.println(p.getPname());
		}
		
	System.out.println("++++++++++++++++");
	Project pr1=(Project)session.get(Project.class,204);
	System.out.println(pr1.getPname());
	
	for(Developer d:pr1.getDeveloper()) {
		System.out.println(d.getDname());
	}
        session.close();
        factory.close();
        

	}

	private static Object Developer() {
		// TODO Auto-generated method stub
		return null;
	}

}
