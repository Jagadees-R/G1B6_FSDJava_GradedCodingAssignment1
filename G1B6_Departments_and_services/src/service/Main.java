package service;

import departments.AdminDepartment;
import departments.HrDepartment;
import departments.TechDepartment;

public class Main 
{
	public static void main(String[] args) 
	{
		AdminDepartment adminDept = new AdminDepartment();
		adminDept.display();
		HrDepartment hrDept = new HrDepartment();
		hrDept.display();
		TechDepartment techDept = new TechDepartment();
		techDept.display();
	}

}
