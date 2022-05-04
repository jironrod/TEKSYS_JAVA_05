package com.ironrod.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		
//		ManyToOne Relationship
		Department dep = new Department();
		dep.setDepartmentName("IT");

		Department dep2 = new Department();
		dep2.setDepartmentName("HR");

		Teacher t1 = new Teacher();
		t1.setDepartment(dep);
		t1.setSalary("1000");
		t1.setTeacherName("MHaseeb");

		Teacher t2 = new Teacher();
		t2.setDepartment(dep);
		t2.setSalary("2220");
		t2.setTeacherName("Shahparan");

		Teacher t3 = new Teacher();
		t3.setDepartment(dep);
		t3.setSalary("30000");
		t3.setTeacherName("James");

		Teacher t4 = new Teacher();
		t4.setDepartment(dep2);
		t4.setSalary("40000");
		t4.setTeacherName("Joseph");

		session.save(dep);
		session.save(dep2);
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		t.commit();
	}
}
