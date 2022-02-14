package dao;

import java.util.List;


import pojo.EmployeePojo;


//import pojo.CustomerPojo;


public interface EmployeeDao {
	// Read - fetch all books
				// Read - fetch all books
					List<EmployeePojo> AllRecord();
					// Create
					EmployeePojo addRecord(EmployeePojo employeePojo);
					// Update
					EmployeePojo updateRecord(EmployeePojo employeePojo);
					// Delete
					EmployeePojo deleteRecord(int employeeId);
					// Read - fetch a book
					EmployeePojo fetchARecord(int employeeId);
				
 
}
/////////////////////////////////////
