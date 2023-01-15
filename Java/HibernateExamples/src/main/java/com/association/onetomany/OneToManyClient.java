package com.association.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configObj = new Configuration();
		configObj.configure();
		
		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();
		
		Session sessionObj = sessionFactoryObj.openSession();
		
		Transaction tobj = sessionObj.beginTransaction();
		
		Cart ct = new Cart(1234, "Shravan", 50000, null);
		Item it = new Item(3456, "J2SE", 25000);
		Item it2 = new Item(9456, "J2EE", 25000);
		
		List<Item> item = new ArrayList<Item>();
		
		item.add(it);
		item.add(it2);
		
		ct.setItems(item);
		
		sessionObj.save(ct);
		sessionObj.save(it);
		sessionObj.save(it2);
		
		tobj.commit();
		
		sessionObj.close();
		
				
		
		
	}

}
