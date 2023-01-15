package com.bulk;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.session.Address;

public class RestrictionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configObj = new Configuration();
		configObj.configure();

		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();

		Session sessionObj = sessionFactoryObj.openSession();

		Criteria criteriaObj = sessionObj.createCriteria("com.session.Address"); // select * from emp_tab

		Criterion criterionObj1 = Restrictions.eq("streetName", "Vidyanagar"); // empl_gender = 'M'
		Criterion criterionObj2 = Restrictions.gt("zipCode", 1); // emplId > 102

		criteriaObj.add(criterionObj1); // select * from emp_tab where empl_gender = 'M'
		criteriaObj.add(criterionObj2); // select * from emp_tab where empl_gender = 'M' and id > 105

		List<Address> listObj = criteriaObj.list();

		Iterator<Address> itrObj = listObj.iterator();

		while (itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}

	}

}
