package com.bulk;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configObj = new Configuration();
		configObj.configure();

		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();

		Session sessionObj = sessionFactoryObj.openSession();
		
		
		Criteria criteriaObj = sessionObj.createCriteria("com.session.Address");  // select * from Emp_Tab
		
		ProjectionList projList =  Projections.projectionList();
		projList.add(Projections.property("zipCode"));
		projList.add(Projections.property("streetName"));
		
		criteriaObj.setProjection(projList);   // select empl_Id, empl_Name from Emp_Tab
		
		List<Object[]> rows = criteriaObj.list();
		
		Iterator<Object[]> itrObj = rows.iterator();
		
		while(itrObj.hasNext()) {
			   Object[] row = itrObj.next();
			   System.out.println(row[0] +" --- "+row[1]);
		}

		
	}

}
