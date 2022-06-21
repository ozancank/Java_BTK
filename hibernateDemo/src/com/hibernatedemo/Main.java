package com.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
//			List<String> countryCodes = session.createQuery("select c.countryCode from City c GROUP BY c.countryCode").getResultList();
//
//			for (String countryCode : countryCodes) {
//				System.out.println(countryCode);
//			}

//			City city = new City();
//			city.setName("Düzce 10");
//			city.setCountryCode("TUR");
//			city.setDistrict("Karadeniz");
//			city.setPopulation(100000);
//			
//			session.save(city);

//			City city = session.get(City.class, 4082);
//			city.setPopulation(110000);
//			session.save(city);

			City city = session.get(City.class, 4082);
			session.delete(city);
			
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}
}
