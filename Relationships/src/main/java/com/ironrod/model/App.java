package com.ironrod.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		/*-- ManyToOne Relationship --
		
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
		
		t.commit();*/

//		-- OneToMany Relationship --
		
		Teacher t1 = new Teacher();
		t1.setTeacherName("Haseeb");
		t1.setSalary("100");

		Teacher t2 = new Teacher();
		t2.setTeacherName("Jenny Finch");
		t2.setSalary("10000");

		Teacher t3 = new Teacher();
		t3.setTeacherName("James");
		t3.setSalary("25000");

		Teacher t4 = new Teacher();
		t4.setTeacherName("SID ROSE");
		t4.setSalary("3000");

		Teacher t5 = new Teacher();
		t5.setSalary("200");
		t5.setTeacherName("Ali");

		// Add teacher entity object to the list
		List<Teacher> teachlist = new ArrayList<>();
		teachlist.add(t1);
		teachlist.add(t2);
		teachlist.add(t3);
		teachlist.add(t4);
		teachlist.add(t5);
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);

		// Create Department
		Department department = new Department();
		department.setDepartmentName("Development");
		department.setTeacherList(teachlist);

		// Store Department
		session.save(department);
		t.commit();

	}
}
