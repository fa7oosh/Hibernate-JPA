package com.deeptech.hibernate.work2.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionfactory;//imp to connect to db
	static {
		sessionfactory = new Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory con() {
		return sessionfactory;
	}
}
