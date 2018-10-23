package pkg;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Operations {

	public static void insert(Attendence a) {
		int i=0;    
		  
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		 Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		  
		i=(Integer)session.save(a);    
		  
		t.commit();    
		session.close();
		
	}
	public static void acalc(Calc c) throws ClassNotFoundException, SQLException {
		
		Configuration cfg=new Configuration();
		cfg.configure("hib.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Criteria crit=session.createCriteria(Calc.class);
		
		
		List list = crit.list();
		   System.out.println(list.isEmpty());
		for(Iterator iterator=list.iterator();iterator.hasNext();){
        	Calc e=(Calc) iterator.next();
        	   System.out.println("hello2");
        	System.out.print("id "+e.getSid());
        	System.out.print("   status"+e.getReason());
		}
		
		
		
	}
}
