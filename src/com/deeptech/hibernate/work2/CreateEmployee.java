package com.deeptech.hibernate.work2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work2.dto.Employee;
import com.deeptech.hibernate.work2.utility.HibernateUtil;

public class CreateEmployee {

	public static void main(String args[]) {
		Employee e = new Employee();
		e.setEmpname("Aaftab");
		e.setDesignation("Developer");
		e.setSalary(10000);
		SessionFactory sf = HibernateUtil.con();
		Session sss = sf.openSession();
		sss.beginTransaction();
		sss.save(e);
		sss.getTransaction().commit();
		System.out.println("RECORD INSERTED!");
	
		sss.close();
		sf.close();
	}
	
}
