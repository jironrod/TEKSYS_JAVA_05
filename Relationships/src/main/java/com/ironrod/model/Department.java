package com.ironrod.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int department_id;
	private String departmentName;

	@OneToMany(targetEntity = Teacher.class, cascade = { CascadeType.ALL })
	private List<?> teacherList;

	public Department(int department_id, String dname) {
		super();
		this.department_id = department_id;
		this.departmentName = dname;
	}

	public Department() {

	}

	public List<?> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<?> teacherList) {
		this.teacherList = teacherList;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
